package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopers_stack {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    String given_url = "https://www.shoppersstack.com/";
    driver.manage().window().maximize();
    driver.get("https://www.shoppersstack.com/");
    
   String current_url= driver.getCurrentUrl();
   if (given_url.equalsIgnoreCase(current_url)) {
	   System.out.println("page verified");
	   Thread.sleep(15000);
	   WebElement login_button = driver.findElement(By.xpath("//button[@id='loginBtn']"));
	 if(login_button.isEnabled()) {
		 System.out.println("login button verified");
		 login_button.click();
		WebElement create_account = driver.findElement(By.xpath("//span[text()='Create Account']"));
		if(create_account.isEnabled()) {
			Thread.sleep(2000);
			System.out.println("create account verified");
			create_account.click();
			
			Thread.sleep(2000);
			
			
		driver.findElement(By.id("First Name")).sendKeys("Kartik");
		driver.findElement(By.id("Last Name")).sendKeys("Gupta");
		driver.findElement(By.id("Male")).click();
		driver.findElement(By.id("Phone Number")).sendKeys("1234567891");
		driver.findElement(By.id("Email Address")).sendKeys("kartik098@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("K@rtik123");
		driver.findElement(By.id("Confirm Password")).sendKeys("K@rtik123");
		driver.findElement(By.id("Terms and Conditions")).click();
		driver.findElement(By.id("Register")).click();
		
		
			
		}
		else System.out.println("create account not verified");
		
	 }  
	 else System.out.println("login not verified");
	   
	   
   }
   else System.out.println("not verified");
  
    
	}

}
