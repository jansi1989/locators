package Launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Jul 001\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.irctc.co.in/");
	driver.manage().window().maximize();
	WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	from.sendKeys("jansi");
	WebElement to = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	to.sendKeys("1234566");
	Thread.sleep(5000);
	driver.close();
	
}
}