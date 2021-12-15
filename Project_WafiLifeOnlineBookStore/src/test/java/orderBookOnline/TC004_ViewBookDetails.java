package orderBookOnline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC004_ViewBookDetails {

	WebDriver driver;
	public TC004_ViewBookDetails(WebDriver driver){
	
		this.driver=driver;
	}
	
	By BookDetails =By.xpath("//a[contains(text(),'The Foolish Crocodile')]");
	public void ViewDetails() {
		driver.findElement(BookDetails).click();;
	}
}
