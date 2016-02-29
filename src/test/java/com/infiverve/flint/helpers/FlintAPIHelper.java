/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiverve.flint.helpers;

import com.jayway.restassured.RestAssured;

import com.jayway.restassured.http.ContentType;

import static org.junit.Assert.assertThat;

import com.jayway.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by sandeepmankar on 2/28/16.
 */
public class FlintAPIHelper {

    public String runFlintBit(String json, String flintBitName) {
        RestAssured.baseURI = ConfigHelper.getBaseURL();

        String response
                = RestAssured.given()
                .headers(getDefaultHeaders())
                .contentType(ContentType.JSON)
                .body(json)
                .pathParam("flintbitname", flintBitName)
                .post("/v1/bit/run/{flintbitname}")
                .asString();
        JsonPath jsonPath = new JsonPath(response);
        assertThat("exit-code should be 0", jsonPath.getInt("meta.exit-code"), equalTo(0));
        assertThat("message should be success", jsonPath.getString("meta.message"), equalTo("success"));
        assertThat("status should be complete", jsonPath.getString("meta.status"), equalTo("submitted"));

        return response;
    }

    private Map<String, Object> getDefaultHeaders() {
        Map<String, Object> headerMap = new HashMap<String, Object>();
        headerMap.put("x-flint-username", ConfigHelper.getApiUsername());
        headerMap.put("x-flint-password", ConfigHelper.getApiPassword());
        return headerMap;
    }

}
