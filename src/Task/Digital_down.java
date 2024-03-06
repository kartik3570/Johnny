package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Digital_down {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      String given_title = "Demo Web Shop";
      driver.get("https://demowebshop.tricentis.com/");
   String current_title = driver.getTitle();
    if (given_title.equalsIgnoreCase(current_title)) {
    	System.out.println("title is verified");
    	
    	driver.findElement(By.xpath("//a[contains( text(),'Digital downloads')]")).click();
  List<WebElement> web = driver.findElements(By.xpath("//input[@value='Add to cart']"));
  for (WebElement Kartik : web) {
	  Kartik.click();
	  Thread.sleep(2000);
	
}
 
	}
    	  	
		
    	
    
    
      
	}

}
