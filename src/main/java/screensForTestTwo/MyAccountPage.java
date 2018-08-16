package screensForTestTwo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    WebDriver driver;
    @FindBy(how = How.XPATH, using = "//a[@title='Information']")
    private  WebElement validateMyAccountPage;

    public MyAccountPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public MyAccountPage verifyAccountPage(){
        Assert.assertEquals("MY PERSONAL INFORMATION", validateMyAccountPage.getText());
        return this;
    }


}
