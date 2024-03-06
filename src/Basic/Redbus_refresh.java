package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus_refresh {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.redbus.in/");
		 driver.navigate().back();
		 driver.navigate().forward();
		 Thread.sleep(5000);
		 driver.navigate().refresh();
		 driver.close();
		 


	}

}
