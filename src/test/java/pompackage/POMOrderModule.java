package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class POMOrderModule extends BaseAmazonClass 
{
	//Object Repository
	
	@FindBy(xpath=".//span[@id='nav-link-accountList-nav-line-1']")
	WebElement verifyusername;
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	WebElement youraccount;
	
	@FindBy(xpath="//h2[contains(text(),'Your Orders')]")
	WebElement yourorder;
	
	@FindBy(xpath="//span[contains(text(),'past 3 months')]")
	WebElement past3months;
	
	@FindBy(css="#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(2) > a")
	WebElement buyagain;
	
	@FindBy(xpath="//*[contains(text(),'Not Yet Shipped')]")
	WebElement notyetshipped;
	
	@FindBy(xpath="//*[contains(text(),'Cancelled Orders')]")
	WebElement cancelledorders;
	
	//Initiate Page Element
	
	public POMOrderModule()
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickYourAccount()
	{
		youraccount.click();
	}
	public void ClickYourOrder()
	{
		yourorder.click();
	}
	public String verify()
	{
		return past3months.getText();
	}
	public void ClickByAgain()
	{
		buyagain.click();
	}
	public void ClickNotYetShipped()
	{
		notyetshipped.click();
	}
	public void ClickCancelledOrders()
	{
		cancelledorders.click();
	}
	public String verifyusername()
	{
		return verifyusername.getText();
		
	}
}
