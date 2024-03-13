package RunnerScript_Hybrid_FW;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Hybrid_FW.BaseClass;
import POMScript_Hybrid_FW.POM_Script_FB;


public class Runner_FB extends BaseClass
{
	@Test(dataProvider="Login_Credentials")
	public void FacebookApplication_login(String un, String pwd) throws InterruptedException
	{
		POM_Script_FB ps=new POM_Script_FB(driver);
		Thread.sleep(1000);
		ps.FacebookUn(un);
		Thread.sleep(2000);
		ps.facebookPassword(pwd);
		Thread.sleep(2000);
		ps.facebook_Login();
		Thread.sleep(2000);
		//Capture Screenshot	Assert.fail();
		
	}
	@DataProvider(name="Login_Credentials")
	public Object[][] createData()
	{
		Object [][] data= {{"Shraddha.bidari", "admin@123"}, {"Pavithra", "pavi@123"}, {"xyz", "123"},{"pqr", "456"}};
		return data;
	}
}
