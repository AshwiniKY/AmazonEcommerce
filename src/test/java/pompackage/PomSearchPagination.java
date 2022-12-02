package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomSearchPagination extends BaseAmazonClass 
{

	//Object Repository
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchbox;
	
	@FindBy(xpath="//span[@id='nav-search-submit-text']//input")
	WebElement search;
	
	@FindBy(xpath="//a[contains(text(),'Next')]")
	WebElement nextpage;
	
	@FindBy(xpath="//a[contains(text(),'Previous')]")
	WebElement previouspage;
	
	@FindBy(xpath="//*[@id=\"p_89/Amazon Essentials\"]/span/a/div/label/i")
	WebElement brand;
	
	@FindBy(xpath="//*[contains(text(),'$25 to $50')]")
	WebElement price;
	
	@FindBy(xpath="//*[contains(text(),'Any Price')]")
	WebElement anyprice;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]")
	WebElement product;
		
	
	
	//Initiate Page Element
	
	public PomSearchPagination()
	{
		PageFactory.initElements(driver, this);
	}
	public void EnterSearchBox()
	{
		searchbox.sendKeys(prop.getProperty("iteam"));
	}
	public void ClickSearch()
	{
		search.click();
	}
	public void ClickNextPage()
	{
		nextpage.click();
	}
	public void ClickPrevious()
	{
		previouspage.click();
	}
	public void SelectBrand()
	{
		brand.click();
	}
	public void DisSelectBrand()
	{
		brand.click();
	}
	public void SelectPrice()
	{
		price.click();
	}
	public void AnyPrice()
	{
		anyprice.click();
	}
	public void SelectProduct()
	{
		product.click();
	}
	
}
