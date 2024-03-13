package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FetchProperty
{

	@Test
	public static String getProperty() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./facebook.properties"));
		String val = p.getProperty("baseURL");
		return val;
	}
}
