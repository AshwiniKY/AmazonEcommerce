package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.TimeUtils;

public class BaseAmazonClass {

	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	// Getting Data from Configuraton file and Handling exceptions
	public BaseAmazonClass()
	{
	try {
	FileInputStream file=new FileInputStream("C:\\Users\\ashwi\\eclipse-workspace\\AmazonEcommerce\\src\\test\\java\\environmentvariables\\Config.properties");
	prop.load(file);
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException a)
	{
		a.printStackTrace();
	}
	}

	// Selecting browser
	public static void initiation()
	{
		String browsername = prop.getProperty("browser"); //Calling browser from config file
		
		//Selection between two browsers Friefox and Chrome
		if(browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.geco.driver", "geckodriver.exe");
			driver=new FirefoxDriver();
		}	
		else if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}
		
	// Maximize Window
		driver.manage().window().maximize();
	// TimeOut
		driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage, TimeUnit.SECONDS);
	// URL
		driver.get(prop.getProperty("url"));
		
		//Object Repository
		
		driver.findElement(By.xpath(".//a[@id='nav-link-accountList']")).click();
		
		driver.findElement(By.xpath(".//input[@id='ap_email']")).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.xpath(".//input[@id='continue']")).click();
		
		driver.findElement(By.xpath(".//input[@id='ap_password']")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.xpath(".//input[@id='signInSubmit']")).click();
			
	
   	}
	
	
	
}