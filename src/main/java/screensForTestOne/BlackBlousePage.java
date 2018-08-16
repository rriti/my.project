package screensForTestOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BlackBlousePage {
    WebDriver driver;
    @FindBy(how = How.ID, using = "quantity_wanted")
    private WebElement quantityBox;
    @FindBy(how = How.ID, using = "group_1")
    private WebElement sizeDropDown;
    @FindBy(how = How.ID, using = "color_11")
    private WebElement blackColorButton;
    @FindBy(how = How.XPATH, using = "//button[@class='exclusive']")
    private WebElement addToCartButton;


    public BlackBlousePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BlackBlousePage setQuantity(String quantity) {
        quantityBox.sendKeys(quantity);
        return this;
    }

    public BlackBlousePage setSize(String value) {
        Select dropdown = new Select(sizeDropDown);
        dropdown.selectByValue(value);
        return this;

    }

    public BlackBlousePage setBlackColor() {
        blackColorButton.click();
        return this;
    }

    public CartPage addToCart() {
        addToCartButton.click();
        return new CartPage(driver);
    }

}
