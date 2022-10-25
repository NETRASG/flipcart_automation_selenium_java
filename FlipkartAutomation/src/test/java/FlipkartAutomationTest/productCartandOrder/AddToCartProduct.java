package FlipkartAutomationTest.productCartandOrder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import FlipkartAutomationTest.AbstractClass.AbstractClassComponent;

import java.util.*;

public class AddToCartProduct extends AbstractClassComponent {

	WebDriver driver;
	CartLocators cartLocators;

	public AddToCartProduct(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}


	public void addToCart() {
		cartLocators=new CartLocators(driver);

		windowScroll(0, 250);
		availbleForClickable(cartLocators.button, 15);

	}

	String productName;

	public void selectCartProduct(String selectedProductName) {
		cartLocators=new CartLocators(driver);
		for (int i = 2; i <= cartLocators.listOfCartProd.size(); i++) {

			productName = cartLocators.listOfCartProd.get(i).findElement(By.cssSelector("._2Kn22P")).getText();
			WebElement productSaveForLater = cartLocators.listOfCartProd.get(i).findElement(By.cssSelector("._2Kn22P"));

			System.out.println(productName + " " + i);
			
			productSaveForLater.findElement(By.xpath("//div/descendant::div[text()='Save for later']" + "[" + i + "]"))
					.click();

			WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(15));

			driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("._2sKwjB")));

		}

	}

}
