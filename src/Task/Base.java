package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	   static WebDriver driver;
	   public static void chrome()
	   {
		   driver = new ChromeDriver();
		   
	   }
	   public static void edge() {
		   driver = new EdgeDriver();
		   
	   }
	   public static void fire() {
		   driver = new FirefoxDriver();
		   
	   }
	   public static void ie() {
		   driver = new InternetExplorerDriver();
	   }
	   public static void post() {
		   driver.close();
		   
	   }
	   public static void pre() {
		   chrome();
		   driver.manage().window().maximize();
	   }


   
	}


