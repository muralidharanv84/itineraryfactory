package net.muralidharan.itineraryfactory;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.List;

/**
 * Created by muralidharan on 6/9/16.
 */
public class FlightsQueryResponseTest {

    @Test
    public void parsing_from_API_isCorrect() {
        Assert.assertEquals(
                FlightsQueryResponse.getFloatPrice("USD254.45"),
                254.45f,
                0.001f);
        Assert.assertEquals(
                FlightsQueryResponse.getFloatPrice("INR 1232.23"),
                1232.23f,
                0.001f);
    }

    @Test(expected = NumberFormatException.class)
    public void parsing_from_API_error() {
        FlightsQueryResponse.getFloatPrice("aasdfasdf sdfasdf123.123.");
    }

    @Test
    public void parsing_from_json_isCorrect() throws JSONException {
        JSONObject jsonObject = new JSONObject(FlightQueryRequestJSON.TEST_JSON);
        FlightsQueryResponse flightsQueryResponse = FlightsQueryResponse.parseFrom(jsonObject);

        Assert.assertNotNull(flightsQueryResponse.getFlightOptions());
        Assert.assertEquals(flightsQueryResponse.getFlightOptions().size(), 3);

        FlightOption thirdOption = flightsQueryResponse.getFlightOptions().get(2);

        Assert.assertEquals(thirdOption.getNumAdults(), 2);
        Assert.assertEquals(thirdOption.getNumChildren(), 2);

        float adultsBasePrice = thirdOption.getAdultsBasePrice();
        float adultsTax = thirdOption.getAdultsTax();
        float childrenBasePrice = thirdOption.getChildrenBasePrice();
        float childrenTax = thirdOption.getChildrenTax();

        Assert.assertEquals(
                adultsBasePrice,
                1517.00,
                0.001);
        Assert.assertEquals(
                adultsTax,
                95.86,
                0.001);

        Assert.assertEquals(
                childrenBasePrice,
                1275.00,
                0.001);
        Assert.assertEquals(
                childrenTax,
                95.86,
                0.001);

        Assert.assertEquals(
                thirdOption.getTotalPrice(),
                5967.44,
                0.001
        );

        List<FlightSlice> flightSlices = thirdOption.getFlightSlices();
        Assert.assertEquals(flightSlices.size(), 2);

        FlightSlice firstSlice = flightSlices.get(0);
        FlightSlice secondSlice = flightSlices.get(1);

        Assert.assertEquals(firstSlice.getDurationMins(), 1310);
        List<FlightSegment> firstSliceSegments = firstSlice.getFlightSegments();
        Assert.assertEquals(firstSliceSegments.size(), 2);
        Assert.assertEquals(firstSlice.getConnectionsMins().size(), 1);
        Assert.assertEquals((int)firstSlice.getConnectionsMins().get(0), 100);

        Assert.assertEquals(firstSliceSegments.get(0).getAirline(), "Etihad Airways");
        Assert.assertEquals(firstSliceSegments.get(1).getAirline(), "Etihad Airways");

        Assert.assertEquals(firstSliceSegments.get(0).getDepartureAirport().getCity(), "San Francisco");
        Assert.assertEquals(firstSliceSegments.get(0).getDestAirport().getCity(), "Abu Dhabi");
        Assert.assertEquals(firstSliceSegments.get(1).getDepartureAirport().getCity(), "Abu Dhabi");
        Assert.assertEquals(firstSliceSegments.get(1).getDestAirport().getCity(), "Hyderabad");

        Assert.assertEquals(secondSlice.getDurationMins(), 1625);
        List<FlightSegment> secondSliceSegments = secondSlice.getFlightSegments();
        Assert.assertEquals(secondSliceSegments.size(), 2);
        Assert.assertEquals(secondSlice.getConnectionsMins().size(), 1);
        Assert.assertEquals((int)secondSlice.getConnectionsMins().get(0), 430);

        Assert.assertEquals(secondSliceSegments.get(0).getAirline(), "Etihad Airways");
        Assert.assertEquals(secondSliceSegments.get(1).getAirline(), "Etihad Airways");

        Assert.assertEquals(secondSliceSegments.get(0).getDepartureAirport().getCity(), "Hyderabad");
        Assert.assertEquals(secondSliceSegments.get(0).getDestAirport().getCity(), "Abu Dhabi");
        Assert.assertEquals(secondSliceSegments.get(1).getDepartureAirport().getCity(), "Abu Dhabi");
        Assert.assertEquals(secondSliceSegments.get(1).getDestAirport().getCity(), "San Francisco");

    }

    @Test
    public void parsing_date_isCorrect() {
        String testStr1 = "2016-06-16T12:35+04:00";

        Calendar cal1 = FlightsQueryResponse.parseDateAndTime(testStr1);
//        Assert.assertEquals(cal1.getTimeZone().getID(), "GMT+04:00");

        Calendar testCal1 = Calendar.getInstance();
        testCal1.set(2016, 06, 16, 12, 35, 0);
        Assert.assertEquals(cal1.getTime().toString(), testCal1.getTime().toString());
//        Assert.assertEquals(cal1.getTime().toString(), "2016-06-16T12:35+04:00");
//        Assert.assertEquals(testRet1.length, 2);
//        Assert.assertEquals(testRet1[0], "2016-06-16");
//        Assert.assertEquals(testRet1[1], "12:35");
//
        String testStr2 = "2016-06-15T09:40-07:00";
        Calendar cal2 = FlightsQueryResponse.parseDateAndTime(testStr2);
        Calendar testCal2 = Calendar.getInstance();
        testCal2.set(2016, 06, 15, 9, 40, 0);
//        Assert.assertEquals(cal2.getTimeZone().getID(), "GMT-07:00");
//        Assert.assertEquals(testRet2.length, 2);
//        Assert.assertEquals(testRet2[0], "2016-06-15");
//        Assert.assertEquals(testRet2[1], "09:40");
    }
}
