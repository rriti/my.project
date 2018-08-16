package screensForTestOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Blouses {
    WebDriver driver;
    @FindBy(how = How.XPATH, using = "//div[@id='center_column']/ul/li/div/div[2]/h5/a")
    private WebElement blackBlouseButton;

    public Blouses(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BlackBlousePage goToBlackBlousePage() {
        blackBlouseButton.click();
        return new BlackBlousePage(driver);
    }
}
