package allSection8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D_51 {
	
		public static void main(String[] args) throws InterruptedException { // main
			System.out.println(); // sysout

			System.setProperty("webdriver.gecko.driver", "D://Home-Work//seleniumJars//geckodriver.exe");

			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.spicejet.com/");
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("//a[@value='GAU']")).click();
			//Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[@value='AMD'])[2]")).click();
			//driver.findElement(By.xpath("(//a[@value='AMD']")).click();
		//	Thread.sleep(3000);
			driver.quit();

		}

	

		
	}


