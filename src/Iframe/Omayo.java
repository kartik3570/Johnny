package Iframe;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Omayo {

	public static void main(String[] args) {
   WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(30));
      driver.navigate().to("https://omayo.blogspot.com/");
	  Actions act = new Actions(driver);
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  act.keyUp(Keys.PAGE_DOWN).build().perform();
	  
	  WebElement Button3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
	 
	  Button3.click();
	  Alert ref = driver.switchTo().alert();
	      ref.accept();
	      driver.findElement(By.className("dropbtn")).click();
	      WebElement Flipkart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));
	      Flipkart.click();
	}

}
