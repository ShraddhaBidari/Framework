package Generic_Hybrid_FW;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.FetchProperty;


public class BaseClass implements FWK_Constants
{

	public WebDriver driver;
	@BeforeMethod
	public void ChromeTest() throws FileNotFoundException, IOException
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.get(FetchProperty.getProperty());
	}

/*	@BeforeMethod
	public void FirefoxTest() throws FileNotFoundException, IOException
	{
	
	System.setProperty(gecko_key, gecko_value);
	driver=new FirefoxDriver();
	driver.get(FetchProperty.getProperty());
	}  */

	@AfterMethod
	public void closeAppln(ITestResult res)
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Generic_Screenshot.get_photo(driver);
		}
		driver.close();
	}
}
