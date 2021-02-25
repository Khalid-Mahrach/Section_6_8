package allSection8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class D_49V2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D://Home-Work//seleniumJars//geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.lufthansa.com/be/en/homepage");
		//cm-acceptAll
		Thread.sleep(3000);
		driver.findElement(By.id("cm-acceptAll")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath
		("//input[@id='dcep-a385ace26-5ae4-4ac6-ae63-c303b5f54c6f-flm-flight-flightQuery.flightSegments[0].destinationCode']")).click();
		
	Thread.sleep(3000);
	
//	driver.findElement(By.className(".btn.btn-secondary.mw-100 mb-md-0.dropdown-btn")).click();
//	
//	Thread.sleep(3000);
	
//		
//		for (int i=1;i<5;i++) {
//			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
//			
//		}
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
