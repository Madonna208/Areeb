package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.*;
import tests.TestBase;

import static org.testng.Assert.assertEquals;

public class CheckoutSteps extends TestBase {
    LoginPage loginPage;
    ShoppingPage shoppingPage;
    CheckOutPage checkOutPage;
    LogoutPage logoutPage;
    @Given("the user is on Saucedemo login page")
    public void the_user_is_on_saucedemo_login_page() {
        loginPage = new LoginPage(driver);
        shoppingPage = new ShoppingPage(driver);
        checkOutPage = new CheckOutPage(driver);
        logoutPage = new LogoutPage(driver);
    }
    @When("the user logs in with valid credentials {string}, {string}")
    public void the_user_logs_in_with_valid_credentials(String username, String password) {
       loginPage.UserLogin(username,password);
    }
    @And("adds items to the cart")
    public void adds_items_to_the_cart() {
        shoppingPage.AddToCart();
    }
    @And("checks out the order {string}, {string}, {string}")
    public void checks_out_the_order(String firstName, String lastName, String zip) {
        checkOutPage.ProcessToCheckOut();
        checkOutPage.FillYourInformation(firstName,lastName,zip);
        checkOutPage.confirmOrder();
        Assert.assertTrue(checkOutPage.successMessage.getText().contains("Thank you for your order!"));
    }
    @And("logs out of the application")
    public void logs_out_of_the_application() {
        logoutPage.logOut();
    }
    @Then("the user should be on the login page")
    public void the_user_should_be_on_the_login_page() {
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://www.saucedemo.com/";
        assertEquals(expectedURL, currentURL);
    }
}
