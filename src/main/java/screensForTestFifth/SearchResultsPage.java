package screensForTestFifth;

import help.HelperMethods;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    WebDriver driver;
    //Objects
    public HelperMethods functions=new HelperMethods(driver);

    @FindBy(how = How.XPATH, using = "//p[@class='alert alert-warning']")
    private WebElement verifySearchResult;
    @FindBy(how = How.XPATH, using = "//a[@title='Contact Us']")
    private WebElement contactUsButton;


    public SearchResultsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public SearchResultsPage verifySearchResultBox(){
        functions.waitExplicit(verifySearchResult,driver);
        String value1=verifySearchResult.getText();
        String value2="No results were found for your search \"jeans\"";
        Assert.assertEquals(value2,value1);
        return this;
    }

    public ContactUsPage goToContactUsPage(){
        contactUsButton.click();
        return new ContactUsPage(driver);
    }

}
