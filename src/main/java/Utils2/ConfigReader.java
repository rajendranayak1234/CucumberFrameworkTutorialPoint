package Utils2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	public static Properties initializeProperties()
	{
	Properties prop=new Properties();
	File proFile=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config2\\Config1.Properties");
	try
	{
	FileInputStream fis=new FileInputStream(proFile);
	prop.load(fis);
	}catch(Throwable e)
	{
		e.printStackTrace();
	}
	return prop;
	
	}
}
