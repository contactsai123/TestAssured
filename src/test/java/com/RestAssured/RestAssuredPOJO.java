//This program is to demonstrate the JSON to POJO class conversion
package com.RestAssured;
import com.Pojo.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import static io.restassured.RestAssured.*;
import org.codehaus.jackson.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

import java.io.File;

public class RestAssuredPOJO {
	
	@Test
	public void jparser() throws IOException
	{
	String strJSONPath = "api/POJOexamplejson.json";
	ObjectMapper mapper = new ObjectMapper();
	POJOexamplemodel POJOexampleinstance = mapper.readValue(new File(strJSONPath), POJOexamplemodel.class);
	
	POJOexampleinstance.id = 2;
	POJOexampleinstance.name = "Sai";
	POJOexampleinstance.price = 12;
	//POJOexampleinstance.tags = ["house", "white"]
	
	System.out.println("Updated request body:" +mapper.writeValueAsString(POJOexampleinstance));
	
	
	}

}
