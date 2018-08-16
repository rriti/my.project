package screensForTestOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SubcategoryTopsPage {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//li/div[@class='subcategory-image']/a[@title='Blouses']")
    private WebElement blousesButton;

    public SubcategoryTopsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Blouses goToBlosesPage() {
        blousesButton.click();
        return new Blouses(driver);
    }
}
