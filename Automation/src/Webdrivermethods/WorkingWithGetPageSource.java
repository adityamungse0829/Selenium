package Webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetPageSource {
	
	public static void main(String []args) 
	{
		WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://open.spotify.com/");
	 
	 System.out.println(driver.getPageSource());
	}

}


