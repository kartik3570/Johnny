package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_window_handles {

	public static void main(String[] args) {
	   
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
	 String	dws_handle = driver.getWindowHandle();
	 System.out.println(dws_handle);
		

	}

}
