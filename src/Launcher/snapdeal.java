package Launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Jul 001\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.snapdeal.com/login");
	driver.manage().window().maximize();
   WebElement phoneno = driver.findElement(By.id("userName"));
   phoneno.sendKeys("12345678");
   WebElement cont = driver.findElement(By.id("checkUser"));
   cont.click();
   Thread.sleep(3000);
   driver.close();
	   
	}
}