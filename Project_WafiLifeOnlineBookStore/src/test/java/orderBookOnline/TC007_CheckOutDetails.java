package orderBookOnline;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC007_CheckOutDetails {

	WebDriver driver;
	public TC007_CheckOutDetails(WebDriver driver){
	
		this.driver=driver;
	}
	
	By Name=By.xpath("//input[@id='billing_first_name']");
	By PhNum=By.xpath("//input[@id='billing_phone']");
	By Email=By.xpath("//input[@id='billing_email']");
	By District=By.xpath("//span[@class='select2-selection__rendered']");
	By AllDistrictOptions=By.xpath("//li[@class='select2-results__option']");
	By Area=By.xpath("//select[@id='billing_area']");
	By Address=By.xpath("//textarea[@id='billing_address_1']");
	By HomeDelivery =By.xpath("//label[@for='shipping_method_0_flat_rate9']");
	By CashOnDelivery =By.xpath("//input[@id='payment_method_cod']");
	By FinishOrder=By.xpath("//button[@id='place_order']");
	
	public void enterName(String text) {
		driver.findElement(Name).sendKeys(text);
	}
	
	public void enterPhNum(String text) {
		driver.findElement(PhNum).sendKeys(text);	
	}
	
	public void enterEmail(String text) {
		driver.findElement(Email).sendKeys(text);
	}
	
	public void selectDistrict() {
		
		driver.findElement(District).click();
		//Thread.sleep(3000);
		 
 		List<WebElement> allDistrictList = driver.findElements(AllDistrictOptions);
 		System.out.println(allDistrictList.size());
 		
 		String OptionToSelect = "Chattogram";
 		for(WebElement ele:allDistrictList) {
	 			
 			if(ele.getText().contains(OptionToSelect)) {
 				
 				ele.click();
 				break;
 			}
 			
 		}
	}
	
	public void selectArea() {
		//driver.findElement(Area);
		Select s = new Select(driver.findElement(Area));
		s.selectByIndex(9);
		
		
	}
	
	public void enterAddress(String text) {
		driver.findElement(Address).sendKeys(text);
	}
	
	public void shippingMethod() {
		driver.findElement(HomeDelivery).click();
	}
	
	public void paymentMethod() {
		driver.findElement(CashOnDelivery).click();
	}
	
	public void completeOrder() {
		driver.findElement(FinishOrder).click();
	}
}

