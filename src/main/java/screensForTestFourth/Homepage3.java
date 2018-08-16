package screensForTestFourth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Homepage3 {
    WebDriver driver;
    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[2]/a")
    private WebElement dressesButton;

    public Homepage3(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public DressesPage goDressesPage() {
        dressesButton.click();
        return new DressesPage(driver);
    }


}
