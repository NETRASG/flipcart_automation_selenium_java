package FlipkartAutomationTest.LoginAutomation;

import java.awt.Window;
import java.io.FileReader;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FlipkartAutomationTest.AbstractClass.AbstractClassComponent;
import FlipkartAutomationTest.ConstantValueClass.FileRederClass;
import FlipkartAutomationTest.productSearchAutomation.ProductSearchAutomation;
import net.bytebuddy.asm.Advice.Argument;

public class LoginAutomation extends AbstractClassComponent {

	WebDriver driver;
	LoginLocators loginLocators;
	

	public LoginAutomation(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
		
		
	}
	

	public ProductSearchAutomation getLoginIntoFlipcart(String phone, String psswd) throws InterruptedException {
		loginLocators=new LoginLocators(driver);
		javaScriptExecutorClick(loginLocators.loginButton);
		loginLocators.phoneOrEmail.sendKeys(phone);
		loginLocators.password.sendKeys(psswd);
		loginLocators.loginSubmitButton.click();
		Thread.sleep(2000);
		return new ProductSearchAutomation(driver);
		

	}

}
