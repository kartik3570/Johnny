package Javascript_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_by_element {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.skillrary.com/");
	  Thread.sleep(2000);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement our_service = driver.findElement(By.xpath("//h2[text()='Our Services']"));
	  js.executeScript("arguments[0].scrollIntoView(true);,out_service");

	}

}
