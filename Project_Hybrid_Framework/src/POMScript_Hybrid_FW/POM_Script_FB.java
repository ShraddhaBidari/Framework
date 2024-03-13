package POMScript_Hybrid_FW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Hybrid_FW.Base_Page;

public class POM_Script_FB extends Base_Page
{

	@FindBy(id="email")
	private WebElement uName;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement login;

	
	public POM_Script_FB(WebDriver driver)
	{
		//PageFactory.initElements(driver, this);
		super(driver);
	}
	public void FacebookUn(String Un)
	{
		uName.sendKeys(Un);
	}
	
	public void facebookPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void facebook_Login()
	{
		login.click();
	}
}
