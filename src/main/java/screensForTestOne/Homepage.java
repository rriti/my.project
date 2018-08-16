package screensForTestOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    WebDriver driver1;

    @FindBy(how = How.XPATH, using = "//a[@title='Women']")
    private WebElement womenButton;

    public Homepage(WebDriver driver) {
        driver1 = driver;
        PageFactory.initElements(driver, this);
    }

    public TopsPage goToTopsPage() {
        womenButton.click();
        return new TopsPage(driver1);
    }

}


