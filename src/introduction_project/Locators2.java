package introduction_project;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String name="Newtam";
		System.setProperty("webdriver.firefox.driver", "C:/Users/newtam/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String password=getPassword(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Newtam");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
//        Thread.sleep(1000);
//         System.out.println(driver.findElement(By.tagName("p")).getText());
//         Assert.assertEquals(driver.findElements(By.tagName("p")).getText(), "You are successfully logged in.");

//        
        System.out.println(driver.findElements(By.tagName("p")).get(0).getText());
        Assert.assertEquals(driver.findElements(By.tagName("p")).get(0).getText(), "You are Successfully Logged in");
//Assert.assertEquals(driver.findElements(By.cssSelector("div[class='login-container'] h2")).getText(), null)
//	driver.findElement(By.xpath("//*[text()='Log Out']")).click(); 

//		driver.findElement(By.className("logout-btn")).click();
//		driver.close();

        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");

        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = (driver.findElement(By.cssSelector("form p")).getText());
		String[] passwordArray=passwordText.split("'");
        String password=passwordArray[1].split("'")[0];
        return password;
     
	}

}
