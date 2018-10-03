package com.rcgdirect.tests;

import com.rcgdirect.utilities.ConfigReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.*;

public class BackEnd_Demo {
	
	
	String url = ConfigReader.getProperty("databaseURL");
	String username = ConfigReader.getProperty("databaseUsername");
	String password = ConfigReader.getProperty("databasePassword");
	String sqlQ = "select last_name from employees";
	
	@Test
	public void backEndTest() throws SQLException {
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sqlQ);
		
		while (resultSet.next()) {
			System.out.println(resultSet.getString("last_name"));
		}
		
		
		resultSet.close();
		statement.close();
		connection.close();
	}
}
