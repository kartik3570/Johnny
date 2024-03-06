package Screen_shot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Red_bus_screenshot {

	public static void main(String[] args) throws IOException {
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
//     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     driver.get("https://www.redbus.in/");
     TakesScreenshot ts = (TakesScreenshot) driver;
     File from = ts.getScreenshotAs(OutputType.FILE);
     File to = new File("C:\\Users\\gupta\\OneDrive\\Desktop\\ScreenShot\\redbus.jpg");
    FileHandler.copy(from, to);
     
	}

}
