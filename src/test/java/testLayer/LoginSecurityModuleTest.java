package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomLoginSecurityModule;

public class LoginSecurityModuleTest extends BaseAmazonClass 

{

	PomLoginSecurityModule LogSec;
	public LoginSecurityModuleTest()
	{
		super();
	}
	
	@BeforeMethod
	public void initsetup()
	{
		initiation();
		
		LogSec=new PomLoginSecurityModule();

	}
	
	@Test
	public void LoginSecurityModule()
	{
		LogSec.ClickYourAccount();
		
		LogSec.ClickLoginSecurity();
		
		LogSec.ClickEditName();
		
		LogSec.ClickSaveName();
		
		String verify = LogSec.SuccessMessage();
		System.out.println(verify);
		Assert.assertEquals(verify, "Success");
		
		LogSec.ClickDone();
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
