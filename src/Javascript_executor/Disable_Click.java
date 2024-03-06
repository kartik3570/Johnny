package Javascript_executor;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Disable_Click {

	public static void main(String[] args) {
 
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
        
	}
	

}
