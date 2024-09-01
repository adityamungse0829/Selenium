package multipleautomates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		Thread.sleep(1000);
		WebElement Search = driver.findElement(By.cssSelector("input[placeholder='Search for restaurant, cuisine or a dish']"));
		Search.sendKeys("roti");
		Search.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("p[class='sc-1hez2tp-0 sc-bLJvFH isBcSC']")).click();
		Thread.sleep(1200000);
		driver.close();
	
		
	
	
	}

}
