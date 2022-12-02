package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomPayementMudule;

public class PayementModuleTest extends BaseAmazonClass   
{
	PomPayementMudule PayMod;
	public PayementModuleTest()
	{
		super();
	}
	
	@BeforeMethod
	public void initsetup()
	{
		initiation();
		
		PayMod=new PomPayementMudule();

	}
	
	@Test
	public void PaymentModule() throws InterruptedException
	{
		PayMod.ClickYourAccount();
		Thread.sleep(200);
		PayMod.ClickYourPayement();		
		Thread.sleep(2000);
		PayMod.ClickAddPayement();
		Thread.sleep(2000);
		PayMod.ClickAddCard();
		Thread.sleep(200);
		PayMod.switchiframe();
		Thread.sleep(200);
		PayMod.EnterCardNumber();
		Thread.sleep(200);
		PayMod.EnterNameOnCard();
		Thread.sleep(200);
		PayMod.ClickExpMonth();
		Thread.sleep(200);
		PayMod.SelectMonth();
		Thread.sleep(200);
		PayMod.ClickExpYear();
		Thread.sleep(200);
		PayMod.SelectYear();
		Thread.sleep(200);
		PayMod.EnterCVV();
		Thread.sleep(200);
		PayMod.ClickAddYourCard();
		Thread.sleep(200);
		PayMod.switchdefault();
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
