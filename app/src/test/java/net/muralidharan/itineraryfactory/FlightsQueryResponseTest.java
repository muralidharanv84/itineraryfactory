package net.muralidharan.itineraryfactory;

import org.junit.Assert;
import org.junit.Test;

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
}
