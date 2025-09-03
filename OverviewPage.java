package Digiaccel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {
    WebDriver driver;

    By finishBtn = By.id("finish");
    By confirmationMessage = By.className("complete-header");

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyItemsAndTotal() {
        // You can enhance this with actual price checks if needed
        return driver.getCurrentUrl().contains("checkout-step-two");
    }

    public void finishCheckout() {
        driver.findElement(finishBtn).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }
}
