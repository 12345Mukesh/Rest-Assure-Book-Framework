package api.ObjectRepo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility
{
   
	public String ReadDatafromPropfile(String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Mukesh\\Desktop\\API Framework\\untitled\\src\\test\\java\\utilities\\Endpoints.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key,"Incorrectkey");	
	}
}
