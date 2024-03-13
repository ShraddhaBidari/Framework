package TestNG_Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Parameter
{
	@Test(priority=1)
	public void test1()
	{
		Reporter.log("Asia", true);
	}
	@Test
	public void test2()
	{
		Reporter.log("India", true);
	}
}
