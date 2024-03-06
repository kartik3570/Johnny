package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		String given_url="https://www.redbus.in/";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		String current_url=driver.getCurrentUrl();
		
		if(given_url.equalsIgnoreCase(current_url))
		{
			System.out.println("i am in redbus");
		}
		else
			System.out.println("i am not in redbus");
		
		driver.close();

	}

}
