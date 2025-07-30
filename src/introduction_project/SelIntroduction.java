package introduction_project;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class SelIntroduction {
	public static void main(String[]agrs) {
		
		
		//invoking Browser
		//chrome - chromeDriver->Method
		//firefox - firefoxDriver ->methods
		//safari saafariDriver ->methods close get
		//webDriver close get
		//
//		ChromeDriver.driver=new ChromeDriver();
//		driver.resetInputState();
		
		//instead of chromeDriver we will use Webdriver
		
		//Chromedriver.exe -> Chrome browser Selenium Manager// responsible for invovke chrome browser
		//step to invoke chrome driver 
//		System.setProperty("webdriver.chrome.driver", "C:/Users/newtam/Downloads/chrome-headless-shell-win64.zip");
//		WebDriver driver = new ChromeDriver();
	
		
		
//		fireFox Launch
		//geckodriver
		
		//webdriver.gecko.driver
//		System.setProperty("webdriver.firefox.driver", "C:/Users/newtam/Downloads/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		//Microsoft Edge
		//	webdriver.Edge.driver
		System.setProperty("webdriver.edge.driver", "C:/Users/newtam/Downloads/edgedriver_win64");
	    WebDriver driver = new EdgeDriver();
		
//		driver.get("http://localhost:8080/Introduction_project");
		driver.get("http://www.rahulshettyacademy.com/");//for loading new page in our browser.
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		}
	

}
