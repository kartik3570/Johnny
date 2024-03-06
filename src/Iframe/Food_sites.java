package Iframe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Food_sites {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.navigate().to("file:///C:/Users/gupta/Downloads/MultipleWindow.html");
   String Parent = driver.getWindowHandle();
  WebElement food_sites = driver.findElement(By.xpath("//input[@value='Open Food Sites']"));
  new Actions(driver).moveToElement(food_sites).click().build().perform();
  Thread.sleep(3000);
  
  Set<String> popups = driver.getWindowHandles();
  for (String str : popups) {
	  if(Parent.equalsIgnoreCase(str)) {
		  
	  }
	  else {
		  driver.switchTo().window(str);
		  driver.close();
	  }
}
  
   
  
  
  
	}

}
