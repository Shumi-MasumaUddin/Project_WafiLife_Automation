package orderBookOnline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC006_ClickFinishOrder {
	
	WebDriver driver;
	public TC006_ClickFinishOrder(WebDriver driver){
	
		this.driver=driver;
	}
	
	By completeOrder= By.xpath("//a[@title='checkout']");
	public void finishOrder() {
		driver.findElement(completeOrder).click();
	}

}
