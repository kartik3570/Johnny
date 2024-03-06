package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_by_keys {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    Actions act = new Actions(driver);
    List<WebElement> web = driver.findElements(By.xpath("//div[@class=\"header-links\"]/ul/li"));
     for (WebElement webElement : web) {
    	 
    	 
    act.keyDown(Keys.TAB).build().perform();
    act.keyDown(Keys.CONTROL).build().perform();
    act.keyDown(Keys.ENTER).build().perform();
		
	}
    
	}

}
