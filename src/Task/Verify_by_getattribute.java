package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_by_getattribute {

	public static void main(String[] args) {
		String given_data ="Mia khalifa";
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demowebshop.tricentis.com/");
     WebElement search_field = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
     search_field.sendKeys("Mia khalifa");
     String current_data = search_field.getAttribute("value");
     if(given_data.equalsIgnoreCase(current_data)) {
    	 System.out.println("dany daniels");
    	 driver.findElement(By.cssSelector("['type=\"submit\"']")).click();
    	 
     }
     else System.out.println("alleta ocean");
	}

}
