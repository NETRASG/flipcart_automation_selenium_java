package FlipkartAutomationTest.LoginAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators {
	
	
	
	
	public LoginLocators(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Login']/../..")
	WebElement loginButton;

	@FindBy(xpath = "//span[text()='Enter Email/Mobile number']/preceding::input[1]")
	WebElement phoneOrEmail;

	@FindBy(xpath = "//span[text()='Enter Password']/preceding::input[1]")
	WebElement password;

	@FindBy(xpath = "//button/span[text()='Login']")
	WebElement loginSubmitButton;

}
