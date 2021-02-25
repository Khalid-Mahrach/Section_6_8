package locator_section6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D://Home-Work//seleniumJars//geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://sso.teachable.com/secure/9521/users/sign_in?clean_login=true&reset_purchase_session=1");
		WebElement web_login = driver.findElement(By.id("user_email"));
		WebElement web_psw = driver.findElement(By.id("user_password"));
		WebElement comit = driver.findElement(By.name("commit"));
		
		web_login.sendKeys("kha.mahrach@gmail.com");
		Thread.sleep(4000);
		
		web_psw.sendKeys("Yassir2009*");
		Thread.sleep(4000);
		
		comit.click();
		Thread.sleep(4000);
	}

}
