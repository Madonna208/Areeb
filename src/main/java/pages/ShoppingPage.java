package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingPage extends PageBase
{
    public ShoppingPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement backpackAddToCartBtn;
    @FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
    WebElement jacketAddToCartBtn;
    public void AddToCart(){
        clickButton(backpackAddToCartBtn);
        clickButton(jacketAddToCartBtn);
    }
}
