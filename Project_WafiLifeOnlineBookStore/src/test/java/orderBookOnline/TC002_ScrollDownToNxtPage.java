package orderBookOnline;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TC002_ScrollDownToNxtPage {
	
	WebDriver driver;
	public TC002_ScrollDownToNxtPage(WebDriver driver){
	
		this.driver=driver;
	}
	
//	public void ScrollDown(){
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	
//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
//}
	By scrollTo = By.xpath("//h3[normalize-space()='Ahmed Gias']");
	By clickPage = By.xpath("//a[normalize-space()='2']");
	
	public void ScrollDownToText(){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(scrollTo));
	
	}
	

	public void clickNextPage() {
		driver.findElement(clickPage).click();
	}
}
