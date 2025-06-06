package APIBATCH.RestAssuredAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class MakingDynamicData {
	public static void main(String[] args) throws FileNotFoundException {
			File f=new File("../RestAssuredAutomation/requestbody.json");//connection
			FileInputStream fs=new FileInputStream(f);//inputstream object
		JSONTokener js=new JSONTokener(fs);//jsontokener object
		JSONObject jo=new JSONObject(js);
		String Data=jo.toString();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		Integer id=sc.nextInt();
		System.out.println("Enter firstname");
		String first=sc.next();
	Data=Data.replaceAll(Pattern.quote("{{"+"id"+"}}"),id.toString());
	Data=Data.replaceAll(Pattern.quote("{{"+"firstname"+"}}"),first);
	
		
		System.out.println(Data);
	Response res=given().contentType(ContentType.JSON).
	body(Data).when()
		.post("http://localhost:3000/SeleniumBatchStudents");
	System.out.println(res.getStatusCode());
	System.out.println(res.asString());

		}

	}



