package net.muralidharan.itineraryfactory;

/**
 * Created by muralidharan on 6/12/16.
 *
 * Example JSON returned from the QPX Express API.
 *
 * Look at http://www.jsoneditoronline.org/?id=a48b7793f152027a708e95f791962073
 * for a formatted view of an example JSON response.
 *
 */
public class FlightQueryRequestJSON {
    public static final String TEST_JSON = "" +
            "{\n" +
            " \"kind\": \"qpxExpress#tripsSearch\",\n" +
            " \"trips\": {\n" +
            "  \"kind\": \"qpxexpress#tripOptions\",\n" +
            "  \"requestId\": \"Gg8Ncckq35TnYN0NT0OWC3\",\n" +
            "  \"data\": {\n" +
            "   \"kind\": \"qpxexpress#data\",\n" +
            "   \"airport\": [\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#airportData\",\n" +
            "     \"code\": \"AUH\",\n" +
            "     \"city\": \"AUH\",\n" +
            "     \"name\": \"Abu Dhabi International\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#airportData\",\n" +
            "     \"code\": \"DEL\",\n" +
            "     \"city\": \"DEL\",\n" +
            "     \"name\": \"Delhi Indira Gandhi International\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#airportData\",\n" +
            "     \"code\": \"HYD\",\n" +
            "     \"city\": \"HYD\",\n" +
            "     \"name\": \"Hyderabad Rajiv Gandhi International\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#airportData\",\n" +
            "     \"code\": \"SFO\",\n" +
            "     \"city\": \"SFO\",\n" +
            "     \"name\": \"San Francisco International\"\n" +
            "    }\n" +
            "   ],\n" +
            "   \"city\": [\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#cityData\",\n" +
            "     \"code\": \"AUH\",\n" +
            "     \"name\": \"Abu Dhabi\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#cityData\",\n" +
            "     \"code\": \"DEL\",\n" +
            "     \"name\": \"Delhi\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#cityData\",\n" +
            "     \"code\": \"HYD\",\n" +
            "     \"name\": \"Hyderabad\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#cityData\",\n" +
            "     \"code\": \"SFO\",\n" +
            "     \"name\": \"San Francisco\"\n" +
            "    }\n" +
            "   ],\n" +
            "   \"aircraft\": [\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#aircraftData\",\n" +
            "     \"code\": \"321\",\n" +
            "     \"name\": \"Airbus A321\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#aircraftData\",\n" +
            "     \"code\": \"73H\",\n" +
            "     \"name\": \"Boeing 737\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#aircraftData\",\n" +
            "     \"code\": \"77L\",\n" +
            "     \"name\": \"Boeing 777\"\n" +
            "    }\n" +
            "   ],\n" +
            "   \"tax\": [\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#taxData\",\n" +
            "     \"id\": \"WO_001\",\n" +
            "     \"name\": \"Indian Passenger Service Fee\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#taxData\",\n" +
            "     \"id\": \"XY\",\n" +
            "     \"name\": \"US Immigration Fee\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#taxData\",\n" +
            "     \"id\": \"IN\",\n" +
            "     \"name\": \"Indian User Development Fee\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#taxData\",\n" +
            "     \"id\": \"AY_001\",\n" +
            "     \"name\": \"US September 11th Security Fee\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#taxData\",\n" +
            "     \"id\": \"US_002\",\n" +
            "     \"name\": \"US International Departure Tax\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#taxData\",\n" +
            "     \"id\": \"YR_F\",\n" +
            "     \"name\": \"EY YR surcharge\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#taxData\",\n" +
            "     \"id\": \"XA\",\n" +
            "     \"name\": \"USDA APHIS Fee\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#taxData\",\n" +
            "     \"id\": \"YC\",\n" +
            "     \"name\": \"US Customs Fee\"\n" +
            "    },\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#taxData\",\n" +
            "     \"id\": \"XF\",\n" +
            "     \"name\": \"US Passenger Facility Charge\"\n" +
            "    }\n" +
            "   ],\n" +
            "   \"carrier\": [\n" +
            "    {\n" +
            "     \"kind\": \"qpxexpress#carrierData\",\n" +
            "     \"code\": \"EY\",\n" +
            "     \"name\": \"Etihad Airways\"\n" +
            "    }\n" +
            "   ]\n" +
            "  },\n" +
            "  \"tripOption\": [\n" +
            "   {\n" +
            "    \"kind\": \"qpxexpress#tripOption\",\n" +
            "    \"saleTotal\": \"USD5967.44\",\n" +
            "    \"id\": \"HeNu4LJSod2UH8jqr4m5OA001\",\n" +
            "    \"slice\": [\n" +
            "     {\n" +
            "      \"kind\": \"qpxexpress#sliceInfo\",\n" +
            "      \"duration\": 1310,\n" +
            "      \"segment\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentInfo\",\n" +
            "        \"duration\": 955,\n" +
            "        \"flight\": {\n" +
            "         \"carrier\": \"EY\",\n" +
            "         \"number\": \"182\"\n" +
            "        },\n" +
            "        \"id\": \"GHqeP0U9A3xfNE+L\",\n" +
            "        \"cabin\": \"COACH\",\n" +
            "        \"bookingCode\": \"L\",\n" +
            "        \"bookingCodeCount\": 7,\n" +
            "        \"marriedSegmentGroup\": \"0\",\n" +
            "        \"leg\": [\n" +
            "         {\n" +
            "          \"kind\": \"qpxexpress#legInfo\",\n" +
            "          \"id\": \"LFzkwOkDM2GJsiCO\",\n" +
            "          \"aircraft\": \"77L\",\n" +
            "          \"arrivalTime\": \"2016-06-16T12:35+04:00\",\n" +
            "          \"departureTime\": \"2016-06-15T09:40-07:00\",\n" +
            "          \"origin\": \"SFO\",\n" +
            "          \"destination\": \"AUH\",\n" +
            "          \"originTerminal\": \"I\",\n" +
            "          \"destinationTerminal\": \"3\",\n" +
            "          \"duration\": 955,\n" +
            "          \"mileage\": 8141,\n" +
            "          \"meal\": \"Meal\",\n" +
            "          \"secure\": true\n" +
            "         }\n" +
            "        ],\n" +
            "        \"connectionDuration\": 100\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentInfo\",\n" +
            "        \"duration\": 255,\n" +
            "        \"flight\": {\n" +
            "         \"carrier\": \"EY\",\n" +
            "         \"number\": \"276\"\n" +
            "        },\n" +
            "        \"id\": \"GGtGF67MtJMYsbjv\",\n" +
            "        \"cabin\": \"COACH\",\n" +
            "        \"bookingCode\": \"L\",\n" +
            "        \"bookingCodeCount\": 7,\n" +
            "        \"marriedSegmentGroup\": \"0\",\n" +
            "        \"leg\": [\n" +
            "         {\n" +
            "          \"kind\": \"qpxexpress#legInfo\",\n" +
            "          \"id\": \"L+T+njmO8GA+abfP\",\n" +
            "          \"aircraft\": \"321\",\n" +
            "          \"arrivalTime\": \"2016-06-16T20:00+05:30\",\n" +
            "          \"departureTime\": \"2016-06-16T14:15+04:00\",\n" +
            "          \"origin\": \"AUH\",\n" +
            "          \"destination\": \"HYD\",\n" +
            "          \"originTerminal\": \"1\",\n" +
            "          \"duration\": 255,\n" +
            "          \"mileage\": 1610,\n" +
            "          \"meal\": \"Meal\"\n" +
            "         }\n" +
            "        ]\n" +
            "       }\n" +
            "      ]\n" +
            "     },\n" +
            "     {\n" +
            "      \"kind\": \"qpxexpress#sliceInfo\",\n" +
            "      \"duration\": 1330,\n" +
            "      \"segment\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentInfo\",\n" +
            "        \"duration\": 245,\n" +
            "        \"flight\": {\n" +
            "         \"carrier\": \"EY\",\n" +
            "         \"number\": \"277\"\n" +
            "        },\n" +
            "        \"id\": \"Ge2Ock0WlBx9ErO8\",\n" +
            "        \"cabin\": \"COACH\",\n" +
            "        \"bookingCode\": \"U\",\n" +
            "        \"bookingCodeCount\": 7,\n" +
            "        \"marriedSegmentGroup\": \"1\",\n" +
            "        \"leg\": [\n" +
            "         {\n" +
            "          \"kind\": \"qpxexpress#legInfo\",\n" +
            "          \"id\": \"Lnxe92aqnAxHBsqk\",\n" +
            "          \"aircraft\": \"321\",\n" +
            "          \"arrivalTime\": \"2016-06-22T00:20+04:00\",\n" +
            "          \"departureTime\": \"2016-06-21T21:45+05:30\",\n" +
            "          \"origin\": \"HYD\",\n" +
            "          \"destination\": \"AUH\",\n" +
            "          \"destinationTerminal\": \"1\",\n" +
            "          \"duration\": 245,\n" +
            "          \"mileage\": 1610,\n" +
            "          \"meal\": \"Meal\"\n" +
            "         }\n" +
            "        ],\n" +
            "        \"connectionDuration\": 125\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentInfo\",\n" +
            "        \"duration\": 960,\n" +
            "        \"flight\": {\n" +
            "         \"carrier\": \"EY\",\n" +
            "         \"number\": \"183\"\n" +
            "        },\n" +
            "        \"id\": \"GUhHyYqJ7Jnoq4O0\",\n" +
            "        \"cabin\": \"COACH\",\n" +
            "        \"bookingCode\": \"U\",\n" +
            "        \"bookingCodeCount\": 7,\n" +
            "        \"marriedSegmentGroup\": \"1\",\n" +
            "        \"leg\": [\n" +
            "         {\n" +
            "          \"kind\": \"qpxexpress#legInfo\",\n" +
            "          \"id\": \"LpIX4gtMQFVXC6Qf\",\n" +
            "          \"aircraft\": \"77L\",\n" +
            "          \"arrivalTime\": \"2016-06-22T07:25-07:00\",\n" +
            "          \"departureTime\": \"2016-06-22T02:25+04:00\",\n" +
            "          \"origin\": \"AUH\",\n" +
            "          \"destination\": \"SFO\",\n" +
            "          \"originTerminal\": \"3\",\n" +
            "          \"destinationTerminal\": \"I\",\n" +
            "          \"duration\": 960,\n" +
            "          \"mileage\": 8141,\n" +
            "          \"meal\": \"Meal\",\n" +
            "          \"secure\": true\n" +
            "         }\n" +
            "        ]\n" +
            "       }\n" +
            "      ]\n" +
            "     }\n" +
            "    ],\n" +
            "    \"pricing\": [\n" +
            "     {\n" +
            "      \"kind\": \"qpxexpress#pricingInfo\",\n" +
            "      \"fare\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#fareInfo\",\n" +
            "        \"id\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"carrier\": \"EY\",\n" +
            "        \"origin\": \"SFO\",\n" +
            "        \"destination\": \"HYD\",\n" +
            "        \"basisCode\": \"LHE6MUS/YV\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#fareInfo\",\n" +
            "        \"id\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"carrier\": \"EY\",\n" +
            "        \"origin\": \"HYD\",\n" +
            "        \"destination\": \"SFO\",\n" +
            "        \"basisCode\": \"UKBD6MUS/YS\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"segmentPricing\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"segmentId\": \"GHqeP0U9A3xfNE+L\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"segmentId\": \"Ge2Ock0WlBx9ErO8\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"segmentId\": \"GUhHyYqJ7Jnoq4O0\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"segmentId\": \"GGtGF67MtJMYsbjv\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"baseFareTotal\": \"USD1517.00\",\n" +
            "      \"saleFareTotal\": \"USD1517.00\",\n" +
            "      \"saleTaxTotal\": \"USD95.86\",\n" +
            "      \"saleTotal\": \"USD1612.86\",\n" +
            "      \"passengers\": {\n" +
            "       \"kind\": \"qpxexpress#passengerCounts\",\n" +
            "       \"adultCount\": 2\n" +
            "      },\n" +
            "      \"tax\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"YR_F\",\n" +
            "        \"chargeType\": \"CARRIER_SURCHARGE\",\n" +
            "        \"code\": \"YR\",\n" +
            "        \"salePrice\": \"USD1.10\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"US_002\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"US\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD17.80\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"AY_001\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"AY\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD5.60\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XF\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XF\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD4.50\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XA\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XA\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD3.96\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XY\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XY\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD7.00\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"YC\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"YC\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD5.50\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"US_002\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"US\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD17.80\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"WO_001\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"WO\",\n" +
            "        \"country\": \"IN\",\n" +
            "        \"salePrice\": \"USD3.40\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"IN\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"IN\",\n" +
            "        \"country\": \"IN\",\n" +
            "        \"salePrice\": \"USD29.20\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"fareCalculation\": \"SFO EY X/AUH EY HYD Q SFOHYD275.00 707.50LHE6MUS EY X/AUH EY SFO Q HYDSFO275.00 259.00UKBD6MUS NUC 1516.50 END ROE 1.00 FARE USD 1517.00 XT 5.50YC 7.00XY 3.96XA 35.60US 5.60AY 29.20IN 3.40WO 1.10YR 4.50XF SFO4.50\",\n" +
            "      \"latestTicketingTime\": \"2016-06-15T12:39-04:00\",\n" +
            "      \"ptc\": \"ADT\",\n" +
            "      \"refundable\": true\n" +
            "     },\n" +
            "     {\n" +
            "      \"kind\": \"qpxexpress#pricingInfo\",\n" +
            "      \"fare\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#fareInfo\",\n" +
            "        \"id\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"carrier\": \"EY\",\n" +
            "        \"origin\": \"SFO\",\n" +
            "        \"destination\": \"HYD\",\n" +
            "        \"basisCode\": \"LHE6MUSCH75/YV\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#fareInfo\",\n" +
            "        \"id\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"carrier\": \"EY\",\n" +
            "        \"origin\": \"HYD\",\n" +
            "        \"destination\": \"SFO\",\n" +
            "        \"basisCode\": \"UKBD6MUSCH75/YS\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"segmentPricing\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"segmentId\": \"GHqeP0U9A3xfNE+L\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"segmentId\": \"Ge2Ock0WlBx9ErO8\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"segmentId\": \"GUhHyYqJ7Jnoq4O0\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"segmentId\": \"GGtGF67MtJMYsbjv\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"baseFareTotal\": \"USD1275.00\",\n" +
            "      \"saleFareTotal\": \"USD1275.00\",\n" +
            "      \"saleTaxTotal\": \"USD95.86\",\n" +
            "      \"saleTotal\": \"USD1370.86\",\n" +
            "      \"passengers\": {\n" +
            "       \"kind\": \"qpxexpress#passengerCounts\",\n" +
            "       \"childCount\": 2\n" +
            "      },\n" +
            "      \"tax\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"YR_F\",\n" +
            "        \"chargeType\": \"CARRIER_SURCHARGE\",\n" +
            "        \"code\": \"YR\",\n" +
            "        \"salePrice\": \"USD1.10\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"US_002\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"US\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD17.80\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"AY_001\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"AY\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD5.60\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XF\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XF\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD4.50\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XA\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XA\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD3.96\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XY\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XY\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD7.00\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"YC\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"YC\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD5.50\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"US_002\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"US\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD17.80\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"WO_001\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"WO\",\n" +
            "        \"country\": \"IN\",\n" +
            "        \"salePrice\": \"USD3.40\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"IN\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"IN\",\n" +
            "        \"country\": \"IN\",\n" +
            "        \"salePrice\": \"USD29.20\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"fareCalculation\": \"SFO EY X/AUH EY HYD Q SFOHYD275.00 530.63LHE6MUS EY X/AUH EY SFO Q HYDSFO275.00 194.25UKBD6MUS NUC 1274.88 END ROE 1.00 FARE USD 1275.00 XT 5.50YC 7.00XY 3.96XA 35.60US 5.60AY 29.20IN 3.40WO 1.10YR 4.50XF SFO4.50\",\n" +
            "      \"latestTicketingTime\": \"2016-06-15T12:39-04:00\",\n" +
            "      \"ptc\": \"CNN\",\n" +
            "      \"refundable\": true\n" +
            "     }\n" +
            "    ]\n" +
            "   },\n" +
            "   {\n" +
            "    \"kind\": \"qpxexpress#tripOption\",\n" +
            "    \"saleTotal\": \"USD5967.44\",\n" +
            "    \"id\": \"HeNu4LJSod2UH8jqr4m5OA003\",\n" +
            "    \"slice\": [\n" +
            "     {\n" +
            "      \"kind\": \"qpxexpress#sliceInfo\",\n" +
            "      \"duration\": 1485,\n" +
            "      \"segment\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentInfo\",\n" +
            "        \"duration\": 955,\n" +
            "        \"flight\": {\n" +
            "         \"carrier\": \"EY\",\n" +
            "         \"number\": \"182\"\n" +
            "        },\n" +
            "        \"id\": \"GHqeP0U9A3xfNE+L\",\n" +
            "        \"cabin\": \"COACH\",\n" +
            "        \"bookingCode\": \"L\",\n" +
            "        \"bookingCodeCount\": 7,\n" +
            "        \"marriedSegmentGroup\": \"0\",\n" +
            "        \"leg\": [\n" +
            "         {\n" +
            "          \"kind\": \"qpxexpress#legInfo\",\n" +
            "          \"id\": \"LFzkwOkDM2GJsiCO\",\n" +
            "          \"aircraft\": \"77L\",\n" +
            "          \"arrivalTime\": \"2016-06-16T12:35+04:00\",\n" +
            "          \"departureTime\": \"2016-06-15T09:40-07:00\",\n" +
            "          \"origin\": \"SFO\",\n" +
            "          \"destination\": \"AUH\",\n" +
            "          \"originTerminal\": \"I\",\n" +
            "          \"destinationTerminal\": \"3\",\n" +
            "          \"duration\": 955,\n" +
            "          \"mileage\": 8141,\n" +
            "          \"meal\": \"Meal\",\n" +
            "          \"secure\": true\n" +
            "         }\n" +
            "        ],\n" +
            "        \"connectionDuration\": 90\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentInfo\",\n" +
            "        \"duration\": 225,\n" +
            "        \"flight\": {\n" +
            "         \"carrier\": \"EY\",\n" +
            "         \"number\": \"224\"\n" +
            "        },\n" +
            "        \"id\": \"GYqjfKgwtqdLuS8e\",\n" +
            "        \"cabin\": \"COACH\",\n" +
            "        \"bookingCode\": \"L\",\n" +
            "        \"bookingCodeCount\": 7,\n" +
            "        \"marriedSegmentGroup\": \"0\",\n" +
            "        \"leg\": [\n" +
            "         {\n" +
            "          \"kind\": \"qpxexpress#legInfo\",\n" +
            "          \"id\": \"Lr0p-WDNLgwrtejz\",\n" +
            "          \"aircraft\": \"77L\",\n" +
            "          \"arrivalTime\": \"2016-06-16T19:20+05:30\",\n" +
            "          \"departureTime\": \"2016-06-16T14:05+04:00\",\n" +
            "          \"origin\": \"AUH\",\n" +
            "          \"destination\": \"DEL\",\n" +
            "          \"originTerminal\": \"1\",\n" +
            "          \"destinationTerminal\": \"3\",\n" +
            "          \"duration\": 225,\n" +
            "          \"mileage\": 1414,\n" +
            "          \"meal\": \"Meal\"\n" +
            "         }\n" +
            "        ],\n" +
            "        \"connectionDuration\": 85\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentInfo\",\n" +
            "        \"duration\": 130,\n" +
            "        \"flight\": {\n" +
            "         \"carrier\": \"EY\",\n" +
            "         \"number\": \"8899\"\n" +
            "        },\n" +
            "        \"id\": \"G4-i6zledoTRRCV5\",\n" +
            "        \"cabin\": \"COACH\",\n" +
            "        \"bookingCode\": \"L\",\n" +
            "        \"bookingCodeCount\": 4,\n" +
            "        \"marriedSegmentGroup\": \"1\",\n" +
            "        \"leg\": [\n" +
            "         {\n" +
            "          \"kind\": \"qpxexpress#legInfo\",\n" +
            "          \"id\": \"Lvmi6V-P351uNcKq\",\n" +
            "          \"aircraft\": \"73H\",\n" +
            "          \"arrivalTime\": \"2016-06-16T22:55+05:30\",\n" +
            "          \"departureTime\": \"2016-06-16T20:45+05:30\",\n" +
            "          \"origin\": \"DEL\",\n" +
            "          \"destination\": \"HYD\",\n" +
            "          \"originTerminal\": \"3\",\n" +
            "          \"duration\": 130,\n" +
            "          \"operatingDisclosure\": \"OPERATED BY JET AIRWAYS\",\n" +
            "          \"mileage\": 787,\n" +
            "          \"meal\": \"Dinner\"\n" +
            "         }\n" +
            "        ]\n" +
            "       }\n" +
            "      ]\n" +
            "     },\n" +
            "     {\n" +
            "      \"kind\": \"qpxexpress#sliceInfo\",\n" +
            "      \"duration\": 1330,\n" +
            "      \"segment\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentInfo\",\n" +
            "        \"duration\": 245,\n" +
            "        \"flight\": {\n" +
            "         \"carrier\": \"EY\",\n" +
            "         \"number\": \"277\"\n" +
            "        },\n" +
            "        \"id\": \"Ge2Ock0WlBx9ErO8\",\n" +
            "        \"cabin\": \"COACH\",\n" +
            "        \"bookingCode\": \"U\",\n" +
            "        \"bookingCodeCount\": 7,\n" +
            "        \"marriedSegmentGroup\": \"2\",\n" +
            "        \"leg\": [\n" +
            "         {\n" +
            "          \"kind\": \"qpxexpress#legInfo\",\n" +
            "          \"id\": \"Lnxe92aqnAxHBsqk\",\n" +
            "          \"aircraft\": \"321\",\n" +
            "          \"arrivalTime\": \"2016-06-22T00:20+04:00\",\n" +
            "          \"departureTime\": \"2016-06-21T21:45+05:30\",\n" +
            "          \"origin\": \"HYD\",\n" +
            "          \"destination\": \"AUH\",\n" +
            "          \"destinationTerminal\": \"1\",\n" +
            "          \"duration\": 245,\n" +
            "          \"mileage\": 1610,\n" +
            "          \"meal\": \"Meal\"\n" +
            "         }\n" +
            "        ],\n" +
            "        \"connectionDuration\": 125\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentInfo\",\n" +
            "        \"duration\": 960,\n" +
            "        \"flight\": {\n" +
            "         \"carrier\": \"EY\",\n" +
            "         \"number\": \"183\"\n" +
            "        },\n" +
            "        \"id\": \"GUhHyYqJ7Jnoq4O0\",\n" +
            "        \"cabin\": \"COACH\",\n" +
            "        \"bookingCode\": \"U\",\n" +
            "        \"bookingCodeCount\": 7,\n" +
            "        \"marriedSegmentGroup\": \"2\",\n" +
            "        \"leg\": [\n" +
            "         {\n" +
            "          \"kind\": \"qpxexpress#legInfo\",\n" +
            "          \"id\": \"LpIX4gtMQFVXC6Qf\",\n" +
            "          \"aircraft\": \"77L\",\n" +
            "          \"arrivalTime\": \"2016-06-22T07:25-07:00\",\n" +
            "          \"departureTime\": \"2016-06-22T02:25+04:00\",\n" +
            "          \"origin\": \"AUH\",\n" +
            "          \"destination\": \"SFO\",\n" +
            "          \"originTerminal\": \"3\",\n" +
            "          \"destinationTerminal\": \"I\",\n" +
            "          \"duration\": 960,\n" +
            "          \"mileage\": 8141,\n" +
            "          \"meal\": \"Meal\",\n" +
            "          \"secure\": true\n" +
            "         }\n" +
            "        ]\n" +
            "       }\n" +
            "      ]\n" +
            "     }\n" +
            "    ],\n" +
            "    \"pricing\": [\n" +
            "     {\n" +
            "      \"kind\": \"qpxexpress#pricingInfo\",\n" +
            "      \"fare\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#fareInfo\",\n" +
            "        \"id\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"carrier\": \"EY\",\n" +
            "        \"origin\": \"SFO\",\n" +
            "        \"destination\": \"HYD\",\n" +
            "        \"basisCode\": \"LHE6MUS/YV\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#fareInfo\",\n" +
            "        \"id\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"carrier\": \"EY\",\n" +
            "        \"origin\": \"HYD\",\n" +
            "        \"destination\": \"SFO\",\n" +
            "        \"basisCode\": \"UKBD6MUS/YS\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"segmentPricing\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"segmentId\": \"G4-i6zledoTRRCV5\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"segmentId\": \"GHqeP0U9A3xfNE+L\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"segmentId\": \"GYqjfKgwtqdLuS8e\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"segmentId\": \"Ge2Ock0WlBx9ErO8\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"segmentId\": \"GUhHyYqJ7Jnoq4O0\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"baseFareTotal\": \"USD1517.00\",\n" +
            "      \"saleFareTotal\": \"USD1517.00\",\n" +
            "      \"saleTaxTotal\": \"USD95.86\",\n" +
            "      \"saleTotal\": \"USD1612.86\",\n" +
            "      \"passengers\": {\n" +
            "       \"kind\": \"qpxexpress#passengerCounts\",\n" +
            "       \"adultCount\": 2\n" +
            "      },\n" +
            "      \"tax\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"YR_F\",\n" +
            "        \"chargeType\": \"CARRIER_SURCHARGE\",\n" +
            "        \"code\": \"YR\",\n" +
            "        \"salePrice\": \"USD1.10\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"US_002\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"US\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD17.80\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"AY_001\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"AY\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD5.60\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XF\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XF\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD4.50\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XA\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XA\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD3.96\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XY\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XY\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD7.00\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"YC\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"YC\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD5.50\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"US_002\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"US\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD17.80\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"WO_001\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"WO\",\n" +
            "        \"country\": \"IN\",\n" +
            "        \"salePrice\": \"USD3.40\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"IN\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"IN\",\n" +
            "        \"country\": \"IN\",\n" +
            "        \"salePrice\": \"USD29.20\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"fareCalculation\": \"SFO EY X/AUH EY X/DEL EY HYD Q SFOHYD275.00 707.50LHE6MUS EY X/AUH EY SFO Q HYDSFO275.00 259.00UKBD6MUS NUC 1516.50 END ROE 1.00 FARE USD 1517.00 XT 5.50YC 7.00XY 3.96XA 35.60US 5.60AY 29.20IN 3.40WO 1.10YR 4.50XF SFO4.50\",\n" +
            "      \"latestTicketingTime\": \"2016-06-15T12:39-04:00\",\n" +
            "      \"ptc\": \"ADT\",\n" +
            "      \"refundable\": true\n" +
            "     },\n" +
            "     {\n" +
            "      \"kind\": \"qpxexpress#pricingInfo\",\n" +
            "      \"fare\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#fareInfo\",\n" +
            "        \"id\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"carrier\": \"EY\",\n" +
            "        \"origin\": \"SFO\",\n" +
            "        \"destination\": \"HYD\",\n" +
            "        \"basisCode\": \"LHE6MUSCH75/YV\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#fareInfo\",\n" +
            "        \"id\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"carrier\": \"EY\",\n" +
            "        \"origin\": \"HYD\",\n" +
            "        \"destination\": \"SFO\",\n" +
            "        \"basisCode\": \"UKBD6MUSCH75/YS\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"segmentPricing\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"segmentId\": \"G4-i6zledoTRRCV5\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"segmentId\": \"GHqeP0U9A3xfNE+L\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"segmentId\": \"GYqjfKgwtqdLuS8e\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"segmentId\": \"Ge2Ock0WlBx9ErO8\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"segmentId\": \"GUhHyYqJ7Jnoq4O0\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"baseFareTotal\": \"USD1275.00\",\n" +
            "      \"saleFareTotal\": \"USD1275.00\",\n" +
            "      \"saleTaxTotal\": \"USD95.86\",\n" +
            "      \"saleTotal\": \"USD1370.86\",\n" +
            "      \"passengers\": {\n" +
            "       \"kind\": \"qpxexpress#passengerCounts\",\n" +
            "       \"childCount\": 2\n" +
            "      },\n" +
            "      \"tax\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"YR_F\",\n" +
            "        \"chargeType\": \"CARRIER_SURCHARGE\",\n" +
            "        \"code\": \"YR\",\n" +
            "        \"salePrice\": \"USD1.10\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"US_002\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"US\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD17.80\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"AY_001\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"AY\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD5.60\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XF\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XF\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD4.50\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XA\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XA\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD3.96\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XY\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XY\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD7.00\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"YC\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"YC\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD5.50\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"US_002\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"US\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD17.80\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"WO_001\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"WO\",\n" +
            "        \"country\": \"IN\",\n" +
            "        \"salePrice\": \"USD3.40\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"IN\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"IN\",\n" +
            "        \"country\": \"IN\",\n" +
            "        \"salePrice\": \"USD29.20\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"fareCalculation\": \"SFO EY X/AUH EY X/DEL EY HYD Q SFOHYD275.00 530.63LHE6MUS EY X/AUH EY SFO Q HYDSFO275.00 194.25UKBD6MUS NUC 1274.88 END ROE 1.00 FARE USD 1275.00 XT 5.50YC 7.00XY 3.96XA 35.60US 5.60AY 29.20IN 3.40WO 1.10YR 4.50XF SFO4.50\",\n" +
            "      \"latestTicketingTime\": \"2016-06-15T12:39-04:00\",\n" +
            "      \"ptc\": \"CNN\",\n" +
            "      \"refundable\": true\n" +
            "     }\n" +
            "    ]\n" +
            "   },\n" +
            "   {\n" +
            "    \"kind\": \"qpxexpress#tripOption\",\n" +
            "    \"saleTotal\": \"USD5967.44\",\n" +
            "    \"id\": \"HeNu4LJSod2UH8jqr4m5OA002\",\n" +
            "    \"slice\": [\n" +
            "     {\n" +
            "      \"kind\": \"qpxexpress#sliceInfo\",\n" +
            "      \"duration\": 1310,\n" +
            "      \"segment\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentInfo\",\n" +
            "        \"duration\": 955,\n" +
            "        \"flight\": {\n" +
            "         \"carrier\": \"EY\",\n" +
            "         \"number\": \"182\"\n" +
            "        },\n" +
            "        \"id\": \"GHqeP0U9A3xfNE+L\",\n" +
            "        \"cabin\": \"COACH\",\n" +
            "        \"bookingCode\": \"L\",\n" +
            "        \"bookingCodeCount\": 7,\n" +
            "        \"marriedSegmentGroup\": \"0\",\n" +
            "        \"leg\": [\n" +
            "         {\n" +
            "          \"kind\": \"qpxexpress#legInfo\",\n" +
            "          \"id\": \"LFzkwOkDM2GJsiCO\",\n" +
            "          \"aircraft\": \"77L\",\n" +
            "          \"arrivalTime\": \"2016-06-16T12:35+04:00\",\n" +
            "          \"departureTime\": \"2016-06-15T09:40-07:00\",\n" +
            "          \"origin\": \"SFO\",\n" +
            "          \"destination\": \"AUH\",\n" +
            "          \"originTerminal\": \"I\",\n" +
            "          \"destinationTerminal\": \"3\",\n" +
            "          \"duration\": 955,\n" +
            "          \"mileage\": 8141,\n" +
            "          \"meal\": \"Meal\",\n" +
            "          \"secure\": true\n" +
            "         }\n" +
            "        ],\n" +
            "        \"connectionDuration\": 100\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentInfo\",\n" +
            "        \"duration\": 255,\n" +
            "        \"flight\": {\n" +
            "         \"carrier\": \"EY\",\n" +
            "         \"number\": \"276\"\n" +
            "        },\n" +
            "        \"id\": \"GGtGF67MtJMYsbjv\",\n" +
            "        \"cabin\": \"COACH\",\n" +
            "        \"bookingCode\": \"L\",\n" +
            "        \"bookingCodeCount\": 7,\n" +
            "        \"marriedSegmentGroup\": \"0\",\n" +
            "        \"leg\": [\n" +
            "         {\n" +
            "          \"kind\": \"qpxexpress#legInfo\",\n" +
            "          \"id\": \"L+T+njmO8GA+abfP\",\n" +
            "          \"aircraft\": \"321\",\n" +
            "          \"arrivalTime\": \"2016-06-16T20:00+05:30\",\n" +
            "          \"departureTime\": \"2016-06-16T14:15+04:00\",\n" +
            "          \"origin\": \"AUH\",\n" +
            "          \"destination\": \"HYD\",\n" +
            "          \"originTerminal\": \"1\",\n" +
            "          \"duration\": 255,\n" +
            "          \"mileage\": 1610,\n" +
            "          \"meal\": \"Meal\"\n" +
            "         }\n" +
            "        ]\n" +
            "       }\n" +
            "      ]\n" +
            "     },\n" +
            "     {\n" +
            "      \"kind\": \"qpxexpress#sliceInfo\",\n" +
            "      \"duration\": 1625,\n" +
            "      \"segment\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentInfo\",\n" +
            "        \"duration\": 235,\n" +
            "        \"flight\": {\n" +
            "         \"carrier\": \"EY\",\n" +
            "         \"number\": \"8700\"\n" +
            "        },\n" +
            "        \"id\": \"GFPapZ0LnXPbFbp8\",\n" +
            "        \"cabin\": \"COACH\",\n" +
            "        \"bookingCode\": \"U\",\n" +
            "        \"bookingCodeCount\": 4,\n" +
            "        \"marriedSegmentGroup\": \"1\",\n" +
            "        \"leg\": [\n" +
            "         {\n" +
            "          \"kind\": \"qpxexpress#legInfo\",\n" +
            "          \"id\": \"Lr7xs+PlJtdUeAej\",\n" +
            "          \"aircraft\": \"73H\",\n" +
            "          \"arrivalTime\": \"2016-06-21T19:15+04:00\",\n" +
            "          \"departureTime\": \"2016-06-21T16:50+05:30\",\n" +
            "          \"origin\": \"HYD\",\n" +
            "          \"destination\": \"AUH\",\n" +
            "          \"destinationTerminal\": \"1\",\n" +
            "          \"duration\": 235,\n" +
            "          \"operatingDisclosure\": \"OPERATED BY JET AIRWAYS\",\n" +
            "          \"mileage\": 1610,\n" +
            "          \"meal\": \"Dinner\"\n" +
            "         }\n" +
            "        ],\n" +
            "        \"connectionDuration\": 430\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentInfo\",\n" +
            "        \"duration\": 960,\n" +
            "        \"flight\": {\n" +
            "         \"carrier\": \"EY\",\n" +
            "         \"number\": \"183\"\n" +
            "        },\n" +
            "        \"id\": \"GUhHyYqJ7Jnoq4O0\",\n" +
            "        \"cabin\": \"COACH\",\n" +
            "        \"bookingCode\": \"U\",\n" +
            "        \"bookingCodeCount\": 4,\n" +
            "        \"marriedSegmentGroup\": \"1\",\n" +
            "        \"leg\": [\n" +
            "         {\n" +
            "          \"kind\": \"qpxexpress#legInfo\",\n" +
            "          \"id\": \"LpIX4gtMQFVXC6Qf\",\n" +
            "          \"aircraft\": \"77L\",\n" +
            "          \"arrivalTime\": \"2016-06-22T07:25-07:00\",\n" +
            "          \"departureTime\": \"2016-06-22T02:25+04:00\",\n" +
            "          \"origin\": \"AUH\",\n" +
            "          \"destination\": \"SFO\",\n" +
            "          \"originTerminal\": \"3\",\n" +
            "          \"destinationTerminal\": \"I\",\n" +
            "          \"duration\": 960,\n" +
            "          \"mileage\": 8141,\n" +
            "          \"meal\": \"Meal\",\n" +
            "          \"secure\": true\n" +
            "         }\n" +
            "        ]\n" +
            "       }\n" +
            "      ]\n" +
            "     }\n" +
            "    ],\n" +
            "    \"pricing\": [\n" +
            "     {\n" +
            "      \"kind\": \"qpxexpress#pricingInfo\",\n" +
            "      \"fare\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#fareInfo\",\n" +
            "        \"id\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"carrier\": \"EY\",\n" +
            "        \"origin\": \"SFO\",\n" +
            "        \"destination\": \"HYD\",\n" +
            "        \"basisCode\": \"LHE6MUS/YV\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#fareInfo\",\n" +
            "        \"id\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"carrier\": \"EY\",\n" +
            "        \"origin\": \"HYD\",\n" +
            "        \"destination\": \"SFO\",\n" +
            "        \"basisCode\": \"UKBD6MUS/YS\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"segmentPricing\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"segmentId\": \"GHqeP0U9A3xfNE+L\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"segmentId\": \"GFPapZ0LnXPbFbp8\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"segmentId\": \"GUhHyYqJ7Jnoq4O0\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"segmentId\": \"GGtGF67MtJMYsbjv\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"baseFareTotal\": \"USD1517.00\",\n" +
            "      \"saleFareTotal\": \"USD1517.00\",\n" +
            "      \"saleTaxTotal\": \"USD95.86\",\n" +
            "      \"saleTotal\": \"USD1612.86\",\n" +
            "      \"passengers\": {\n" +
            "       \"kind\": \"qpxexpress#passengerCounts\",\n" +
            "       \"adultCount\": 2\n" +
            "      },\n" +
            "      \"tax\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"YR_F\",\n" +
            "        \"chargeType\": \"CARRIER_SURCHARGE\",\n" +
            "        \"code\": \"YR\",\n" +
            "        \"salePrice\": \"USD1.10\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"US_002\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"US\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD17.80\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"AY_001\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"AY\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD5.60\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XF\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XF\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD4.50\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XA\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XA\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD3.96\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XY\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XY\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD7.00\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"YC\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"YC\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD5.50\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"US_002\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"US\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD17.80\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"WO_001\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"WO\",\n" +
            "        \"country\": \"IN\",\n" +
            "        \"salePrice\": \"USD3.40\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"IN\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"IN\",\n" +
            "        \"country\": \"IN\",\n" +
            "        \"salePrice\": \"USD29.20\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"fareCalculation\": \"SFO EY X/AUH EY HYD Q SFOHYD275.00 707.50LHE6MUS EY X/AUH EY SFO Q HYDSFO275.00 259.00UKBD6MUS NUC 1516.50 END ROE 1.00 FARE USD 1517.00 XT 5.50YC 7.00XY 3.96XA 35.60US 5.60AY 29.20IN 3.40WO 1.10YR 4.50XF SFO4.50\",\n" +
            "      \"latestTicketingTime\": \"2016-06-15T12:39-04:00\",\n" +
            "      \"ptc\": \"ADT\",\n" +
            "      \"refundable\": true\n" +
            "     },\n" +
            "     {\n" +
            "      \"kind\": \"qpxexpress#pricingInfo\",\n" +
            "      \"fare\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#fareInfo\",\n" +
            "        \"id\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"carrier\": \"EY\",\n" +
            "        \"origin\": \"SFO\",\n" +
            "        \"destination\": \"HYD\",\n" +
            "        \"basisCode\": \"LHE6MUSCH75/YV\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#fareInfo\",\n" +
            "        \"id\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"carrier\": \"EY\",\n" +
            "        \"origin\": \"HYD\",\n" +
            "        \"destination\": \"SFO\",\n" +
            "        \"basisCode\": \"UKBD6MUSCH75/YS\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"segmentPricing\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"segmentId\": \"GHqeP0U9A3xfNE+L\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"segmentId\": \"GFPapZ0LnXPbFbp8\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ApRSVV7ak2p4dF9de7Ej41qix0OjMFCytfK2rOUpbs9JU\",\n" +
            "        \"segmentId\": \"GUhHyYqJ7Jnoq4O0\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#segmentPricing\",\n" +
            "        \"fareId\": \"ADxY/4T1DOHF1oTCVkcPFO/Cn+ul14Q0b6pdu/7BtJQs\",\n" +
            "        \"segmentId\": \"GGtGF67MtJMYsbjv\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"baseFareTotal\": \"USD1275.00\",\n" +
            "      \"saleFareTotal\": \"USD1275.00\",\n" +
            "      \"saleTaxTotal\": \"USD95.86\",\n" +
            "      \"saleTotal\": \"USD1370.86\",\n" +
            "      \"passengers\": {\n" +
            "       \"kind\": \"qpxexpress#passengerCounts\",\n" +
            "       \"childCount\": 2\n" +
            "      },\n" +
            "      \"tax\": [\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"YR_F\",\n" +
            "        \"chargeType\": \"CARRIER_SURCHARGE\",\n" +
            "        \"code\": \"YR\",\n" +
            "        \"salePrice\": \"USD1.10\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"US_002\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"US\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD17.80\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"AY_001\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"AY\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD5.60\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XF\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XF\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD4.50\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XA\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XA\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD3.96\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"XY\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"XY\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD7.00\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"YC\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"YC\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD5.50\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"US_002\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"US\",\n" +
            "        \"country\": \"US\",\n" +
            "        \"salePrice\": \"USD17.80\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"WO_001\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"WO\",\n" +
            "        \"country\": \"IN\",\n" +
            "        \"salePrice\": \"USD3.40\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"kind\": \"qpxexpress#taxInfo\",\n" +
            "        \"id\": \"IN\",\n" +
            "        \"chargeType\": \"GOVERNMENT\",\n" +
            "        \"code\": \"IN\",\n" +
            "        \"country\": \"IN\",\n" +
            "        \"salePrice\": \"USD29.20\"\n" +
            "       }\n" +
            "      ],\n" +
            "      \"fareCalculation\": \"SFO EY X/AUH EY HYD Q SFOHYD275.00 530.63LHE6MUS EY X/AUH EY SFO Q HYDSFO275.00 194.25UKBD6MUS NUC 1274.88 END ROE 1.00 FARE USD 1275.00 XT 5.50YC 7.00XY 3.96XA 35.60US 5.60AY 29.20IN 3.40WO 1.10YR 4.50XF SFO4.50\",\n" +
            "      \"latestTicketingTime\": \"2016-06-15T12:39-04:00\",\n" +
            "      \"ptc\": \"CNN\",\n" +
            "      \"refundable\": true\n" +
            "     }\n" +
            "    ]\n" +
            "   }\n" +
            "  ]\n" +
            " }\n" +
            "}\n";

}
