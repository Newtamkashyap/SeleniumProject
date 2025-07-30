package introduction_project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
public class Miscelleaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();// delete all the cookies in your browser
//		driver.manage().deleteCookieNamed("sessionKey");// not all cookies will delete herer,which u want give the name that
													// will delete only

		/*
		 * delete the session cookies and make sure that secure login and gets logout
		 * and he has the navigate to the home page
		 */
		
		//click on any link //login page-verify login url.
		
		
		driver.get("http://google.com");
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File("D://screenshort.png")); //local directory,directly we can not give the "C" drive there are some protocol so we can either use different drive or we can use "C" drive with the path.
		FileUtils.copyFile(src,new File("C:\\Users\\newtam\\screenshort.png"));
		
	}

}
