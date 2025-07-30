package introduction_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Omsent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.firefox.driver", "C:/Users/newtam/Downloads/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://omsent.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for city,area or locality ..']")).sendKeys("Saharsa");
//        driver.findElement(By.className("close_btn")).click();
		driver.manage().window().maximize();
//		WebElement closeButton = driver.findElement(By.xpath("//div[@role='dialog']//button[contains(@class, 'close')]"));
//        closeButton.click();
//		driver.findElement(By.className("auth-btn")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//        driver.findElement(By.className("la-times")).click();
		// Continue with further actions

		try {

			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-overlay")));
			WebElement locationCloseBtn = wait
					.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.cursor.close_btn")));
			locationCloseBtn.click();
			System.out.println("Closed Location popup");
			Thread.sleep(1000);

			wait.until(ExpectedConditions.elementToBeClickable(By.id("close_details_btn")));
			WebElement saleCloseBtn = driver.findElement(By.id("close_details_btn"));
			saleCloseBtn.click();
			System.out.println("Closed Super Sale popup");

//	            WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.auth-btn")));
//	            signIn.click();
//	            System.out.println("Clicked Sign In");

//	            WebElement signInBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className(".auth-btn")));
//	            signInBtn.click();
//	            System.out.println("Clicked Sign In");
//	            wait.until(ExpectedConditions.elementToBeClickable(By.className("a.la-lock")));
//	            WebElement signInBtn = driver.findElement(By.className("a.la-lock"));
//	           signInBtn.click();
//	            System.out.println("Click sign in button");

//	            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-overlay")));
//	            WebElement sBtn = wait.until(ExpectedConditions.elementToBeClickable(
//	                    By.className("a.auth-btn")));
//	            sBtn.click();
//	            System.out.println("Click");
		
//			i[class='las la-lock']

		} catch (Exception e) {
			System.out.println("sign page is not clickable.");
			e.printStackTrace();
		}
//		driver.findElement(By.cssSelector(".Sign In")).click();
		
		 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.auth-btn")));
      WebElement signInBtn = driver.findElement(By.cssSelector("a.auth-btn"));
      signInBtn.click();
       System.out.println("Signed In");
       
//       driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9931093102");  
       
       WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement mobileInput = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mobile']")));
       mobileInput.sendKeys("9931093102");
       
       driver.findElement(By.cssSelector("button[type='submit']")).click();
       

//		 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
//    WebElement verifyButton = driver.findElement(By.cssSelector("button[type='submit']"));
//    verifyButton.click();
//     System.out.println("Verified successfully");
       
       Thread.sleep(30000);
       
       WebElement verifyButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Verify')]")));
       verifyButton.click();

       System.out.println("OTP Sent Successfully");
       
//       Thread.sleep(15000);
//       
//       WebElement selectDistrict = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'address_selection')]")));
//       selectDistrict.click();
//       System.out.println("Saharsa");

       
//       driver.close();

	}
}