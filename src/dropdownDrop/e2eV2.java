package dropdownDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class e2eV2 {
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
		driver.quit();

	}

}
