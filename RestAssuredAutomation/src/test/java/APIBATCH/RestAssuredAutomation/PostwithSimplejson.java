package APIBATCH.RestAssuredAutomation;
import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostwithSimplejson {
	public static void main(String[]args)
	{
	JSONObject js=new JSONObject();
	js.put("firstname","Meenu");
	js.put("lastname","Bisht");
	js.put("Designation","HR");
	js.put("id","98");
	Response res=given().
		contentType(ContentType.JSON).
		body(js.toString()).
		when()
		.post("http://localhost:3000/NewDataInsertion");
	 System.out.println(res.asString());
	 System.out.println(res.statusCode());
		
	}
	}

