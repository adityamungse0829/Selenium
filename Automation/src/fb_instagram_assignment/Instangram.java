package fb_instagram_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instangram {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.className("_ap35")).sendKeys("AdityaUser");
		
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("input[@type='password]")).sendKeys("Adi@123");
		

		
		
		driver.close();
		
		//input[@placeholder=’ Username’’]
	}

}
