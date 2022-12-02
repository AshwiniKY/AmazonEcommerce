package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomPayementMudule extends BaseAmazonClass   
{
	//Object Repository
	
		@FindBy(xpath="//a[@id='nav-link-accountList']")
		WebElement youraccount;
		
		@FindBy(xpath="//h2[contains(text(),'Your Payments')]")
		WebElement yourpayment;
		
		@FindBy(xpath="//*[@id='pp-B1uP1V-10' or @text='Add a payment method']")
		WebElement addpayement;
		
		@FindBy(xpath="//span[contains(@id,'pp-kOda1n-36')]//span//input")
		WebElement addcard;
		
		@FindBy(xpath="////div[@id='a-popover-1']")
		WebElement iframe;
		
		@FindBy(xpath="//input[@id='pp-5EQ1b4-16']")
		WebElement cardnumber;
		
		@FindBy(xpath="//input[@id='pp-9AyfIJ-18']")
		WebElement name;
		
		@FindBy(xpath="//span[@id='pp-9AyfIJ-22']")
		WebElement expmonth;
		
		@FindBy(xpath="//*[@id='pp-9AyfIJ-19_4']")
		WebElement selectmonth;
		
		@FindBy(xpath="pp-9AyfIJ-23")
		WebElement expyear;
		
		@FindBy(xpath="//*[@id='pp-9AyfIJ-21_2']")
		WebElement selectyear;
		
		@FindBy(xpath="//*[@id='pp-9AyfIJ-25']")
		WebElement cvv;
		
		@FindBy(xpath="//*[@id='pp-9AyfIJ-30-announce']")
		WebElement addyourcard;
		
		
		
		
		//Initiate Page Element
		
		public PomPayementMudule()
		{
			PageFactory.initElements(driver, this);
		}
		public void ClickYourAccount()  //Your Account
		{
			youraccount.click();
		}
		public void ClickYourPayement()  //Your Payment
		{
			yourpayment.click();
		}
		public void ClickAddPayement() // Add Payment
		{
			addpayement.click();
		}
		public void ClickAddCard() //Add Card
		{
			addcard.click();
		}
		public void switchiframe() //Switch to iframe
		{
			driver.switchTo().frame(iframe);
		}
		public void EnterCardNumber() //Card Number
		{
			cardnumber.sendKeys(prop.getProperty("numberoncard"));
		}
		public void EnterNameOnCard() // Name on Card
		{
			name.sendKeys(prop.getProperty("nameoncard"));
		}
		public void ClickExpMonth() //Exp. month dropdown
		{
			expmonth.click();
		}
		public void SelectMonth() //Exp. month selection
		{
			selectmonth.click();
		}
		public void ClickExpYear() //Exp. Year dropdown
		{
			expyear.click();
		}
		public void SelectYear() //Exp. Year Selection
		{
			selectyear.click();
		}
		public void EnterCVV() //CVV Number
		{
			cvv.sendKeys(prop.getProperty("cvv"));
		}
		public void ClickAddYourCard()  //Add your Card
		{
			addyourcard.click();
		}
		public void switchdefault() //Switch back to default content
		{
			driver.switchTo().defaultContent();
		}
		
		
		
		
}
