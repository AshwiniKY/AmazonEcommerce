package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomAddressModule extends BaseAmazonClass 
{

	//Object Repository
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement youraccount;
	
	@FindBy(xpath="//*[contains(text(),'Your Addresses')]")
	WebElement youraddress;
	
	@FindBy(xpath="//*[contains(text(),'Add Address')]")
	WebElement addnewaddress;
	
	@FindBy(xpath="//span[@id='address-ui-widgets-countryCode']//span//span//span")
	WebElement country;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement fullname;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
	WebElement phonenumber;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressCity']")
	WebElement city;
	
	@FindBy(xpath="//span[@id='address-ui-widgets-enterAddressStateOrRegion']")
	WebElement provincedropdown;
	
	@FindBy(xpath="//a[text()='Ontario']")
	WebElement ontario;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
	WebElement postalcode;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-use-as-my-default']")
	WebElement defaultaddress;
	
	@FindBy(xpath="//span[@id='address-ui-widgets-form-submit-button']//span//input")
	WebElement addaddress;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-original-address-block_id-input']")
	WebElement suggestion;
	
	@FindBy(xpath="//span[@id='a-autoid-2']//span//input")
	WebElement saveaddress;
	
	//Initiate Page Element
	
	public PomAddressModule()
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickYourAccount()
	{
		youraccount.click();
	}
	public void ClickYourAddress()
	{
		youraddress.click();
	}
	public void ClickAddNewAddress()
	{
		addnewaddress.click();
	}
	public String CountryName()
	{
		return country.getText();
	}
	public void EnterName()
	{
		fullname.sendKeys(prop.getProperty("fullname"));
	}
	public void EnterPhoneNumber()
	{
		phonenumber.sendKeys(prop.getProperty("phonenumber"));
	}
	public void EnterAddress()
	{
		address.sendKeys(prop.getProperty("address"));
	}
	public void EnterCity()
	{
		city.sendKeys(prop.getProperty("city"));
	}
	public void ClickProvince()
	{
		provincedropdown.click();
	}
	public void SelectOntario()
	{
		ontario.click();
	}
	public void EnterPostalCode()
	{
		postalcode.sendKeys(prop.getProperty("postalcode"));
	}
	public void ClickDefaultAddress()
	{
		defaultaddress.click();
	}
	public void ClickAddAddress()
	{
		addaddress.click();
	}
	public void ClickSuggestion()
	{
		suggestion.click();
	}
	public void ClickSaveAddress()
	{
		saveaddress.click();
	}
	
}
