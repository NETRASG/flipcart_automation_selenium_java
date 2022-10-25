package FlipkartAutomationTest.baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FlipkartAutomationTest.ConstantValueClass.ConstantValues;

import java.util.Properties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassConfiguration {
	
	WebDriver driver;
	ConstantValues constData=new ConstantValues();
	
	
	
 	
 	public WebDriver driverSetup() {
 		
 		WebDriverManager.chromedriver().setup();
 	 	
 	  driver=new ChromeDriver();
 	  return driver;
 	 	
 		
 	}
 	
 	public void pageOpen() {
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(constData.getImplicitWait()));
 	 	driver.manage().window().maximize();
 	 	
 	 	driver.get(constData.getUrl());
 	}

}
