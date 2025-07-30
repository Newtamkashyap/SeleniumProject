package introduction_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// Active date selection 

//		System.setProperty("webdriver.firefox.driver", "C:/Users/newtam/Downloads/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.cssSelector(
				"button[class='react-calendar__tile react-calendar__tile--now react-calendar__tile--hasActive react-calendar__year-view__months__month']"))
				.click();
		driver.findElement(By.cssSelector("button[class*='react-calendar__tile react-calendar__tile--now react-calendar__tile--active']")).click();
	}

}
