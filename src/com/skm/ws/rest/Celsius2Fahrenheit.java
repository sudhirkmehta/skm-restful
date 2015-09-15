package com.skm.ws.rest; 

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * A simple RESTful web-service to convert from celsius to fahrenheit.
 * Date: 15-Sep-2015
 * @author sudhirkmehta@gmail.com
 * @version 1.0
 */

@Path("/ctf")
public class Celsius2Fahrenheit {
	
	@GET
	@Produces("application/xml")
	public String convertBlank() { 
		Double celsius = 0D;
		return convertInput(celsius);
	}
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;
		
		StringBuilder resultSB = new StringBuilder();
		resultSB.append("<Celsius2Fahrenheit>");
		resultSB.append("<celsius>").append(celsius).append("</celsius>");
		resultSB.append("<fahrenheit>").append(fahrenheit).append("</fahrenheit>");
		resultSB.append("<status>").append("SUCCESS").append("</status>");
		resultSB.append("</Celsius2Fahrenheit>");
		
		return resultSB.toString();
	}
}