package org.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
public static void main(String[] args) {
	System.setProperty("webDriver.chrome driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium1\\Folder\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	WebElement id = driver.findElement(By.id("username"));
	id.sendKeys("seeganpaul;");
	driver.findElement(By.id("password"));
	
}
}
