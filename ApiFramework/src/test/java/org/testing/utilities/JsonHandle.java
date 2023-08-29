package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;


//input paramter-json file path
//purpose-read any json file
//output->json data in string format
public class JsonHandle {
	public static String loadJsonFile(String Filepath) throws FileNotFoundException
	{
		File f=new File(Filepath);
		FileInputStream fs=new FileInputStream(f);
		JSONTokener js=new JSONTokener(fs);
		JSONObject jo=new JSONObject(js);
		return jo.toString();
		
		
	}

}
