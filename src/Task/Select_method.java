package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_method extends Base_class{

	public static void main(String[] args) throws InterruptedException {
		precondition1();
		driver.get("file:///C:/Users/gupta/Downloads/demo.html");
		WebElement single_level = driver.findElement(By.id("standard_cars"));
		Select ref = new Select(single_level);
//		Thread.sleep(1000);
//	    ref.selectByIndex(0);
//		Thread.sleep(1000);
//
//		ref.selectByIndex(1);
//		Thread.sleep(1000);
//
//       ref.selectByIndex(2);
//		Thread.sleep(1000);
//
//		ref.selectByIndex(3);
//		Thread.sleep(1000);
//		ref.selectByIndex(4);
//		Thread.sleep(1000);
//		ref.selectByIndex(5);
//		Thread.sleep(1000);
//		ref.selectByIndex(6);
//		Thread.sleep(1000);
//		ref.selectByIndex(7);
//		Thread.sleep(1000);
//
//		ref.selectByIndex(8);
//		Thread.sleep(1000);
//
//		ref.selectByIndex(9);
//		Thread.sleep(1000);
//
//		ref.selectByIndex(10);
//		Thread.sleep(1000);
//
//		
//		ref.selectByIndex(11);
		
//		Normal for loop
//		
//		int size = driver.findElements(By.xpath("//select[@id=\"standard_cars\"]/option")).size();
//		
//		
//		for(int i=0;i<=size;i++) {
//     ref.selectByIndex(i);
//     Thread.sleep(1000);
       
//		FOR EACH LOOP
	 List<WebElement> car_brand=ref.getOptions();
	 for(WebElement web: car_brand) {
		 web.click();
			Thread.sleep(1000);

	 }
	 
		
		

			
		}

       
		
		
		
	}


