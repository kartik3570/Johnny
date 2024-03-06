package Screen_shot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Webelement {

	public static void main(String[] args) throws IOException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://photogallery.indiatimes.com/Pictures-of-Sunny-Leone-the-bold-the-beautiful-and-the-most-searched-celebrity-in-the-world/morphshow/64016370.cms?from=mdr");
	org.openqa.selenium.WebElement sunny_leone = driver.findElement(By.className("nextSlideshows"));
	File from = sunny_leone.getScreenshotAs(OutputType.FILE);
   File to = new File ("C:\\Users\\gupta\\OneDrive\\Desktop\\ScreenShot\\sunny.jpg");
   FileHandler.copy(from, to);
   
	
	}

}
