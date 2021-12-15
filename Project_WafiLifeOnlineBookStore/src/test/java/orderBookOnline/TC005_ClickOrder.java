package orderBookOnline;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TC005_ClickOrder {
	
	WebDriver driver;
	public TC005_ClickOrder(WebDriver driver){
	
		this.driver=driver;
	}
	
	By doOrder = By.xpath("//div[@class='body-wrapper']//button[2]");
	public void orderBook() {
		//driver.findElement(doOrder).sendKeys(Keys.RETURN);
		driver.findElement(doOrder).click();
	}

	

}
