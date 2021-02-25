package allSection8;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D_49 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D://Home-Work//seleniumJars//geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("divpaxinfo")).click();
		
//		Thread.sleep(3000);
//		
//		for (int i=1;i<5;i++) {
//			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
//			
//		}
//		Thread.sleep(3000);
//		driver.quit();
		
	}

}
