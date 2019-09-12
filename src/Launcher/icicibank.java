package Launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class icicibank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Jul 001\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	driver.manage().window().maximize();
	WebElement userid = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
	userid.sendKeys("jansi");
	WebElement p = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	p.sendKeys("1234567a");
	WebElement btn = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
	btn.click();
	Thread.sleep(5000);
	driver.close();
}
}