package Launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Jul 001\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/ ");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	WebElement e = driver.findElement(By.id("email"));
	e.sendKeys("jansi");
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys("1234567a");
	WebElement btn = driver.findElement(By.id("loginbutton"));
	btn.click();
	driver.close();

	}
}
