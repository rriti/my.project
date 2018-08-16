package screensForTestOne;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    WebDriver driver;
    @FindBy(how = How.XPATH, using = "//i[@class='icon-chevron-left left']")
    private WebElement continueShoppingButton;
    @FindBy(how = How.XPATH,using = "//a[@title='Proceed to checkout']")
    private WebElement proceedToCheckoutButton;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitForContinueShoppingButton(WebDriver driver) {
        new WebDriverWait(driver, 250).until(ExpectedConditions.visibilityOf(continueShoppingButton));
    }


    public CartPage continueShopping() {
        continueShoppingButton.click();
        return this;
    }

}


