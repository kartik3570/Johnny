package Iframe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Maximize_all_window {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     String given_url = "file:///C:/Users/gupta/Downloads/MultipleWindow.html";
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/gupta/Downloads/MultipleWindow.html");
		String Parent = driver.getWindowHandle();
		WebElement food_sites = driver.findElement(By.xpath("//input[@value='Open Food Sites']"));
		  new Actions(driver).moveToElement(food_sites).click().build().perform();
		  Thread.sleep(3000);
		  Set<String> popups = driver.getWindowHandles();
		  Thread.sleep(2000);
		  for (String str : popups) {
			  driver.switchTo().window(str);
		String current	= driver.getCurrentUrl();
			 if(given_url.equalsIgnoreCase(current)) {
				 
			 }
			 else {
				 driver.manage().window().maximize();
			 }
			  
			
		}
	}

}
