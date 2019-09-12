package Launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Jul 001\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement enter = driver.findElement(By.name("q"));
	enter.sendKeys("GreensTechnology");
	Thread.sleep(5000);
	driver.close();

}
}
