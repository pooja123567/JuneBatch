package org.testing.utilities;

import java.util.regex.Pattern;
//input parameter-the complete requestbody,variablename,variable value
//purpose-assign value to the variable
//output-replaced value.
public class JsonReplacement {
	public static String assignVariableValue(String requestbody,String variablename,String Variablevalue)
	{
		requestbody=requestbody.replaceAll(Pattern.quote("{{"+variablename+"}}"),Variablevalue);
		return requestbody;
	}

}
