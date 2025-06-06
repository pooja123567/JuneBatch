package APIBATCH.RestAssuredAutomation;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostWithComplexJson {

	public static void main(String[] args) {
JSONObject innerobject=new JSONObject();
innerobject.put("State", "Uttarakhand");
innerobject.put("City","Haldwani");
innerobject.put("District","Nainital");
JSONObject outerobject=new JSONObject();
outerobject.put("firstname", "pramod");
outerobject.put("lastname", "Bisht");
outerobject.put("Designation", "HR");
outerobject.put("id", "85");
outerobject.put("Address", innerobject);
System.out.println(outerobject);
Response res=given().
contentType(ContentType.JSON).body(outerobject.toString()).
when().
post(" http://localhost:3000/APIBatchStudents");
System.out.println(res.asString());
System.out.println(res.statusCode());

	}

}
