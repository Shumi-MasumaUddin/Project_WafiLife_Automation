package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Setup {
		
		public static WebDriver driver;
		
		@BeforeSuite
		public static void openDriver() {
		
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		@AfterSuite
		public static void driverClose() {
			driver.close();
		}
	}


