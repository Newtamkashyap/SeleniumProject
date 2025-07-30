package introduction_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.firefox.driver", "C:/Users/newtam/Downloads/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");//URL in the browser.
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
	System.out.println(	driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());
	
	System.out.println(	driver.findElements(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).size());
	driver.findElement(By.id("divpaxinfo")).click();
	
	Thread.sleep(2000);
	
//	driver.findElement(By.id("hrefIncAdt")).click();
//	driver.findElement(By.id("hrefIncAdt")).click();
//	driver.findElement(By.id("hrefIncAdt")).click();
//	instead of writing 4 times same code we will use loop .
	
	
	//using while loop
	int i=1;//initialization
//	while(i<5) {
////		"hello" - infinite times
//		
//		driver.findElement(By.id("hrefIncAdt")).click();//4 times
//		i++;
//	}
	
	//or  using for loop
	
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	for(;i<5;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();//4 times
		
	}
	
	driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
//	System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
//	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click()	;
//	System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	
	//instead of above enabled()we will use getDomAttribute()
	
System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click()	;
System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));



	}

}
