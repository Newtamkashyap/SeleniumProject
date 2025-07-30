package introduction_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class End2End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.firefox.driver", "C:/Users/newtam/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");//URL in the browser.
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click(); //with parent child relationship xpath	driver.findElement(By.cssSelector("ui-state-default ui-state-active ui-state-hover")).click();
		
//	driver.findElement(By.cssSelector("ui-state-default ui-state-highlight ui-state-hover")).click();
		

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click()	;
		driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		for(int i=1;i<5;i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();//4 times
			
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();

//	driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
//		or
		
//		driver.findElement(By.cssSelector("input[value='Search']")).click();
//		or
		
//		driver.findElement(By.xpath("//input[@value='Search']")).click();
//		or
		

		
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	}

}
