package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dws_seach {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("file:///C:/Users/gupta/Downloads/iframe.html");
    driver.switchTo().frame("FR1");
    driver.findElement(By.id("small-searchterms")).sendKeys("ocean");
	}

}
