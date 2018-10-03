package com.rcgdirect.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.rcgdirect.utilities.ConfigReader;

public class RCG_BackEnd_Demo {
	String endPoint = ConfigReader.getProperty("databaseURL");
	String username = ConfigReader.getProperty("databaseUsername");
	String password = ConfigReader.getProperty("databasePassword");
	String sqlQuery = "SELECT first_name, last_name, salary FROM employees";
	
	@Test(enabled = false)
	public void test() {
		System.out.println(endPoint);
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(enabled = true)
	public void backEndAutomation() throws SQLException {
		Connection connection = DriverManager.getConnection(endPoint, username, password);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sqlQuery);
		
		while (resultSet.next()) {
			System.out.println("first name: "+resultSet.getObject("first_name")+
					"	Last name: "+resultSet.getObject("last_name")+
					"		Salary: "+resultSet.getObject("salary"));
		}
		
		
		
		resultSet.close();
		statement.close();
		connection.close(); 
	}
	
	
}
