package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_attribute {

	public static void main(String[] args) {
		String given_id = "small-searchterms";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	WebElement search =	driver.findElement(By.name("q"));
	String current_id = search.getAttribute("id");
	if(given_id.equalsIgnoreCase(current_id)) {
		System.out.println(current_id);
		System.out.println("id is same");
	}
	else System.out.println("id is not same");
	
		
		
	}

}
