package Task;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Scroll_with_keys extends Base{

	public static void main(String[] args) throws InterruptedException {
   pre();
   driver.get("https://demowebshop.tricentis.com/");
     Actions act = new Actions(driver);
     
     act.keyDown(Keys.PAGE_DOWN).build().perform();
     Thread.sleep(2000);
     act.keyUp(Keys.PAGE_UP).build().perform();
     
     act.keyDown(Keys.PAGE_DOWN).build().perform();
     Thread.sleep(2000);
     act.keyDown(Keys.PAGE_UP).build().perform();
     
	}

}
