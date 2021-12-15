package orderBookOnline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC000_ClosePopUp {
	
	WebDriver driver;
	public TC000_ClosePopUp(WebDriver driver){
	
		this.driver=driver;

	}
	
	By PopUp=By.xpath("//body/div[@id='pum-365448']/div[@id='popmake-365448']/div[1]/p[1]/a[1]/img[1]");
	public void clickPopUpWindow() {
		driver.findElement(PopUp).click();
	}
	}
	
