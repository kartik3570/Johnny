package Screen_shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ease_my_trip_scrrenshot {

	public static void main(String[] args) throws IOException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.easemytrip.com/");
    TakesScreenshot ts = (TakesScreenshot) driver;
    File from = ts.getScreenshotAs(OutputType.FILE);
    File to = new File("C:\\Users\\gupta\\OneDrive\\Desktop\\ScreenShot\\emt.jpg");
   FileHandler.copy(from, to);
	}

}
