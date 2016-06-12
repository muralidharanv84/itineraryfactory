package net.muralidharan.itineraryfactory;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by muralidharan on 6/9/16.
 */
public class FlightsQueryResponse {

    private static final String LOG_TAG  = FlightsQueryResponse.class.getSimpleName();

    // Flight logos are available here:
    // http://pics.avs.io/<width>/<height>/<iata>.png

    public FlightsQueryResponse() {
    }

    public static FlightsQueryResponse parseFrom(JSONObject responseJSON) throws JSONException {
        FlightsQueryResponse response = new FlightsQueryResponse();
        JSONObject dataJSON = responseJSON.getJSONObject("data");

        JSONArray citiesJSON = dataJSON.getJSONArray("city");
        Map<String, String> cityCodeToName = new HashMap<String, String>();
        if (citiesJSON != null) {
            for (int i = 0; i < citiesJSON.length(); i++) {
                JSONObject cityJSON = citiesJSON.getJSONObject(i);
                String cityCode = cityJSON.getString("code");
                String cityName = cityJSON.getString("name");

                if (!isEmpty(cityCode) && !isEmpty(cityName)) {
                    cityCodeToName.put(cityCode, cityName);
                }
            }
        }

        JSONArray airportsJSON = dataJSON.getJSONArray("airport");
        Map<String, Airport> airports = new HashMap<String, Airport>();
        if (airportsJSON != null) {
            for (int i = 0; i < airportsJSON.length(); i++) {
                JSONObject airportJSON = airportsJSON.getJSONObject(i);

                String airportCode = airportJSON.getString("code");
                String airportName = airportJSON.getString("name");
                String airportCityCode = airportJSON.getString("city");
                if (!isEmpty(airportName) && !isEmpty(airportCode)) {
                    Airport airport = new Airport(airportCode, airportName);
                    if (!isEmpty(airportCityCode)) {
                        String airportCityName = cityCodeToName.get(airportCityCode);
                        if (!isEmpty(airportCityName)) {
                            airport.setCity(airportCityName);
                        }
                    }
                    airports.put(airportCode, airport);
                }
            }
        }

        JSONArray carriersJSON = dataJSON.getJSONArray("carrier");
        Map<String, String> carriers = new HashMap<String, String>();
        if (carriersJSON != null) {
            for(int i = 0; i < carriersJSON.length(); i++) {
                JSONObject carrierJSON = carriersJSON.getJSONObject(i);
                String carrierCode = carrierJSON.getString("code");
                String carrierName = carrierJSON.getString("name");

                if (!isEmpty(carrierCode) && !isEmpty(carrierName)) {
                    carriers.put(carrierCode, carrierName);
                }
            }
        }

        JSONArray tripOptionsJSON = dataJSON.getJSONArray("tripOption");

        for (int i = 0; i < tripOptionsJSON.length(); i++) {
            JSONObject tripOptionJSON = (JSONObject) tripOptionsJSON.getJSONObject(i);
        }
        return response;
    }

    public static float getFloatPrice(String priceStr) throws NumberFormatException {
        priceStr = priceStr.replaceAll("[^\\d.]", "");
        return Float.parseFloat(priceStr);
    }

    public static boolean isEmpty(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
