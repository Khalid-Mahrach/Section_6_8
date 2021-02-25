package dropdownDrop;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Updated_dropdown {


public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

//System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
//
//WebDriver driver=new ChromeDriver();

System.setProperty("webdriver.gecko.driver", "D://Home-Work//seleniumJars//geckodriver.exe");

WebDriver driver = new FirefoxDriver();

driver.get("https://www.spicejet.com/");

Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();

Select s1=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));

s1.selectByValue("3");

Thread.sleep(2000);

Select s2=new Select(driver.findElement(By.xpath("//*[@id='childDropdown']/span[1]/following-sibling::select")));

s2.selectByValue("3");

Thread.sleep(2000);

Select s3=new Select(driver.findElement(By.xpath("//*[@id='infantDropdown']/span[1]/following-sibling::select")));

s3.selectByValue("3");

Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();

}


}