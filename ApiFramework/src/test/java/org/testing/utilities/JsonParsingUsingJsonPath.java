package org.testing.utilities;

import io.restassured.response.Response;
//input parameter->response object and jsonpath
//purpose->from response extract the data you want using Jsonpath
//output->String value.


public class JsonParsingUsingJsonPath {
	
	public static String jsonParsing(Response res,String Jsonpath) {
	return res.jsonPath().get(Jsonpath);
		
	}

}
