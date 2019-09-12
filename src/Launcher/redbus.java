package Launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Jul 001\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.redbus.in ");
	driver.manage().window().maximize();
	WebElement from = driver.findElement(By.id("src"));
	from.sendKeys("Pallikarani");
	WebElement to = driver.findElement(By.id("dest"));
	Thread.sleep(5000);
	to.sendKeys("pollachi");
	Thread.sleep(5000);
	driver.close();

}
}