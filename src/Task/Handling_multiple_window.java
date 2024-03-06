package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_multiple_window {

	public static void main(String[] args) throws InterruptedException {
		String dws = "https://demowebshop.tricentis.com/";
		String facebook = "https://www.facebook.com/nopCommerce";
       String twitter = "https://twitter.com/nopCommerce";
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Twitter")).click();
		Set<String> ecommerce = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String str : ecommerce) {
			driver.switchTo().window(str);
			String current_url = driver.getCurrentUrl();
		if(dws.equalsIgnoreCase(current_url))	{
			driver.findElement(By.id("small-searchterms")).sendKeys("alleta ocean");
			
		}	
		else if (facebook.equalsIgnoreCase(current_url)) {
			
		driver.findElement(By.id(":rp:")).sendKeys("Dani Danials");
		Thread.sleep(2000);
		}
		else 
			driver.findElement(By.partialLinkText("Create account")).click();
		Thread.sleep(2000);
	}
	}

}
