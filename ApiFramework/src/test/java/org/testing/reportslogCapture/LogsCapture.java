package org.testing.reportslogCapture;






import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class LogsCapture {
	public static void takeLogs(String classname,String logmsg)
	{
		DOMConfigurator.configure("../ApiFramework/layout.xml");
		Logger L=Logger.getLogger(classname);
		L.info(logmsg.toString());
				

	}

}
