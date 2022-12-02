package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import basePackage.BaseAmazonClass;
import pompackage.PomAddressModule;

public class AddressModuleTest extends BaseAmazonClass 

{
	PomAddressModule Add;
	public AddressModuleTest()
	{
		super();
	}
	
	@BeforeMethod
	public void initsetup()
	{
		initiation();
		
		Add=new PomAddressModule();

	}
	
	@Test
	public void AddressModule() throws InterruptedException
	{
		Add.ClickYourAccount();
		Thread.sleep(2000);
		
		Add.ClickYourAddress();
		Thread.sleep(2000);
		Add.ClickAddNewAddress();
		
		Thread.sleep(2000);
		
		String region = Add.CountryName();
		System.out.println(region);
		Assert.assertEquals(region, "Canada");
		
		Thread.sleep(2000);
		
		Add.EnterName();
		Thread.sleep(2000);
		Add.EnterPhoneNumber();
		Thread.sleep(2000);
		Add.EnterAddress();
		Thread.sleep(2000);
		Add.EnterCity();
		Thread.sleep(2000);
		Add.ClickProvince();
		Thread.sleep(2000);
		Add.SelectOntario();
		Thread.sleep(2000);
		Add.EnterPostalCode();
		
		Thread.sleep(2000);
		
		Add.ClickDefaultAddress();
		Thread.sleep(2000);
		Add.ClickAddAddress();
		Thread.sleep(2000);
		Add.ClickSuggestion();
		Thread.sleep(2000);
		Add.ClickSaveAddress();
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
}
