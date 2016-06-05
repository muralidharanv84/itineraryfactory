package net.muralidharan.itineraryfactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private final String LOG_TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeAirportTextViews();
        initializeFindFlightsButton();
        initializeDatePicker();
    }

    protected void initializeAirportTextViews()
    {
        final int THRESHOLD = 2;
        final DelayAutoCompleteTextView fromCityTextView =
                (DelayAutoCompleteTextView) findViewById(R.id.from_city);
        fromCityTextView.setThreshold(THRESHOLD);
        fromCityTextView.setAdapter(new AirportAutoCompleteAdapter(this)); // 'this' is Activity instance
        fromCityTextView.setLoadingIndicator(
                (android.widget.ProgressBar) findViewById(R.id.from_city_loading_indicator));
        fromCityTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Airport airport = (Airport) adapterView.getItemAtPosition(position);
                fromCityTextView.setText(airport.getAirportCode());
            }
        });

        final DelayAutoCompleteTextView toCityTextView =
                (DelayAutoCompleteTextView) findViewById(R.id.to_city);
        toCityTextView.setThreshold(THRESHOLD);
        toCityTextView.setAdapter(new AirportAutoCompleteAdapter(this)); // 'this' is Activity instance
        toCityTextView.setLoadingIndicator(
                (android.widget.ProgressBar) findViewById(R.id.to_city_loading_indicator));
        toCityTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Airport airport = (Airport) adapterView.getItemAtPosition(position);
                toCityTextView.setText(airport.getAirportCode());
            }
        });
    }

    protected void initializeFindFlightsButton() {
        Button findFlightsButton = (Button)findViewById(R.id.button_find_flights);
        final ProgressBar progressBar = (ProgressBar)findViewById(R.id.flights_loading_indicator);

        if (findFlightsButton != null) {
            findFlightsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String fromAirport = ((TextView)findViewById(R.id.from_city)).getText().toString();
                    String toAirport = ((TextView)findViewById(R.id.to_city)).getText().toString();
                    String depDate = ((TextView)findViewById(R.id.onward_date)).getText().toString();
                    String returnDate = ((TextView)findViewById(R.id.return_date)).getText().toString();
                    try {
                        progressBar.setVisibility(View.VISIBLE);
                        findFlights(fromAirport, toAirport, depDate, returnDate);
                    } catch (JSONException e) {
                        Log.e(LOG_TAG, "JSONException: ", e);
                        progressBar.setVisibility(View.GONE);
                    }
                }
            });
        } else {
            Log.w(LOG_TAG, "Could not find button to add clicklistener to!");
        }
    }

    protected void initializeDatePicker() {

        final TextView depDateTextView = (TextView)findViewById(R.id.onward_date);
        final TextView returnDateTextView = (TextView)findViewById(R.id.return_date);

        DateSetListener depDateSetListener = new DateSetListener(depDateTextView);
        DateSetListener returnDateSetListener = new DateSetListener(returnDateTextView);

        DateViewClickListener depDateClickListener = new DateViewClickListener(
                depDateTextView,
                depDateSetListener,
                getFragmentManager(),
                "depDate"
        );
        depDateClickListener.setMinDate(Calendar.getInstance());

        DateViewClickListener returnDateClickListener = new DateViewClickListener(
                returnDateTextView,
                returnDateSetListener,
                getFragmentManager(),
                "returnDate"
        );
        returnDateClickListener.setMinDate(Calendar.getInstance());
        depDateSetListener.registerClickListenerToSetMinDate(returnDateClickListener);

        depDateTextView.setOnClickListener(depDateClickListener);
        returnDateTextView.setOnClickListener(returnDateClickListener);
    }

    protected void findFlights(
            String fromAirport, String toAirport,String depDate, String returnDate) throws JSONException {

        FlightsQueryRequest request = new FlightsQueryRequest(getBaseContext(), fromAirport, toAirport);
        request.setDepDate(depDate);
        request.setReturnDate(returnDate);
        JSONObject requestJSON = request.getAPIRequestJSON(20, 2);
        Log.v(LOG_TAG, "RequestJSON: " + requestJSON);

        RequestQueue queue = Volley.newRequestQueue(request.getContext());
        final String BASE_URL = "https://www.googleapis.com/qpxExpress/v1/trips/search?key=" +
                getString(R.string.google_api_key);

        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.flights_loading_indicator);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                BASE_URL,
                requestJSON,
                new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                try {
                    Log.v(LOG_TAG, "Received response: " + response.toString(4));
                } catch (JSONException e) {
                    Log.v(LOG_TAG, "Invalid JSON? ", e);
                } finally {
                    progressBar.setVisibility(View.GONE);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(LOG_TAG, "Received error response: " + error.getMessage() );
                progressBar.setVisibility(View.GONE);
            }
        });

        jsonObjectRequest.setRetryPolicy(new DefaultRetryPolicy(
                120000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(jsonObjectRequest);
    }
}
