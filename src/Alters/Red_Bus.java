package Alters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Red_Bus {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--disable-notifications");
		
      WebDriver driver = new ChromeDriver(chrome);
       driver.manage().window().maximize();
       driver.get("https://www.redbus.in/");
       driver.findElement(By.id("src")).sendKeys("Delhi");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//text[contains(text(),'ISBT Kashmiri Gate')]")).click();
       driver.findElement(By.id("dest")).sendKeys("Mumbai");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//text[@class='placeHolderMainText'][normalize-space()='Mumbai']")).click();
       driver.findElement(By.xpath("//span[normalize-space()='22']")).click();
       
	}

}
