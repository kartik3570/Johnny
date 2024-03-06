package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopper_stack_login {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
    WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(30));
    WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
     login.click();
	}

}
