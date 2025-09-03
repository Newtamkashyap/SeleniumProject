package Digiaccel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;

    By firstProductAdd = By.cssSelector(".inventory_item:nth-of-type(1) button");
    By secondProductAdd = By.cssSelector(".inventory_item:nth-of-type(2) button");
    By cartIcon = By.className("shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addTwoItemsToCart() {
        driver.findElement(firstProductAdd).click();
        driver.findElement(secondProductAdd).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}

