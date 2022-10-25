package FlipkartAutomationTest.productOrder;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import FlipkartAutomationTest.AbstractClass.AbstractClassComponent;

public class ProductOrder extends AbstractClassComponent {
	
WebDriver driver; 
Select s;
OrderLocators orderLocators;
	

	public ProductOrder(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
		

	}
	
	
	
	
	
	public void placeOrder()  {
		orderLocators =new OrderLocators(driver);
		
		orderLocators.button.click();
	
	}
	
	public void orderSummaryCard() throws InterruptedException {
		orderLocators =new OrderLocators(driver);
		windowScroll(0, 250);
		untilvisibleOfElemenClick(orderLocators.continueButton, 10);
		
		Thread.sleep(3000);
		
	}
	
	
	
	
	public void paymentOptionCard() {
		orderLocators =new OrderLocators(driver);
		windowScroll(250, 350);
		
		untilVisibleOfElement(orderLocators.UPI, 15);
		javaScriptExecutorClick(orderLocators.ChooseRadioButtonPhonepe);
		javaScriptExecutorClick(orderLocators.paymentButton);
		
		
		
		
	}
	
	
	
	
	
	//span[@class='_2dQV-8']/ancestor::label
	
	/*public void selectAddressCard(String address) {
		
		//viewAllAddressclick.click();
		String name;
		WebElement nameAddress;
		for(int i=0;i<listofAddresss.size();i++) {
			
			 name=listofAddresss.get(i).getText();
			 nameAddress=listofAddresss.get(i).findElement(By.xpath("//ancestor::label"));
			
			System.out.println(name);
			if(address.equalsIgnoreCase(name)) {
				nameAddress.click();
				break;
			}
		}
		
	}*/
	
	
	
	/*
	@FindBy(xpath = "//label[@for='CREDIT']")
	WebElement CreditCardpanel;
	
	public void paymentOptionCard() throws InterruptedException {
		
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,250)", "");
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driverWait.until(ExpectedConditions.visibilityOf(CreditCardpanel)).click();
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='CREDIT'] //input[@name='cardNumber']")).sendKeys("6075891218013570");
		WebElement dropdownMonth=driver.findElement(By.xpath("//label[@for='CREDIT'] //select[@name='month']"));
		WebElement dropdownYear=driver.findElement(By.xpath("//label[@for='CREDIT'] //select[@name='year']"));
		 s=new Select(dropdownMonth);
		s.selectByValue("2");
		s=new Select(dropdownYear);
		s.selectByValue("23");
		
		driver.findElement(By.cssSelector("input[name='cvv']")).sendKeys("672");
		
		driver.findElement(By.xpath("//button[contains(.,'PAY')]")).click();
		
	}*/
	
	

}
