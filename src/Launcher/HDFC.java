package Launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Jul 001\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.manage().window().maximize();
	WebElement userid = driver.findElement(By.xpath("//input[@class='input_password']"));
	userid.sendKeys("11024581");

	}

}
