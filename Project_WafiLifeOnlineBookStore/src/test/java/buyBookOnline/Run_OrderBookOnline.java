package buyBookOnline;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basePackage.Driver_Setup;
import orderBookOnline.TC000_ClosePopUp;
import orderBookOnline.TC001_ClickWriter;
import orderBookOnline.TC002_ScrollDownToNxtPage;
import orderBookOnline.TC003_SelectAuthor;
import orderBookOnline.TC004_ViewBookDetails;
import orderBookOnline.TC005_ClickOrder;
import orderBookOnline.TC006_ClickFinishOrder;
import orderBookOnline.TC007_CheckOutDetails;

public class Run_OrderBookOnline extends Driver_Setup{
	
public static String baseUrl="https://www.wafilife.com/";
	
	
	@Test
	public static void visit_Site() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
//		TC000_ClosePopUp Pop_Up = new TC000_ClosePopUp(driver);
//		Pop_Up.clickPopUpWindow();
//		Thread.sleep(2000);
//		
		TC001_ClickWriter clickWriter = new TC001_ClickWriter(driver);
		clickWriter.clickWriter();
		Thread.sleep(2000);
		
		TC002_ScrollDownToNxtPage scrollDown = new TC002_ScrollDownToNxtPage(driver);
		//scrollDown.ScrollDown();
		scrollDown.ScrollDownToText();
		Thread.sleep(2000);
		scrollDown.clickNextPage();
		Thread.sleep(2000);
		
		TC003_SelectAuthor SelectAuthor = new TC003_SelectAuthor(driver);
		SelectAuthor.clickAnyAuthor();
		Thread.sleep(2000);
		
		TC004_ViewBookDetails BookDetails = new TC004_ViewBookDetails(driver);
		BookDetails.ViewDetails();
		Thread.sleep(2000);
		
		TC005_ClickOrder ClickOrder = new TC005_ClickOrder(driver);
		ClickOrder.orderBook();
		Thread.sleep(2000);
		
		TC006_ClickFinishOrder ClickFinishOrder = new TC006_ClickFinishOrder(driver);
		ClickFinishOrder.finishOrder();
		Thread.sleep(2000);
		
		TC007_CheckOutDetails CheckOut = new TC007_CheckOutDetails(driver);
		CheckOut.enterName("Shumi");
		Thread.sleep(2000);
		CheckOut.enterPhNum("+8801711055601");
		Thread.sleep(2000);
		CheckOut.enterEmail("abcahmedd@yahoo.com");
		Thread.sleep(2000);
		CheckOut.selectDistrict();
		Thread.sleep(2000);
		CheckOut.selectArea();
		Thread.sleep(2000);
		CheckOut.enterAddress("34 Jalalabad Housing Society, Khulshi, Chittagong");
		Thread.sleep(3000);
		CheckOut.shippingMethod();
		Thread.sleep(2000);
		CheckOut.paymentMethod();
		Thread.sleep(2000);
		CheckOut.completeOrder();
		Thread.sleep(10000);
		
		
		
	
	}
}
