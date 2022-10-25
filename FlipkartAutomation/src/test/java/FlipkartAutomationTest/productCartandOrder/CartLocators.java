package FlipkartAutomationTest.productCartandOrder;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartLocators {
	
	public CartLocators(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='ADD TO CART']")
	WebElement cartButton;

	@FindBy(xpath = "//button[text()='GO TO CART']")
	WebElement goToCart;

	@FindBy(xpath = "//li/button")
	WebElement button;
	
	@FindBy(xpath = "//div[@class='_2nQDXZ']/parent::div")
	List<WebElement> listOfCartProd;
	
	
}
