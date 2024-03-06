package Alters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_com {

	public static void main(String[] args) throws InterruptedException {
		
     WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
     String given_url = "https://www.naukri.com/";
     driver.navigate().to("https://www.naukri.com/");
     String current_url = driver.getCurrentUrl();
     
     
     
     if (given_url.equalsIgnoreCase(current_url)) {
    	 System.out.println("url verified");
 WebElement given_button =   driver.findElement(By.xpath("//a[@id='register_Layer']"));
  if(given_button.isEnabled()) {
	  given_button.click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("name")).sendKeys("Johny Bhaiya");
	  driver.findElement(By.id("email")).sendKeys("johny69@hotmail.com");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Johny6969@");
	  driver.findElement(By.id("mobile")).sendKeys("6969696969");
	  driver.findElement(By.xpath("//p[contains(text(),'I have work experience (excluding internships)')]")).click();
	  driver.findElement(By.id("resumeUpload")).sendKeys("D:\\New folder//resume new1.pdf");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='WhatsApp']")).click();
	  
  }
    	 
		
	}
     else 
    	 System.out.println("not verified");
     
	}

}
