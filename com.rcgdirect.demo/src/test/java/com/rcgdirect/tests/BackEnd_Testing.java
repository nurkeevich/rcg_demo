package com.rcgdirect.tests;

import static org.testng.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.*;

import com.rcgdirect.utilities.ConfigReader;

public class BackEnd_Testing {
	/*
	 * when User run sqlQ query
	 * then User should get lastname of highest paid employee as "King"
	 */
	String url = ConfigReader.getProperty("databaseURL");
	String username = ConfigReader.getProperty("databaseUsername");
	String password = ConfigReader.getProperty("databasePassword");
	
	String sqlQ = "select last_name from employees where salary = (select max(salary) from employees)";
	
	@Test
	public void backEndTest() throws SQLException {
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sqlQ);
		
		resultSet.next();
		
		String actualResult = resultSet.getString(1);
		
		assertEquals(actualResult, "King");
		
		
		resultSet.close();
		statement.close();
		connection.close();
		
	}
}
