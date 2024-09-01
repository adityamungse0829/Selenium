package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithID {
	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	//to identify the email text field 
		WebElement emailTextField = driver.findElement(By.id("email"));
		
		emailTextField.sendKeys("918421910829");
		
		//By name 
		
		driver.findElement(By.name("pass")).sendKeys("Aditya@123");
		
		//By classname (We have sometimes multiple classname out of those we have to
		 //find the unique one to mention here
		driver.findElement(By.className("_6lth")).click();
		
		
			
		
		
		
	}

}
