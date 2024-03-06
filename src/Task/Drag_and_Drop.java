package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop extends Base {

	public static void main(String[] args) {
   pre();
   driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
   WebElement source = driver.findElement(By.id("box6"));
   WebElement target = driver.findElement(By.id("box106"));
   Actions act = new Actions(driver);
   act.dragAndDrop(source, target).build().perform();
   
   WebElement oslo = driver.findElement(By.id("box1"));
   WebElement norway = driver.findElement(By.id("box101"));
   act.dragAndDrop(oslo, norway).build().perform();
   
   WebElement Washington = driver.findElement(By.id("box3"));
   WebElement Us = driver.findElement(By.id("box103"));
   act.dragAndDrop(Washington, Us).build().perform();
   
   WebElement Copen = driver.findElement(By.id("box4"));
   WebElement Denmark = driver.findElement(By.id("box104"));
   act.dragAndDrop(Copen, Denmark).build().perform();
   
   WebElement Madrid= driver.findElement(By.id("box7"));
   WebElement Spain = driver.findElement(By.id("box107"));
   act.dragAndDrop(Madrid, Spain).build().perform();
   
   WebElement Seoul= driver.findElement(By.id("box5"));
   WebElement Korea = driver.findElement(By.id("box105"));
   act.dragAndDrop(Seoul, Korea).build().perform();
   
   WebElement Stock= driver.findElement(By.id("box2"));
   WebElement Sweden = driver.findElement(By.id("box102"));
   act.dragAndDrop(Stock, Sweden).build().perform();
   
   
   
   
   
   
   
	}

}
