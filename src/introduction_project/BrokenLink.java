//L-110
package introduction_project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		
//broken link/url-404 ,means not working found 404
		//step1- Is to get all urls tied up to the links using selenium
	//Java methods will call the URL's and get you the status code.->which tells us what is the status
		//if status code >400 then that url's is not working => link which tied to url is broken.
	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href"); //Eg: this link is working
		
		String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");//Eg: broken link
	HttpURLConnection conn=	(HttpURLConnection)new URL(url).openConnection();
	
	
	conn.setRequestMethod("HEAD");
	conn.connect();
	int respCode=conn.getResponseCode();
	System.out.println(respCode);
	}

}
