package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adidas {

	public static void main(String[] args) {
		String
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shorturl.at/hmsvB");
		driver.close();
		
	}

}
