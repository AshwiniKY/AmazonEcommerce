package testLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pompackage.PomLogin;

public class LoginTest 
{
	public static void main(String[] args) throws InterruptedException
	{
	 
	

	   	System.setProperty("webdriver.geco.driver", "geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	
    	// Maximize Window
    	driver.manage().window().maximize();
    	
    	driver.get("https://www.amazon.ca/");
    	
    	PomLogin Log = new PomLogin();
    	
    	Thread.sleep(2000);
    	Log.ClickSignInPage();
    	Thread.sleep(200);
    	Log.ClickCreateAccount();
    	Thread.sleep(200);
    	Log.clickcontinue();
    	Thread.sleep(200);
    	Log.NameValidation();
    	Thread.sleep(200);
    	Log.EmailMobile();
    	Thread.sleep(200);
    	Log.PasswordValidation();
    	Thread.sleep(200);
    	Log.YourName();
    	Thread.sleep(200);
    	Log.EnterEmail();
    	Thread.sleep(200);
    	Log.EnterPassword();
    	Thread.sleep(200);
    	Log.ReEnterPassword();
    	Thread.sleep(200);
        
	}
	
}
