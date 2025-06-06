package APIBATCH.RestAssuredAutomation;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetWithPathParam {
	public static void main(String[]args)
	{
	Response res=given().
		contentType(ContentType.JSON)
		.when().
		get("http://localhost:3000/NewDataInsertion/8");
	System.out.println(res.asString());
	System.out.println(res.statusCode());
	}

}
