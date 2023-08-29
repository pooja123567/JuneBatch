package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//input parameter-file path
//purpose of Method-to load the properties file
//output of method-object of properties class
public class PropertiesHandle {
	public static Properties loadProperties(String Filepath) throws IOException
	{
		File f=new File(Filepath);
		FileInputStream fs=new FileInputStream(f);
		Properties pr=new Properties();
		pr.load(fs);
		return pr;
	}

}
