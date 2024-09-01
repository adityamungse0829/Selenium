package fb_instagram_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.className("_6lti")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.name("firstname")).sendKeys("Aditya");
		
		
		driver.findElement(By.name("lastname")).sendKeys("Mungse");

		driver.findElement(By.name("reg_email__")).sendKeys("8421910829");

		driver.findElement(By.id("password_step_input")).sendKeys("Aditya@123");
		
		driver.findElement(By.id("u_3_t_cm")).click();
		
		driver.findElement(By.name("birthday_day")).click();
		

		
		

		
		
		
		
	}

}
