package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Myntra_login extends Base{

	public static void main(String[] args) throws InterruptedException {
 
		pre();
		String given_url="https://www.myntra.com/";
        driver.navigate().to("https://www.myntra.com/");	
        WebElement profile = driver.findElement(By.xpath("//span[@data-reactid=\"856\"]"));
        new Actions(driver).moveToElement(profile).build().perform();
        Thread.sleep(1000);
        //click on login
        driver.findElement(By.xpath("//a[@data-reactid=\"865\"]")).click();
        //click on field and enter number
        driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]")).sendKeys("6969696969");
        //click on continue
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class=\"submitBottomOption\"]")).click();
        //click on back
        Thread.sleep(2000);
        driver.navigate().back();
        //verify by url
        String current_url=driver.getCurrentUrl();
        if (given_url.equalsIgnoreCase(current_url)) {
        	System.out.println("verify url");
        }
        else 
        	System.out.println("url not verify");
        
        
		
	}

}
