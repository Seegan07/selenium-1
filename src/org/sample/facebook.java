package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class facebook {
       public static void main(String[] args) throws InterruptedException, AWTException {
    	   System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium1\\Folder\\chromedriver.exe");
    	   WebDriver driver=new ChromeDriver();
   		   driver.manage().window().maximize();
           driver.get("https://adactinhotelapp.com/");
           driver.manage().window().maximize();
           WebElement txtUserName = driver.findElement(By.id("username"));
   		   txtUserName.sendKeys("seeganpaul");
   		  WebElement txtPassWord = driver.findElement(By.id("password"));
   		  txtPassWord.sendKeys("Seeganpaul.7");
   		  WebElement btnLogin = driver.findElement(By.id("login"));
   		  btnLogin.click();
   		  WebElement ddnLocation = driver.findElement(By.id("location"));
           Select select=new Select(ddnLocation);
           select.selectByIndex(8);
           WebElement ddnHotels = driver.findElement(By.id("hotels"));
           Select select1=new Select(ddnHotels);
           select1.selectByIndex(1);
           WebElement ddnRoomType = driver.findElement(By.id("room_type"));
           Select select2=new Select(ddnRoomType);
           select2.selectByIndex(2);
           WebElement ddnNoOfRooms = driver.findElement(By.id("room_nos"));
           Select select3=new Select(ddnNoOfRooms);
           select3.selectByIndex(3);
           WebElement ddnCheckIn = driver.findElement(By.id("datepick_in"));
           ddnCheckIn.click();
           Robot robot=new Robot();
           robot.keyPress(KeyEvent.VK_CONTROL);
           robot.keyPress(KeyEvent.VK_A);
           robot.keyRelease(KeyEvent.VK_CONTROL);
           robot.keyRelease(KeyEvent.VK_A);
           ddnCheckIn.sendKeys("20/06/2022");
           WebElement ddnCheckOut = driver.findElement(By.id("datepick_out"));
           ddnCheckOut.click();
           Robot robot1=new Robot();
           robot1.keyPress(KeyEvent.VK_CONTROL);
           robot1.keyPress(KeyEvent.VK_A);
           robot1.keyRelease(KeyEvent.VK_CONTROL);
           robot1.keyRelease(KeyEvent.VK_A);
           ddnCheckOut.sendKeys("23/06/2022");
           WebElement ddnAdultsRoom = driver.findElement(By.id("adult_room"));
           Select select5=new Select(ddnAdultsRoom);
           select5.selectByIndex(2);
           WebElement ddnChildRoom = driver.findElement(By.id("child_room"));
           Select select6=new Select(ddnChildRoom);
           select6.selectByIndex(1);
           WebElement btnSearch = driver.findElement(By.name("Submit"));
           btnSearch.click();
           WebElement btnSelect = driver.findElement(By.id("radiobutton_0"));
           btnSelect.click();
           WebElement btnContinue = driver.findElement(By.id("continue"));
           btnContinue.click();
           WebElement txtFirstName = driver.findElement(By.id("first_name"));
           txtFirstName.sendKeys("Seegan");
           WebElement txtLastName = driver.findElement(By.id("last_name"));
           txtLastName.sendKeys("Paul");
           WebElement txtAddress = driver.findElement(By.id("address"));
           txtAddress.sendKeys("Chennai");
           WebElement txtCCard= driver.findElement(By.id("cc_num"));
           txtCCard.sendKeys("9876543210123411");
           WebElement txtCCardType= driver.findElement(By.id("cc_type"));
           Select select7 =new Select(txtCCardType);
           select7.selectByIndex(1);
           WebElement txtCCardExpiryMonth= driver.findElement(By.id("cc_exp_month"));
           Select select8 =new Select(txtCCardExpiryMonth);
           select8.selectByIndex(10);
           WebElement txtCCardExpiryYear= driver.findElement(By.id("cc_exp_year"));
           Select select9 =new Select(txtCCardExpiryYear);
           select9.selectByIndex(11);
           WebElement txtCCardCvv= driver.findElement(By.id("cc_cvv"));
           txtCCardCvv.sendKeys("098");
           WebElement btnBookNow= driver.findElement(By.id("book_now"));
           btnBookNow.click();
           WebElement printAttribute= driver.findElement(By.id("order_no"));
           String attribute = printAttribute.getAttribute("value");
           System.out.println(attribute);
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
//    	   driver.get("http://demo.automationtesting.in/Alerts.html");
//    	  WebElement clickBtn = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
//    	  Actions actions = new Actions(driver);
//    	  actions.moveToElement(clickBtn).perform();
//    	  clickBtn.click();
//    	  WebElement clkPrmtBox = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
//    	  clkPrmtBox.click();
//    	  Alert al = driver.switchTo().alert();
//    	  Thread.sleep(1000);
//    	  al.sendKeys("seegan");
//    	  al.accept();
//    	  WebElement welcomeText = driver.findElement(By.xpath("//p[contains(text(),'Hello')]"));
//    	  String text = welcomeText.getText();
//    	  System.out.println(text);
//    	  
    	  
    	  
    	  
    	  //driver.quit();    	  
    	  }

}
