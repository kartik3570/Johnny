package Alters;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_alert {

	public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/");
      driver.findElement(By.cssSelector("input[type='submit']")).click();
      Alert ref = driver.switchTo().alert();
      ref.accept();
	}

}
