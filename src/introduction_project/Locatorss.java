package introduction_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatorss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver", "C:/Users/newtam/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Newtam");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshetty");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.linkText("Forgot your password?")).click();
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Newtam");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("nky3037@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9765432111");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.className("reset-pwd-btn")).click();
        driver.findElement(By.className("go-to-login-btn")).click();   
        driver.findElement(By.id("inputUsername")).sendKeys("Newtam Kashyap");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();
//        driver.findElement(By.className("logout-btn")).click();
	}

}
