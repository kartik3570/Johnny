package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_xpath {

	public static void main(String[] args) {
		String given_url = "https://demowebshop.tricentis.com/";
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    
    String current_url = driver.getCurrentUrl();
    if(given_url.equalsIgnoreCase(current_url)) {
    	System.out.println("i m in current page");
    	driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
    	}
    	else 
    		System.out.println("i m not in current url");
    
    	
    	
    }
	}


