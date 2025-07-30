package introduction_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DialogeBox_Assignment {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// System.setProperty("webdriver.firefox.driver",
		// "C:/Users/newtam/Downloads/geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         String name="NewtamKashyap";
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
//		
//		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
	}

}
