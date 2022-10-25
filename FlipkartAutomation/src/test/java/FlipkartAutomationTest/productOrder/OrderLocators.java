package FlipkartAutomationTest.productOrder;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderLocators {

	public OrderLocators(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Place Order')]/..")
	WebElement button;
	
	
	@FindBy(xpath = "//div[contains(text(),'View all')]")
	WebElement viewAllAddressclick;
	
	
	@FindBy(css = "p span:nth-child(1)")
	List<WebElement> listofAddresss;
	
	
	@FindBy(xpath="//button[contains(.,'CONTINUE')]")
	WebElement continueButton;
	

	@FindBy(xpath="//label[@for='UPI']")
	WebElement UPI;
	
	@FindBy(xpath="//input[@id='PHONEPE']")
	WebElement ChooseRadioButtonPhonepe;
	
	@FindBy(xpath = "//label[@for='PHONEPE'] //button")
	WebElement paymentButton;
}
