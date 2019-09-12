package Launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitter {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Jul 001\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://twitter.com/login");
	driver.manage().window().maximize();
	WebElement user = driver.findElement(By.xpath("//input[@class='js-username-field email-input js-initial-focus']"));
	user.sendKeys("jansi");
	WebElement pass = driver.findElement(By.xpath("//input[@class='js-password-field']"));
	pass.sendKeys("1234567a");
	Thread.sleep(5000);
	driver.close();



}}
