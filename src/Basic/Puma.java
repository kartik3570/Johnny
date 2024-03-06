package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Puma {

	public static void main(String[] args) {
		String given_title= "Men's Shoes - Buy 2024 Best Shoes for Men Online at Upto 50% Off";
     WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
         driver.get("https://in.puma.com/in/en/mens/mens-shoes");
         String current_title= driver.getTitle();
         if(given_title.equalsIgnoreCase(current_title)) {
        	 System.out.println("title is same");
         }
         else 
        	 System.out.println("title is not same");
         driver.close();
	}

}
