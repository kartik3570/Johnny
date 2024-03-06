package Alters;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
      WebDriver  driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demo.automationtesting.in/Alerts.html");
      driver.findElement(By.linkText("Alert with Textbox "));
      driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
      Alert alt = driver.switchTo().alert();
      Thread.sleep(1000);
      alt.sendKeys("kartik");
      alt.accept();
      
	}

}
