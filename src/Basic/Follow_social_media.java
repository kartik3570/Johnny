package Basic;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Follow_social_media{

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String dws_handle = driver.getWindowHandle();
		System.out.println(dws_handle);
		List<WebElement> follow = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		Actions act = new Actions(driver);
		for (WebElement web : follow) {
			act.keyDown(Keys.CONTROL).click(web).build().perform();
			
		}
		Set<String> multiple_window = driver.getWindowHandles();
		System.out.println(multiple_window);

	}
 
	}


