package introduction_project;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1>Give me the count of links on the page.

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2)Give a count of footer section.
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// limiting webdriver scope.
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3)Give the count of ist column footer only
		WebElement coloumndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); // counting ist td link //
																								// only
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());

		// 4) click on each link in the column and check if the pages are opening
		for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(2000);
		}
			// open all the tabs
			Set<String> tabOpen = driver.getWindowHandles();
			Iterator<String> it=tabOpen.iterator();

			while(it.hasNext())
			{
				Thread.sleep(2000);
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
	}

	

	

}
