package dropdownDrop;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownautoSuggestive {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D://Home-Work//seleniumJars//geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//   driver.findElement(By.id("")).sendKeys("");
//		WebDriverWait wait = new WebDriverWait(driver, 4000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("id"))));
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		List<WebElement> option = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for (WebElement webElement : option) {
			if (webElement.getText().equals("India")) {
				webElement.click();
				break;
				
			}
			
		}
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
