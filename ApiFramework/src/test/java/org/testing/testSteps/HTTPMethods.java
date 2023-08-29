package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

//input parameter-Request body,uri value-from the properties file
public class HTTPMethods {
	Properties pr;
	
public HTTPMethods(Properties pr)
	{
	this.pr=pr;	
	}

	 public Response postmethod(String requestBody,String urikeyName) {
	String uriValue	= pr.getProperty(urikeyName);
	System.out.println(pr);
	Response res=given().
	contentType(ContentType.JSON).
	body(requestBody).
	when().post(uriValue);
	System.out.println(res.asString());
	System.out.println(res.statusCode());
	return res;
	}
	 public Response getmethod(String urikeyName) {
			String uriValue	= pr.getProperty(urikeyName);
			System.out.println(pr);
			Response res=given().
			contentType(ContentType.JSON).
			when().get(uriValue);
			System.out.println(res.asString());
			System.out.println(res.statusCode());
			return res;
				 
			 }
	 public Response getParticularmethod(String urikeyName,String EndPoint) {
			String uriValue	= pr.getProperty(urikeyName)+"/"+EndPoint;
			System.out.println(pr);
			Response res=given().
			contentType(ContentType.JSON).
			when().get(uriValue);
			System.out.println(res.asString());
			System.out.println(res.statusCode());
			return res;
				 
			 }

	public Response putmethod(String requestBody,String urikeyName,String Endpoint) {
	String uriValue	= pr.getProperty(urikeyName)+"/"+Endpoint;
	System.out.println(pr);
	Response res=given().
	contentType(ContentType.JSON).
	body(requestBody).
	when().put(uriValue);
	System.out.println(res.asString());
	System.out.println(res.statusCode());
	return res;
	}
	 public Response deletemethod(String urikeyName,String EndPoint) {
			String uriValue	= pr.getProperty(urikeyName)+"/"+EndPoint;
			System.out.println(pr);
			Response res=given().
			contentType(ContentType.JSON).
			when().delete(uriValue);
			System.out.println(res.asString());
			System.out.println(res.statusCode());
			return res;
				 
			 }
}
