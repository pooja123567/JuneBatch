package APIBATCH.RestAssuredAutomation;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;






public class GetWithAll {

public static void main(String[]args)
{
	Response res=
			 given().
	contentType(ContentType.JSON).
	when().
	get(" http://localhost:3000/NewDataInsertion");
	 System.out.println(res.asString());
	 System.out.println(res.getStatusCode());
}
}