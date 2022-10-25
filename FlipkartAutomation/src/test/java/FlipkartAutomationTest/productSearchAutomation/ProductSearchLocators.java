package FlipkartAutomationTest.productSearchAutomation;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchLocators {

	public ProductSearchLocators(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "	")
	WebElement hoverUsername;

	@FindBy(xpath = "//div[text()='My Profile']")
	WebElement dropdown;

	@FindBy(xpath = "//a[text()='Login']/../..")
	WebElement loginButton;

	@FindBy(css = "input[placeholder*='Search for products']")
	WebElement searchField;

	@FindBy(css = ".L0Z3Pu")
	WebElement searchButton;

	@FindBy(css = "._1AtVbE")
	List<WebElement> clickOnDesiredProduct;

	@FindBy(css = "._1xHGtK .IRpwTa")
	List<WebElement> ProductList;

	@FindBy(xpath = "//div[@class='_3wmLAA']/child::div[2] //li")
	List<WebElement> sizeList;
	
	@FindBy(xpath="//span[@class='B_NuCI']")
	WebElement selectedProduct;

}
