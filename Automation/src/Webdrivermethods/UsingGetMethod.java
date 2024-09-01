package Webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetMethod {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();

driver.get("http://192.168.0.127:58080/moapp/");

//to get the title
String actual_title= driver.getTitle();
String expected_title="Welcome to the Messaging Extranet";
if(actual_title.equals(expected_title)) {
	System.out.println("Title is correct which is = " + actual_title);
	
}else {
	
	System.out.println("Title is inccorrect");

}

//to fetch the url or validate the url

String actual_url=driver.getCurrentUrl();
String expected_url1="http://192.168.0.127:58080/";
String expected_url2="http://192.168.0.127:58080/moapp/user/#no-back-button";



if(actual_url.equals(expected_url1))
{
	System.out.println("Url is correct which is = " + expected_url1);

}else if (actual_url.equals(expected_url2))
{
	
	System.out.println("Url is  correct which is = " + expected_url2);

}
else {
	System.out.println("Url is  incorrect ");

	
}



}
	
}
