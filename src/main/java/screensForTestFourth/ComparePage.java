package screensForTestFourth;

import help.HelperMethods;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import screensForTestTwo.MyAccountPage;

public class ComparePage {
    WebDriver driver;

    //Objects
    public HelperMethods functions=new HelperMethods(driver);

    @FindBy(how = How.XPATH, using = "//div[@class='clearfix']/div[@class='button-container']/a[@data-id-product='6']")
    private WebElement addToCartOne;
    @FindBy(how = How.XPATH, using = "//div[@class='clearfix']/div[1]/h2")
    private WebElement productAddedInCart;

    public  ComparePage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public ComparePage produceAddedInCart(){
        addToCartOne.click();
        return this;
    }

    public ComparePage verifyProducAddedInCart() {
         functions.waitExplicit(productAddedInCart,driver);
         String value = productAddedInCart.getText();
         String value2 = "Product successfully added to your shopping ";
         Assert.assertEquals(value2, value);
         return this;
    }



}
