package dropdownDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class e2e {
	public static void main(String[] args) throws InterruptedException { // main

		System.setProperty("webdriver.gecko.driver", "D://Home-Work//seleniumJars//geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='DEL']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();

		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(4000);

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

			System.out.println("its disabled");

			Assert.assertTrue(true);

		}

		else

		{

			Assert.assertTrue(false);

		}
		
		Thread.sleep(4000);
		Thread.sleep(4000);

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		Thread.sleep(4000);

		driver.findElement(By.id("divpaxinfo")).click();

	Thread.sleep(3000L);

	
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();

		Thread.sleep(3000L);
		

		driver.findElement(By.id("btnclosepaxoption")).click();
//
//		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
//
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		driver.findElement(By.cssSelector("input[value='Search']")).click();

		 driver.findElement(By.xpath("//input[@value='Search']")).click();

		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

	}

}
