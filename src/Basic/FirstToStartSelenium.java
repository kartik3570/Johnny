package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstToStartSelenium {

	public static void main(String[] kartik) throws InterruptedException {
		 
 WebDriver driver =new ChromeDriver();
 driver.manage().window().maximize();
 //driver.get("https://demowebshop.tricentis.com/");
 driver.navigate().to("https://demowebshop.tricentis.com/");
 driver.navigate().back();
 driver.navigate().forward();
 Thread.sleep(5000);
 driver.navigate().refresh();
 
 driver.close();
	}

}
