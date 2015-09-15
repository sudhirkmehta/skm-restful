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
 
@Path("/ftc")
public class Fahrenheit2Celsius {
 
	  @GET
	  @Produces("application/xml")
	  public String convertBlank() {
		float fahrenheit = 0f;
		return convertInput(fahrenheit);
	  }
 
	  @Path("{f}")
	  @GET
	  @Produces("application/xml")
	  public String convertInput(@PathParam("f") float fahrenheit) {
		float celsius;
		celsius =  (fahrenheit - 32)*5/9;
		
		StringBuilder resultSB = new StringBuilder();
		resultSB.append("<Fahrenheit2Celsius>");		
		resultSB.append("<fahrenheit>").append(fahrenheit).append("</fahrenheit>");
		resultSB.append("<celsius>").append(celsius).append("</celsius>");
		resultSB.append("<status>").append("SUCCESS").append("</status>");
		resultSB.append("</Fahrenheit2Celsius>");
		
		return resultSB.toString();
	  }
}