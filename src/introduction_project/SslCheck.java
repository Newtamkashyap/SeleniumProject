package introduction_project;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SslCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "/directory/path");

		options.setExperimentalOption("prefs", prefs);
		options.setAcceptInsecureCerts(true);
//		
//		FirefoxOption option1=new FirefoxOption()
//				option1.setAcceptInsecureCerts(true);

		/*
		 * above two line we are setting the path or we can say we are setting and
		 * giving idea to set the option in chrome browser,which is not directly
		 * accessbile that y we are accessising from here
		 */
		WebDriver driver = new ChromeDriver(options);
//		WebDriver driver=new FirefoxDriver(option1)

		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
