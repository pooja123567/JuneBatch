package APIBATCH.RestAssuredAutomation;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostWithArrayJson {

	public static void main(String[] args) {
		JSONObject innerobject1=new JSONObject();
		innerobject1.put("State", "Uttarakhand");
		innerobject1.put("City","Haldwani");
		innerobject1.put("District","Nainital");
		JSONObject innerobject2=new JSONObject();
		innerobject2.put("State", "uttarPradesh");
		innerobject2.put("City","noida");
		innerobject2.put("District","Agra");
	JSONArray array=new JSONArray();
	array.put(0,innerobject1);
	array.put(1,innerobject2);
	JSONObject outerobject=new JSONObject();
	outerobject.put("firstname", "priyu");
	outerobject.put("lastname", "Joshi");
	outerobject.put("Designation", "HR");
	outerobject.put("id", "80");
	outerobject.put("Address",array );
	System.out.println(outerobject);
	Response res=given().
	contentType(ContentType.JSON).
	body(outerobject.toString()).when().post( "http://localhost:3000/APIBatchStudents");
	System.out.println(res.asString());
	System.out.println(res.statusCode());
	
		
		
	}

}
