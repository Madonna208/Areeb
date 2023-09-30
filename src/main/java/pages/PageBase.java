package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver driver;
    public PageBase(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    protected static void clickButton(WebElement element){
        element.click();
    }
    protected static void sendTextElement(WebElement element, String value){
        element.sendKeys(value);
    }
}