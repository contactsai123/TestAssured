package com.RestAssured;
import static io.restassured.RestAssured.*;
import org.codehaus.jackson.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

/*

	
    RequestSpecBuilder builder;
    RequestSpecification requestSpec;
    @SuppressWarnings("deprecation")

    public void setupRequestSpecBuilder()
    {
        builder = new RequestSpecBuilder();
        builder.addHeader("Authorization", "abcd-123-xyz");
        builder.addParameter("loginID", "joebloggs");
        requestSpec = builder.build();
    } 
    
    */
	
public class RestAssuredtest {
	
@Test
	public void firstTest()
	{
		String resturl = "http://services.groupkt.com/country/get/iso2code/AF";
        System.out.println("executed");

        //given().when().get("http://www.google.com").then().statusCode(200);
	         /*
	         given().
	         get(resturl).
	         then().
	         root("RestResponse.result").
	         body("name",equalTo("Afganistan")).body("alpha2_code",equalTo("AF")).body("alpha3_code",equalTo("AFG"));
	         
	         
	         */

	         System.out.println("~~~~~~~~~~Break!~~~~~~~~~~~");
	         
	         given().
	         get(resturl).
	         then().
	         root("RestResponse.result").
	         body("name",equalTo("Afghanistan"),"alpha2_code",equalTo("AF"),"alpha3_code",equalTo("AFG")).log().all();

	         
	     }
	
@Test
public void secondTest()
{
	String resturl = "http://services.groupkt.com/country/get/iso2code/AF";
    System.out.println("executed");

    //given().when().get("http://www.google.com").then().statusCode(200);
         String strRestresponse = get(resturl).asString();
         System.out.println(strRestresponse);
     }


@Test
public void thirdTest()
{
	RestAssured.baseURI = "http://services.groupkt.com";
	RestAssured.basePath = "/country/get/iso2code/AF";
	
	String resturl = "http://services.groupkt.com/country/get/iso2code/AF";
	Response restresponse;
	
	restresponse = 
			given().
	when().get(resturl).
	then().
    root("RestResponse.result").
    body("name",equalTo("Afghanistan"),"alpha2_code",equalTo("AF"),"alpha3_code",equalTo("AFG")).
	extract().response();
	
	System.out.println(restresponse.asString());
	
	System.out.println("Status code: "+restresponse.getStatusCode());
	System.out.println("Get Time: "+restresponse.getTime());
	System.out.println("Content type: "+restresponse.getContentType());
	System.out.println("Name: "+restresponse.path("RestResponse.result.name"));

    //given().when().get("http://www.google.com").then().statusCode(200);
         //String strRestresponse = get(resturl).asString();
         //System.out.println(strRestresponse);
     }


//Requestspecification in Get Parameters
@Test
public void fourthTest()
{
	
	String resturl = "http://services.groupkt.com/country/get/iso2code";
  

	Response restresponse;
	
	restresponse = given().
	when().get(resturl).
	then().
	extract().response();
	
	System.out.println("Status code: "+restresponse.getStatusCode());
	System.out.println("Get Time: "+restresponse.getTime());
	System.out.println("Content type: "+restresponse.getContentType());
	System.out.println("Name: "+restresponse.path("RestResponse.result.name"));

   
    
     }


//POJO Class


//Requestspecification in Get Parameters
@Test
public void fifthTest()
{
	
	String resturl = "http://services.groupkt.com/country/get/iso2code";


	Response restresponse;
	
	restresponse = given().
	when().get(resturl).
	then().
	extract().response();
	
	System.out.println("Status code: "+restresponse.getStatusCode());
	System.out.println("Get Time: "+restresponse.getTime());
	System.out.println("Content type: "+restresponse.getContentType());
	System.out.println("Name: "+restresponse.path("RestResponse.result.name"));

 
  
   }

//POJO Class
@Test
public void sixthTest()
{
	
	String resturl = "http://services.groupkt.com/country/get/iso2code/AF";


	Response restresponse;
	
	restresponse = given().
	when().get(resturl).
	then().
	extract().response();
	
	System.out.println("Status code: "+restresponse.getStatusCode());
	System.out.println("Get Time: "+restresponse.getTime());
	System.out.println("Content type: "+restresponse.getContentType());
	System.out.println("Name: "+restresponse.path("RestResponse.result.name"));

	
	String json = restresponse.asString();
	String Token = JsonPath.with(json).get("RestResponse.result.alpha3_code");
	System.out.println("Alpha 3 code: ="+Token);
 }


}




