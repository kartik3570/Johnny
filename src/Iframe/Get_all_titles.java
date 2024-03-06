package Iframe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Get_all_titles {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("file:///C:/Users/gupta/Downloads/MultipleWindow.html");
            String Parent = driver.getWindowHandle();
    		WebElement food_sites = driver.findElement(By.xpath("//input[@value='Open Food Sites']"));
    		  new Actions(driver).moveToElement(food_sites).click().build().perform();
    		  Set<String> popups = driver.getWindowHandles();
    		  Thread.sleep(3000);
    		  for (String str : popups) {
    			  driver.switchTo().window(str);

          System.out.println(driver.getTitle());
          
          
		
	}

	}}