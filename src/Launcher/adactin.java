package Launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Jul 001\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.adactin.com/HotelApp/");
	driver.manage().window().maximize();
	WebElement user = driver.findElement(By.id("username"));
	user.sendKeys("jansi");
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("1234567");
	WebElement btn = driver.findElement(By.id("login"));
	btn.click();
	Thread.sleep(5000);
	driver.close();
	

}
}