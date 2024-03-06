package Alters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ease_my_trip {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(chrome);
		driver.manage().window().maximize();
		driver.get("https://easemytrip.com");
		driver.findElement(By.id("FromSector_show")).click();
		driver.findElement(By.id("spn3")).click();
		Thread.sleep(2000);	
//		driver.findElement(By.id("Editbox13_show")).click();
//		Thread.sleep(2000);
		 driver.findElement(By.id("a_Editbox13_show")).sendKeys("Kolkata");
		  
		  Thread.sleep(1000);	
		  driver.findElement(By.id("spnKolkata")).click();
		  
		  
		  
		
		

	}

}
