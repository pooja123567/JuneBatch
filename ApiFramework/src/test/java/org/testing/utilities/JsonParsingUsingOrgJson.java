package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingOrgJson {
	public static String jsonParsing(String ResponseData,String Keyname) {
		if(ResponseData.startsWith("["))
		{
		JSONArray ja=new JSONArray(ResponseData);
		int l=ja.length();
		for(int i=0;i<l;i++)
		{
		JSONObject jo=ja.getJSONObject(i);
       System.out.println(jo.get(Keyname));
		}
		return null;
	}
		
		else if(ResponseData.startsWith("{"))
		{
			JSONObject jo=new JSONObject(ResponseData);
		String responseid=jo.getString(Keyname);
		return responseid;
		}
		return null;

}
	}
