package screensForTestFifth;

import help.HelperMethods;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomerServicePage {
    WebDriver driver;
    //Objects
    public HelperMethods functions=new HelperMethods(driver);

    @FindBy(how = How.XPATH, using = "//p[@class='alert alert-success']")
    private WebElement verifyMessage;
    @FindBy(how = How.XPATH, using = "//i[@class='icon-chevron-left']")
    private WebElement homeButton;

    public CustomerServicePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public CustomerServicePage verifyMessageSent(){
        functions.waitExplicit(verifyMessage,driver);
        String value1=verifyMessage.getText();
        String value2="Your message has been successfully sent to our team.";
        Assert.assertEquals(value2,value1);
        return this;
    }
    public CustomerServicePage goToHomePage(){
        homeButton.click();
        return this;
    }




}
