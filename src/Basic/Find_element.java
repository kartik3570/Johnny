package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_element {

	public static void main(String[] args) {
		String given_url="https://demowebshop.tricentis.com/";
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://demowebshop.tricentis.com/");
    String current_url= driver.getCurrentUrl();
    if(given_url.equalsIgnoreCase(current_url))
    {
    	System.out.println("i am in Dws page");
     WebElement element= driver.findElement(By.className("ico-register"));
     element.click();
    }
    else 
    	System.out.println("in am not in Dws page");
    
	}

}
