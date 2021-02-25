package dropdownDrop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "");

System.setProperty("webdriver.chrome.driver", "D://Home-Work//seleniumJars//chromedriver.exe");

		//WebDriver driver = new FirefoxDriver();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		

	}

}
