package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_case_task {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(15000);
	    driver.findElement(By.id("loginBtn")).click();
	    
	    
	}

}
