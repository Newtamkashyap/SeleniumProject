package Digiaccel;


import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndPurchaseTest {
    WebDriver driver;
    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;
    CheckOutPage checkoutPage;
    OverviewPage overviewPage;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testCompletePurchaseFlow() {
        loginPage.login("standard_user", "secret_sauce");

        productsPage = new ProductsPage(driver);
        productsPage.addTwoItemsToCart();
        productsPage.goToCart();

        cartPage = new CartPage(driver);
        cartPage.checkout();

        checkoutPage = new CheckOutPage(driver);
        checkoutPage.fillInformation("John", "Doe", "12345");
        checkoutPage.continueCheckout();

        overviewPage = new OverviewPage(driver);
        Assert.assertTrue(overviewPage.verifyItemsAndTotal());
        overviewPage.finishCheckout();

        Assert.assertTrue(overviewPage.getConfirmationMessage().contains("Thank you"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

