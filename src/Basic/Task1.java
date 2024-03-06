package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		String given_url ="https://demowebshop.tricentis.com/register";
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demowebshop.tricentis.com/register");
     String current_url = driver.getCurrentUrl();
     driver.findElement()
	}

}
