package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_keys {

	public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.navigate().to("https://demowebshop.tricentis.com/");
     driver.findElement(By.linkText("Register")).click();
	}

}
