package com.rcgdirect.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;

import com.rcgdirect.beans.Country;
import com.rcgdirect.beans.CountryResponse;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class BackEnd_API_Testing {
	
	Country country = new Country();
	CountryResponse countryResponse;
	
	/*
	 * given accept types is json when I send a GET request to URL then status code
	 * should 200 and contentType should json
	 */

	@Test
	public void apiTesting() {
		Response response = given().accept(ContentType.JSON)
							.when().get("http://34.223.219.142:1212/ords/hr/countries/12");
		
		
		assertEquals(response.getStatusCode(), 200);
		
		System.out.println(response.contentType());
		assertEquals(response.contentType(), "application/json");
		
		country.setCountry_id("12");
		country.setCountry_name("Ahmet's country");
		country.setRegion_id(1);
		
		//deserialize the response
		countryResponse = response.body().as(CountryResponse.class);
		
		assertEquals(countryResponse.getCountry_id(), country.getCountry_id());
		assertEquals(countryResponse.getCountry_name(), country.getCountry_name());
		assertEquals(countryResponse.getRegion_id(), country.getRegion_id());
		
	}
}
