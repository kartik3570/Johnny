package Task;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Open_all_header_ {

	public static void main(String[] args) throws InterruptedException {
		String home = "https://demowebshop.tricentis.com/";
		String digital = "https://demowebshop.tricentis.com/digital-downloads";
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/");
    List<WebElement> header = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
    Actions act = new  Actions(driver);
    
    for (WebElement web : header) {
    	act.keyDown(Keys.CONTROL).moveToElement(web).click().build().perform();
    	}
    Set<String> productids = driver.getWindowHandles();
    
    for (String str : productids) {
    	driver.switchTo().window(str);
    	String current_url = driver.getCurrentUrl();
    	if(digital.equalsIgnoreCase(current_url)) {
    	 List<WebElement> cart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
    	for (WebElement web : cart) {
    		web.click();
    		Thread.sleep(2000);
    		
			
		}
    	driver.close();
    	
    	}    	
    	else if (current_url.equalsIgnoreCase(home)) {
    		driver.navigate().refresh();
    	}
    	else
    		driver.close();
	}
	}

}
