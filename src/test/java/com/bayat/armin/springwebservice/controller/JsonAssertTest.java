package com.bayat.armin.springwebservice.controller;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

    private String actualResponse = "{\"id\":1,\"name\":\"item1\",\"price\":1000,\"quantity\":1000}";

    @Test
    void jsonAssert_StrictTrue_ExactMatchExceptForSpaces() throws JSONException {
        String expectedResponse = "{\"id\":1,\"name\":\"item1\",\"price\":1000,\"quantity\":1000}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, true);
    }

    @Test
    void jsonAssert_StrictFalse() throws JSONException {
        String expectedResponse = "{\"id\":1,\"name\":\"item1\",\"price\":1000}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, false);
    }

    @Test
    void jsonAssert_WithoutEscapeCharacter() throws JSONException {
        String expectedResponse = "{id:1, name:item1, price:1000, quantity:1000}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, false);
    }
}
