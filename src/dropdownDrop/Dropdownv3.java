package dropdownDrop;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdownv3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D://Home-Work//seleniumJars//geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(4000);
		//List<WebElement> option = driver.findElements(By.cssSelector("").cl
		
		for(int i=1;i<9;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		}

	
		
		
		
	}

}
