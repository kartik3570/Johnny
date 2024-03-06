package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base_class {
  static WebDriver driver;
  public static void precondition1() {
	  driver = new ChromeDriver();
	   driver.manage().window().maximize();

	  
  }
  public static void precondition2() {
	  driver = new EdgeDriver();
	   driver.manage().window().maximize();

	  
  }
  public static void precondition3() {
	  driver = new InternetExplorerDriver();
	   driver.manage().window().maximize();

	  
  }
  public static void precondition4() {
	  driver = new SafariDriver();
	   driver.manage().window().maximize();

  }
  public static void precondition5() {
	  driver = new FirefoxDriver();
	   driver.manage().window().maximize();

  }
  public static void postconditionclose() {
	  driver.close();
  }
  public static void postconditionquit() {
	  driver.quit();
  }
  
  
}
