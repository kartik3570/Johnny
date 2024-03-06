package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_function {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 
 driver.navigate().to("https://demowebshop.tricentis.com/");
 String given_title= "Demo Web Shop";
 
 String current_title = driver.getTitle();
 String given_url= "https://demowebshop.tricentis.com/books";

 
 if(given_title.equalsIgnoreCase(current_title)) {
	 System.out.println("title is matched");
	 WebElement given_button=driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
	 if(given_button.isDisplayed())
	 {
		 System.out.println("webelement is present");
		 given_button.click();
		 String current_Url=driver.getCurrentUrl();

		 
		 if (given_url.equalsIgnoreCase(current_Url)) {
			 System.out.println("url is verified");
			 Thread.sleep(5000);
			 driver.navigate().back();
			 WebElement given_button1=driver.findElement(By.xpath("//title[contains(text(),'Demo Web Shop')]"));
	    		if(given_button1.isDisplayed()) {
	    			System.out.println("homepage webelement is verfied");
	    		}
	    		else 
	    			System.out.println("not");
	  


			 
		 }
		 else 
			 System.out.println("url is not verified");
	 }
 }
 
 else 
	 System.out.println("title is not match");
 
 
 
	}

}
