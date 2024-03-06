package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbusnew {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     String title_DWS="Demo Web Shop";
     String red_given_url="https://www.redbus.in/";
     String given_url="https://demowebshop.tricentis.com/";
     driver.manage().window().maximize();
     driver.get(given_url);
     Thread.sleep(2000);
     String current_Url=driver.getCurrentUrl();
     if(red_given_url.equalsIgnoreCase(current_Url)) {
    	 System.out.println();
     }
     
	}

}
