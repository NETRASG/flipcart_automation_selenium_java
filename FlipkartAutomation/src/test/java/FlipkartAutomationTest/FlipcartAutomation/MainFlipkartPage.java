package FlipkartAutomationTest.FlipcartAutomation;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import FlipkartAutomationTest.ConstantValueClass.ConstantValues;
import FlipkartAutomationTest.ConstantValueClass.FileRederClass;
import FlipkartAutomationTest.LoginAutomation.LoginAutomation;
import FlipkartAutomationTest.baseClass.BaseClassConfiguration;
import FlipkartAutomationTest.productCartandOrder.AddToCartProduct;
import FlipkartAutomationTest.productOrder.ProductOrder;
import FlipkartAutomationTest.productSearchAutomation.ProductSearchAutomation;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MainFlipkartPage extends BaseClassConfiguration {
	
	
	@Test
	public void TestCase() throws InterruptedException{
	 	
		//ConstantValues constData=new ConstantValues();
		FileRederClass fileRederClass=new FileRederClass();
		fileRederClass.jsonReader();
		WebDriver driver=driverSetup();
		pageOpen();
	 	Thread.sleep(3000);
	 	
	 	LoginAutomation loginAutomation=new LoginAutomation(driver);
	 	ProductSearchAutomation productSearchAutomation=loginAutomation.getLoginIntoFlipcart(fileRederClass.getPhoneNum(),fileRederClass.getPassword());
	 	productSearchAutomation.afterLoginACtion(fileRederClass.getUserName());
	 	
	 	String selectedProductName=productSearchAutomation.searchProduct(fileRederClass.getProductName());
	 	
	 	productSearchAutomation.selectSize();
	 	
	 	AddToCartProduct addCart=new AddToCartProduct(driver);
	 	addCart.addToCart();
	 	
	 	ProductOrder order=new ProductOrder(driver);
	 	
	 	order.placeOrder();
	 	order.orderSummaryCard();
	 	order.paymentOptionCard();
	 	
	 	
	 	
	 	
	 	

	}
	
 

}
