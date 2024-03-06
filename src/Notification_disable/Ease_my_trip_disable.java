package Notification_disable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ease_my_trip_disable {

	public static void main(String[] args) {
      ChromeOptions ch_options = new ChromeOptions();
      ch_options.addArguments("--disable-notifications");
      WebDriver driver = new ChromeDriver(ch_options);
      driver.manage().window().maximize();
      driver.get("https://www.easemytrip.com/");
	}

}
