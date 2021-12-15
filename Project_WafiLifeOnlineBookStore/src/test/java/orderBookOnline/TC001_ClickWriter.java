package orderBookOnline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC001_ClickWriter {
	
	WebDriver driver;
	public TC001_ClickWriter(WebDriver driver){
	
		this.driver=driver;
	}

	By Writer=By.xpath("//span[contains(text(),'লেখক')]");
	public void clickWriter() {
		driver.findElement(Writer).click();
	}
}
