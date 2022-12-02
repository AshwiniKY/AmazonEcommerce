package testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomSearchPagination;

public class SearchPaginationTest extends BaseAmazonClass 
{

	PomSearchPagination SeaPag;
	public SearchPaginationTest()
	{
		super();
	}
	
	@BeforeMethod
	public void initsetup()
	{
		initiation();
		
		SeaPag=new PomSearchPagination();

	}
	
	@Test
	public void PaymentModule() throws InterruptedException
	{
		SeaPag.EnterSearchBox();
		Thread.sleep(200);
		SeaPag.ClickSearch();
		
		// This method is for Scroll down the page to the specific element
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		// Scroll Down up to specific pixel 
		js1.executeScript("window.scrollBy(0,350)", "");

		
		SeaPag.ClickNextPage();
		
		
		// This method is for Scroll down the page to the specific element
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				// Scroll Down up to specific pixel 
				js2.executeScript("window.scrollBy(0,350)", "");
				
				
		SeaPag.ClickPrevious();
		Thread.sleep(200);
		SeaPag.SelectBrand();
		Thread.sleep(200);
		SeaPag.DisSelectBrand();
		Thread.sleep(200);
		SeaPag.SelectPrice();
		Thread.sleep(200);
		SeaPag.AnyPrice();		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
