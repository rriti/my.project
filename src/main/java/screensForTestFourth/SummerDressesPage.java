package screensForTestFourth;

import help.HelperMethods;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class SummerDressesPage {
    WebDriver driver;

    //Objects
    public HelperMethods functions = new HelperMethods(driver);

    @FindBy(how = How.XPATH, using = "//ul[@class='product_list grid row']/li[1]/div")
    private WebElement hoverArea1;
    @FindBy(how = How.XPATH, using = "//ul[@class='product_list grid row']/li[1]/div/div[3]/div[2]/a[@class='add_to_compare']")
    private WebElement addToCompareButton1;
    @FindBy(how = How.XPATH, using = "//ul[@class='product_list grid row']/li[2]/div")
    private WebElement hoverArea2;
    @FindBy(how = How.XPATH, using = "//ul[@class='product_list grid row']/li[2]/div/div[3]/div[2]/a[@class='add_to_compare']")
    private WebElement addToCompareButton2;
    @FindBy(how = How.XPATH, using = "//div[@class='top-pagination-content clearfix']/form[@class='compare-form']/input[@value='1']")
    private WebElement compareBox;
    @FindBy(how = How.XPATH, using = "//div[@class='top-pagination-content clearfix']/form[@class='compare-form']/input[@value='2']")
    private WebElement compareBox2;
    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-default button button-medium bt_compare bt_compare']")
    private WebElement addToCompare;


    public SummerDressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SummerDressesPage goToCompare1() {
        functions.waitExplicit(hoverArea1, driver);
        functions.hoverWebElement(hoverArea1, driver);
        functions.waitExplicit(addToCompareButton1, driver);
        functions.hoverWebElement(addToCompareButton1, driver);
        addToCompareButton1.click();
        return this;
    }

    public SummerDressesPage verifyProductsToCompare1() {
        String value = compareBox.getAttribute("value");
        String value2 = "1";
        Assert.assertEquals(value2, value);
        return this;
    }

    public SummerDressesPage goToCompare2() {
        functions.waitExplicit(hoverArea2, driver);
        functions.hoverWebElement(hoverArea2, driver);
        functions.waitExplicit(addToCompareButton2, driver);
        addToCompareButton2.click();
        return this;
    }

    public SummerDressesPage verifyProductsToCompare2() {
        String value = compareBox2.getAttribute("value");
        String value2 = "2";
        Assert.assertEquals(value2, value);
        return this;
    }

    public ComparePage goToComparepage() {
        addToCompare.click();
        return new ComparePage(driver);
    }

}
