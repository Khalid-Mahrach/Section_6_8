package allSection8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class D_56 {
	public static void main(String[] args) throws InterruptedException {
		


			System.setProperty("webdriver.gecko.driver", "D://Home-Work//seleniumJars//geckodriver.exe");

			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.spicejet.com/");
			
			// as default is one Way clickbar
			// driver.findElement(By.id("")).click();
			// <div id="Div1" class="picker-second" style="display: block; opacity: 0.5;">
			
			// click of return date then:opacity: 0.5 not enabled false
			// click of return date then:opacity: 1 enabled is true
			
			// <input id="ctl00_mainContent_rbtnl_Trip_0" type="radio"
			// name="ctl00$mainContent$rbtnl_Trip" value="OneWay">

			// <input id="ctl00_mainContent_rbtnl_Trip_1" type="radio"
			// name="ctl00$mainContent$rbtnl_Trip" value="RoundTrip">
			
			

			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			
			if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
				System.out.println("enabled");
				Assert.assertTrue(true);

			} else {
				System.out.println("not enabled");
				Assert.assertTrue(false);

			}

			Thread.sleep(3000);
			driver.quit();

		}

	}
