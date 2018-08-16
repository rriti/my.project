package screensForTestOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TopsPage {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//li/div[@class='subcategory-image']/a[@title='Tops']")
    private WebElement topsButton;


    public TopsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SubcategoryTopsPage goToSubcategoryTopsPage() {
        topsButton.click();
        return new SubcategoryTopsPage(driver);
    }

}
