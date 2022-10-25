package FlipkartAutomationTest.productSearchAutomation;

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
import FlipkartAutomationTest.ConstantValueClass.ConstantValues;

import java.util.*;

public class ProductSearchAutomation extends AbstractClassComponent {
	
	ConstantValues constVal=new ConstantValues();

	WebDriver driver;
	ProductSearchLocators productSearchLocators;

	public ProductSearchAutomation(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	// to check correct user Account
	public void afterLoginACtion(String username) throws InterruptedException {
		productSearchLocators=new ProductSearchLocators(driver);

		untilInvisibleOfElement(productSearchLocators.loginButton, 15);

		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String name = driverWait.until(ExpectedConditions.visibilityOf(productSearchLocators.hoverUsername)).getText();
		System.out.println(name);
		Assert.assertEquals(name, constVal.getUsername());

	}


	public String searchProduct(String productNmae) throws InterruptedException {
		productSearchLocators=new ProductSearchLocators(driver);

		productSearchLocators.searchField.sendKeys(productNmae);
		
		productSearchLocators.searchButton.click();
		Thread.sleep(3000);

		System.out.println(productSearchLocators.ProductList);
		productSearchLocators.ProductList.stream().filter(product -> product.getText().split(" ")[0].equalsIgnoreCase("Men")).findFirst().orElse(null).click();
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> it = tabs.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);
		String selectedProductName = productSearchLocators.selectedProduct.getText();
		return selectedProductName;

	}

	

	public void selectSize() throws InterruptedException {
		productSearchLocators=new ProductSearchLocators(driver);

		windowScroll(0, 250);

		productSearchLocators.sizeList.stream().filter(size -> size.getText().equalsIgnoreCase("M")).findFirst().orElse(null).click();

		Thread.sleep(3000);

	}

}
