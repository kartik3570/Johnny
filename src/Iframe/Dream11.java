package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dream11 {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.dream11.com/");
    Actions a = new Actions(driver);
    a.keyDown(Keys.PAGE_DOWN).build().perform();
   // driver.switchTo().frame(0);  by using indexing
    WebElement number = driver.findElement(By.id("send-sms-iframe"));
    driver.switchTo().frame(number);
    Thread.sleep(2000);
   driver.findElement(By.id("regEmail")).sendKeys("6969696969"); 
 
	}

}
