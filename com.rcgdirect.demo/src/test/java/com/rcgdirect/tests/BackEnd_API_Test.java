package com.rcgdirect.tests;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.rcgdirect.beans.CountryResponse;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BackEnd_API_Test {
	@Test
	public void API_Testing() {
		
		CountryResponse countryResponse;
		
		Response response = given().accept(ContentType.JSON)
							.when().get("http://34.223.219.142:1212/ords/hr/countries/12");
		
		assertEquals(response.statusCode(), 200);
		assertEquals(response.contentType(), "application/json");
		
		//deserialize response
		
		countryResponse = response.body().as(CountryResponse.class);
		
		assertEquals(countryResponse.getCountry_id(), "12");
		assertEquals(countryResponse.getCountry_name(), "Ahmet's country");
		assertEquals(countryResponse.getRegion_id(), 1);
		
	}
}
