package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Child_window {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
   Actions act = new Actions(driver);
   act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).build().perform();
   Thread.sleep(2000);
   driver.findElement(By.linkText("Facebook")).click();
   Thread.sleep(2000);
   String parent = driver.getWindowHandle();
   Set<String> Ecommerce = driver.getWindowHandles();
   Ecommerce.remove(parent);
   for (String str : Ecommerce) {
	driver.switchTo().window(str);
	driver.findElement(By.id(":rp:")).sendKeys("Dani");

	}
   
   
   
	}

}
