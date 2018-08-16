package screensForTestFourth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DressesPage {
    WebDriver driver;
    @FindBy(how = How.XPATH, using = "//ul[@class='clearfix']/li/div[@class='subcategory-image']/a[@title='Summer Dresses']")
    private WebElement summerDressesButton;

    public DressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SummerDressesPage goToSummerDressesPage() {
        summerDressesButton.click();
        return new SummerDressesPage(driver);
    }
}
