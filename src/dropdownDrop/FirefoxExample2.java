package dropdownDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxExample2 {
	public static void main(String[] args) throws InterruptedException { // main
		

		System.setProperty("webdriver.gecko.driver", "D://Home-Work//seleniumJars//geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		////input[@type='checkbox']
//		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
//		//driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
//		
//		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
				
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
			
		Thread.sleep(3000);
		driver.quit();

	}

}
