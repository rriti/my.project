package screensForTestOne;

import help.HelperMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Homepage {
    WebDriver driver1;
    //Objects
    public HelperMethods functions = new HelperMethods(driver1);

    @FindBy(how = How.XPATH, using = "//a[@title='Women']")
    private WebElement womenButton;
    @FindBy(how = How.XPATH, using = "//a[@class='blockbestsellers']")
    private WebElement bestSellersButton;
    List<WebElement> products;
    private int productsCount;

    public Homepage(WebDriver driver) {
        driver1 = driver;
        PageFactory.initElements(driver, this);
        products = driver1.findElements(By.xpath(".//*[@id='blockbestsellers']/li[contains(@class, 'ajax_block_product')]"));
        productsCount = products.size();
    }


    public TopsPage goToTopsPage() {
        womenButton.click();
        return new TopsPage(driver1);
    }

    public Homepage goToBestSellers() {
        bestSellersButton.click();
        return this;
    }

    public Homepage verifyBestSellers() {
        String value1 = bestSellersButton.getText();
        String value2 = "BEST SELLERS";
        Assert.assertEquals(value2, value1);
        return this;
    }

    public Homepage numberOfProducts(){
        Assert.assertTrue(productsCount>=7);
        return this;
    }
}


