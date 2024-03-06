package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		String given_url = "https://www.facebook.com/";
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com/");
	 String current_url= driver.getCurrentUrl();
  if(given_url.equalsIgnoreCase(current_url))
  {
	  System.out.println("verified url");}
	  else 
	  System.out.println("not verified url");
     driver.findElement(By.id("email")).sendKeys("kartik@123");
     driver.findElement(By.id("pass")).sendKeys("1234");
     driver.findElement(By.xpath("//button[@value=\"1\"][1]")).click();
     
  
	  
   
	}

}
