package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dws_Title {

	public static void main(String[] args) {
 
	String given_title= "Demo Web Shop";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String current_title = driver.getTitle();
	
	if(given_title.equalsIgnoreCase(current_title)) {
		
		System.out.println("title is correct");
	}
	else 
		System.out.println("title is incorrect");
	
	driver.close();

	}

}
