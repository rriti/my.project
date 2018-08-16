package screensForTestTwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 {
    WebDriver driver;
    @FindBy(how= How.XPATH,using = "//a[@title='Log in to your customer account']")
    private WebElement signInButton;

    public HomePage2(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public SubmitAccountPage goToCreateAnAccount(){
        signInButton.click();
        return new SubmitAccountPage(driver);
    }

}

