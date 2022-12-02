package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogin
{	
	WebDriver driver;
	//Object Repository
	
	@FindBy(xpath=".//a[@id='nav-link-accountList']") // SignIn Page
	WebElement SignInPage;
	
	@FindBy(xpath=".//a[@id='createAccountSubmit']") //Create Account
	WebElement createaccount;
	
	@FindBy(xpath=".//input[@id='continue']") // Continue
	WebElement Continue;
	
	@FindBy(xpath=".//div[@id='auth-customerName-missing-alert']/div/div") //Name Validation
	WebElement namevalidation;
	
	@FindBy(xpath=".//div[@id='auth-email-missing-alert']/div/div") //	Validation Email or Mobile
	WebElement emailvalidation;
	
	@FindBy(xpath=".//div[@id='auth-password-missing-alert']/div/div")  // Validation Password
	WebElement passwordvalidation;
	
	@FindBy(xpath=".//input[@id='ap_customer_name']")
	WebElement name;
	
	@FindBy(xpath="ap_email")
	WebElement email;
	
	@FindBy(xpath=".//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath=".//input[@id='ap_password_check']")
	WebElement againpassword;
		
	//Initiate Page Element
	public PomLogin()
	{
		PageFactory.initElements(driver, this);
	}	
	public void ClickSignInPage()
	{
		SignInPage.click();
	}
	public void ClickCreateAccount()
	{
		 createaccount.click();
	}
	public void clickcontinue()
	{
		Continue.click();
	}
	public String NameValidation()
	{
		return namevalidation.getText();
	}
	public String EmailMobile()
	{
		return emailvalidation.getText();
	}
	public String PasswordValidation()
	{
		return passwordvalidation.getText();
	}
	public void YourName()
	{
		name.sendKeys("AutoTest");
	}
	public void EnterEmail()
	{
		email.sendKeys("bavek51788@rubeshi.com");
	}
	public void EnterPassword()
	{
		password.sendKeys("abc123");
	}
	public void ReEnterPassword()
	{
		againpassword.sendKeys("abc123");
	}
	

}