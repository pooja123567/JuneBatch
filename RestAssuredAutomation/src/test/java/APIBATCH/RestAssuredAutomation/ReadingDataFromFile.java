package APIBATCH.RestAssuredAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ReadingDataFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("../RestAssuredAutomation/requestbody.json");//connection
		FileInputStream fs=new FileInputStream(f);//inputstream object
	JSONTokener js=new JSONTokener(fs);//jsontokener object
	JSONObject jo=new JSONObject(js);
	System.out.println(jo.toString());
Response res=given().contentType(ContentType.JSON).
body(jo.toString()).when()
	.post("http://localhost:3000/SeleniumBatchStudents");
System.out.println(res.getStatusCode());
System.out.println(res.asString());

	}

}
