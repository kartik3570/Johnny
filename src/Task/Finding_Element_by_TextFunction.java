package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finding_Element_by_TextFunction {

	public static void main(String[] args) {
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.navigate().to("https://www.facebook.com/");
     WebElement given_button=driver.findElement(By.xpath("//a[text()='Create new account']"));
     if(given_button.isDisplayed()) {
    	 System.out.println("i m in fb");
    	 given_button.click();    	  }
     else System.out.println("i m not in fb");
	}

}
