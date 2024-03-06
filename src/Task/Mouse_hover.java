package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/");
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		new Actions(driver).moveToElement(women).build().perform();
		driver.findElement(By.xpath("//a[@data-reactid=\"281\"]")).click();
	}

}
