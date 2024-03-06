package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Click_Hold extends Base {

	public static void main(String[] args) {
   pre();
   driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
   WebElement rome = driver.findElement(By.id("box6"));
   
   WebElement italy = driver.findElement(By.id("box106"));
   Actions act = new Actions(driver);
   act.clickAndHold(rome).release(italy).build().perform();
   
	}

}
