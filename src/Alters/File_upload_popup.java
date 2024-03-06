package Alters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_popup {

	public static void main(String[] args) throws InterruptedException {
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\New folder\\resume new1.pdf");
  
 
  
	}

}
