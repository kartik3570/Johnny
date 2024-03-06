package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Right_click extends Base{

	public static void main(String[] args) {
		pre();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions ref= new Actions(driver);
        ref.moveToElement(right_click).build().perform();
        ref.contextClick().build().perform();
        driver.findElement(By.xpath("//span[text()='Delete']")).click();
         
        
	}

}
