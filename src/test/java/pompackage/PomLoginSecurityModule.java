package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomLoginSecurityModule extends BaseAmazonClass  
{
	//Object Repository
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement youraccount;
	
	@FindBy(xpath="//h2[contains(text(),'  Login & security')]")
	WebElement loginsecurity;
	
	@FindBy(xpath="//span[@id='a-autoid-0']//span/input")
	WebElement editname;
	
	@FindBy(xpath="//input[@id='cnep_1C_submit_button']")
	WebElement savename;
	
	@FindBy(xpath="//div[@id='auth-success-message-box']//div//h4")
	WebElement successmessage;
	
	@FindBy(xpath="//a[@id='auth-cnep-done-button']")
	WebElement done;
	
	//Initiate Page Element
	
	public PomLoginSecurityModule()
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickYourAccount()
	{
		youraccount.click();
	}
	public void ClickLoginSecurity()
	{
		loginsecurity.click();
	}
	public void ClickEditName()
	{
		editname.click();
	}
	public void ClickSaveName()
	{
		savename.click();
	}
	public String SuccessMessage()
	{
		return successmessage.getText();
	}
	public void ClickDone()
	{
		done.click();
	}
	
	
	
	
}
