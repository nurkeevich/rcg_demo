package com.rcgdirect.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.rcgdirect.beans.Country;
import com.rcgdirect.beans.CountryResponse;
import com.rcgdirect.utilities.ConfigReader;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RCG_BackEnd_API_Demo {

	@Test
	public void apiTest() {
		
		Country expectedCountry = new Country();
		expectedCountry.setCountry_id("12");
		expectedCountry.setCountry_name("Ahmet's country");
		expectedCountry.setRegion_id(1);
		
		
		Response response = given().accept(ContentType.JSON)
							.when().get(ConfigReader.getProperty("apiURL")+"countries/12");
		
		assertEquals(response.statusCode(), 200);
		
		CountryResponse actualCountry = response.body().as(CountryResponse.class);
		
		assertEquals(actualCountry.getCountry_id(), expectedCountry.getCountry_id());
		assertEquals(actualCountry.getCountry_name(), expectedCountry.getCountry_name());
		assertEquals(actualCountry.getRegion_id(), expectedCountry.getRegion_id());
		
		
	}
}
