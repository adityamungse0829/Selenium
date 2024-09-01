package Webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPartialText {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//click by using Link Text
		
//		driver.findElement(By.linkText("Forgotten password?"));
//		WebElement link =driver.findElement(By.linkText("Forgotten password?"));
	
		
	driver.findElement(By.partialLinkText("Forgotten "));
		WebElement link =driver.findElement(By.partialLinkText("Forgotten "));

		link.click();
	
	
		
		
	}
}
