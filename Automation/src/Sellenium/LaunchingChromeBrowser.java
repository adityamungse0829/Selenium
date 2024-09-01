package Sellenium;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingChromeBrowser {

	public static void main(String []args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the browser");

	String browsername=sc.next();
	
	if(browsername.equalsIgnoreCase("chrome")) 
	{
		ChromeDriver cd=new ChromeDriver();
		
	}
	else if(browsername.equalsIgnoreCase("firefox"))
	{
		FirefoxDriver fd=new FirefoxDriver();
	}
	else if (browsername.equalsIgnoreCase("Edge")) 
	{
		EdgeDriver ed=new EdgeDriver();

	}
	else {
		System.out.println("Invalid Option");
	}
		
	}
	
	
}
