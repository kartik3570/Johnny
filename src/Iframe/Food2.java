package Iframe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Food2 {

	public static void main(String[] args) throws InterruptedException {
		String olive = "https://www.olivegarden.com/home";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/gupta/Downloads/MultipleWindow.html");
		String Parent = driver.getWindowHandle();
		WebElement food_sites = driver.findElement(By.xpath("//input[@value='Open Food Sites']"));
		  new Actions(driver).moveToElement(food_sites).click().build().perform();
		  Thread.sleep(3000);
		  Set<String> popups = driver.getWindowHandles();
		  Thread.sleep(3000);
		  for (String str : popups) {
			  driver.switchTo().window(str);
			String current = driver.getCurrentUrl();
			if(olive.equalsIgnoreCase(current)) {
				driver.manage().window().maximize();
			}
			
		}
		
		
		

	}

}
