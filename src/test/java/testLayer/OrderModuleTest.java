package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
//import basePackage.BaseAmazonClass;
import pompackage.POMOrderModule;


public class OrderModuleTest extends BaseAmazonClass
{

	POMOrderModule Order;
	public OrderModuleTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void initsetup()
	{
		initiation();
		
		Order=new POMOrderModule();

	}
	
	@Test
	public void OrderModule() throws InterruptedException
	{
			
		String firsttext = Order.verifyusername();
		System.out.println(firsttext);
		Assert.assertEquals(firsttext, "Hello, Ashwini");
		
		Thread.sleep(2000);
		Order.ClickYourAccount();
		Thread.sleep(2000);
		Order.ClickYourOrder();
		Thread.sleep(2000);
		String text = Order.verify();
		Thread.sleep(2000);
		System.out.println(text);
		Assert.assertEquals(text, "past 3 months");
		Thread.sleep(2000);
		Order.ClickByAgain();
		Thread.sleep(2000);
		Order.ClickNotYetShipped();
		Thread.sleep(2000);
		Order.ClickCancelledOrders();
		
	}
	@AfterMethod
	public void Close()
	{
		driver.close();
	}
}
