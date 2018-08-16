package screensForTestTwo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SubmitAccountPage {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@id='email_create']")
    private WebElement emailAddressBox;
    @FindBy(how = How.XPATH, using = "//*[@id='SubmitCreate']")
    private WebElement createAnAccountButton;

    public SubmitAccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public SubmitAccountPage fillEmailAddressBox(String email){
        emailAddressBox.sendKeys(email);
        return this;
    }

    public SubmitAccountPage beforeVerifyEmailAddress(){
        createAnAccountButton.click();
        return new  SubmitAccountPage (driver);
    }
    public SubmitAccountPage verifyEmailAddress(){
        String expectedMessage = "An account using this email address has already been . Please enter a valid password or request a new one";
        String message = driver.findElement(By.xpath("//*[@id='create_account_error']/ol/li")).getText();
        Assert.assertTrue("Error", message.contains(expectedMessage));
        return this;
        }
    public CreateAnAccountPage goToCreateAnAccountPage(){
        createAnAccountButton.click();
        return new CreateAnAccountPage(driver);
    }

    }

