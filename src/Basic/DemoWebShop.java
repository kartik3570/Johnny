package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		String given_url="https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
		
          if(given_url.equalsIgnoreCase(current_url))	
          {
        	  System.out.println("i am in demoweb shop");
          }
          else
        	  System.out.println("i am not in demoweb shop");
          
          driver.close();
	}

}
