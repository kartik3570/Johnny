package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Fill_data extends Base{

	public static void main(String[] args) {
    pre();
    driver.get("https://demo.automationtesting.in/Register.html");
    driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Kartik");
    driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Gupta");
    driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Nangloi-41 Delhi India");
    driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("kartikgupta@gmail.com");
    driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("12345689798");
    
//  WebElement cricket =  driver.findElement(By.xpath("//input[@value='Cricket']"));
//  cricket.click();
//  if(cricket.isSelected()){
//	  System.out.println("cricket selected");
//  } else  System.out.println("not selected");
//	  
//  
//  WebElement movies =  driver.findElement(By.xpath("//input[@value='Movies']"));
//  movies.click();
//  if(movies.isSelected()){
//	  System.out.println("movies selected");
//  } else  System.out.println("not selected");
//  
//  WebElement Hockey = driver.findElement(By.xpath("//input[@value=\"Hockey\"]"));
//  Hockey.click();
     List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
     for (WebElement webElement : checkbox) {
    	 webElement.click();		
    	 if(webElement.isSelected()) {
    		 System.out.println("hobbies are selected");
    	 }
    	 else System.out.println("hobbies are not selected");
	}
	  
  
  
    
    driver.findElement(By.xpath("//div[@id='msdd']")).click();
    driver.findElement(By.xpath("//a[text()='Italian']")).click();
    driver.findElement(By.xpath("//a[text()='Hindi']")).click();
    driver.findElement(By.xpath("//a[text()='Russian']")).click();
    WebElement Radio=driver.findElement(By.xpath("//input[@value='Male']"));
    Radio.click();
    
    if(Radio.isSelected()) {
    	System.out.println("its selected");
    	
    }
    else 
    	System.out.println("its not selected");
    

    
   
   WebElement Skills = driver.findElement(By.xpath("//select[@ng-model='Skill']"));
   
   Select ref = new Select(Skills);
   ref.selectByValue("iPhone");
   WebElement Country = driver.findElement(By.xpath("//span[@role='combobox']"));
   Country.click();
   driver.findElement(By.xpath("//li[text()='India']")).click();
   WebElement Year = driver.findElement(By.id("yearbox"));
   Select ref1 = new Select(Year);
   ref1.selectByValue("2001");
   
   WebElement Month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
   
   Select ref2 = new Select(Month);
   ref2.selectByValue("November");
   
WebElement Day =driver.findElement(By.xpath("//select[@ng-model='daybox']"));
   
   Select ref3= new Select(Day);
   ref3.selectByValue("30");
    driver.findElement(By.id("firstpassword")).sendKeys("123456");
   driver.findElement(By.id("secondpassword")).sendKeys("123456");
   
   
  WebElement button = driver.findElement(By.id("submitbtn"));
  
  if(button.isEnabled()) {
	  System.out.println("its enabled");
	  button.click();
	   }
  else 
	  System.out.println("it is not enabld");
  
  

	  
	  
	  
  }
  
  
  
	   
   
   
   
   
   
   
    
	}


