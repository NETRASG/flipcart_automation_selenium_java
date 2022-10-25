package FlipkartAutomationTest.AbstractClass;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FlipkartAutomationTest.baseClass.BaseClassConfiguration;



public class AbstractClassComponent extends BaseClassConfiguration {
	
	WebDriver driver;
	JavascriptExecutor executor;
	WebDriverWait driverWait;
	
	public AbstractClassComponent(WebDriver driver) {
	
		this.driver = driver;
		executor=(JavascriptExecutor) driver;
	}
	
	public void javaScriptExecutorClick(WebElement element) {
		
		executor.executeScript("arguments[0].click()",  element);
		
	}
	
	public void availbleForClickable(WebElement element,long seconds) {
		driverWait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
		driverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	
	
	public void untilInvisibleOfElement(WebElement element, long seconds) {
		driverWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		driverWait.until(ExpectedConditions.invisibilityOf(element));
		
	}
	
	public void untilVisibleOfElement(WebElement element, long seconds) {
		driverWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		driverWait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void untilvisibleOfElemenClick(WebElement element, long seconds) {
		driverWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		driverWait.until(ExpectedConditions.visibilityOf(element)).click();;
		
	}
	
	public void windowScroll(int x,int y) {
		executor.executeScript("window.scrollBy("+x+","+y+")", "");
	}
	


	
	
	
	
	

}
