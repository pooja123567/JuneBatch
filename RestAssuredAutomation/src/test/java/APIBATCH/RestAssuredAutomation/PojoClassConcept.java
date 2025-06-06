package APIBATCH.RestAssuredAutomation;

import  static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PojoClassConcept {

	public static void main(String[] args) {
		PojoComplexJson pc=new PojoComplexJson();//Complex json
		pc.setCity("Haldwani");
		pc.setDistrict("Nainital");
		pc.setState("Uttarakhand");
		
		PojoComplexJson pc1[]=new PojoComplexJson[2];
		pc1[0]=new PojoComplexJson();
		pc1[0].setCity("Haldwani");
		pc1[0].setDistrict("Nainital");
		pc1[0].setState("Uttarakhand");
		pc1[1]=new PojoComplexJson();
		pc1[1].setCity("Haldwani");
		pc1[1].setDistrict("Nainital");
		pc1[1].setState("Uttarakhand");
	
PojoPrivateVariable pv=new PojoPrivateVariable();//(HasA Relationship)
pv.setFirstname("Mohit");
pv.setDesignation("Engineer");
pv.setLastname("Bisht");
pv.setId("5");
pv.setAddress(pc1);
Response res=given().
contentType(ContentType.JSON).
body(pv).
when().
post("http://localhost:3000/DevopsBatchStudents");
System.out.println(res.getStatusCode());
System.out.println(res.asString());
	}

}
