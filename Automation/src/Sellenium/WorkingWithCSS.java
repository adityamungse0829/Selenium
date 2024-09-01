package Sellenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCSS {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

Thread.sleep(1000);
driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Aditya");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Password");
Thread.sleep(1000);
driver.findElement(By.cssSelector("button[value='1']")).click();

	}

}
