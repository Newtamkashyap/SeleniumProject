package introduction_project;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.firefox.driver", "C:/Users/newtam/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");//synchroniziation wait for page will be fully downloaded untill all the components will load .
		driver.navigate().to("https://facebook.com");//here it will not wait .
		driver.navigate().back();
		driver.navigate().forward();
	}

}
