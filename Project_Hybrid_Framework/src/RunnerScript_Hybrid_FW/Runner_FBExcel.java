package RunnerScript_Hybrid_FW;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Hybrid_FW.BaseClass;
import Generic_Hybrid_FW.Generic_Excel_FetchData;
import POMScript_Hybrid_FW.POM_Script_FB;

public class Runner_FBExcel extends BaseClass
{
	@Test
	public void excelData()throws InterruptedException
	{
		POM_Script_FB ps=new POM_Script_FB(driver);
		Thread.sleep(1000);
		ps.FacebookUn(Generic_Excel_FetchData.getData("Sheet1", 4, 0));
		Thread.sleep(2000);
		ps.facebookPassword(Generic_Excel_FetchData.getData("Sheet1", 5, 0));
		Thread.sleep(2000);
		ps.facebook_Login();
		Thread.sleep(2000);
	//To Capture ScreeShot make	Assert.fail();
	
	
	}
}
