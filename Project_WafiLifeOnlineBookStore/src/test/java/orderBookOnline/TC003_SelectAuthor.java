package orderBookOnline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC003_SelectAuthor {
	WebDriver driver;
	public TC003_SelectAuthor(WebDriver driver){
	
		this.driver=driver;
	}
	
	By SelectAuthor =By.xpath("//h3[normalize-space()='Antara Raisa']");
	public void clickAnyAuthor() {
		driver.findElement(SelectAuthor).click();
	}

}
