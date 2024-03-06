package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redtape {

	public static void main(String[] args) {
		String given_url= "https://redtape.com/";
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://redtape.com/");
	 String current_url= driver.getCurrentUrl();
	 if(given_url.equalsIgnoreCase(current_url)) {
		 System.out.println("i am in redtape website");
	 }
	 else 
		 System.out.println("i am not in red tape site");
	 driver.close();

	}

}
