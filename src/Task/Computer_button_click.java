package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Computer_button_click {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://demowebshop.tricentis.com/");
    WebElement given_button=driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
    		if(given_button.isDisplayed()) {
    	    	 System.out.println("i m in dws");
    	    	 given_button.click();    	  }
    	     else System.out.println("i m not in dws");
    		}

	}


