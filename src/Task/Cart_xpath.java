package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart_xpath {

	public static void main(String[] args) {
		String given_url = "https://demowebshop.tricentis.com/cart";
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/cart");
    String current_url= driver.getCurrentUrl();
     if(given_url.equalsIgnoreCase(current_url)) {
    	 System.out.println("verified");
     }
     else 
    	 System.out.println("not verified");
	
	driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a/span")).click();

	}
}
