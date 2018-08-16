package screensForTestFifth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
    WebDriver driver;
    @FindBy(how = How.ID, using = "id_contact")
    private WebElement subjectHeading;
    @FindBy(how = How.ID, using = "email")
    private WebElement emailBox;
    @FindBy(how = How.ID, using = "id_order")
    private WebElement orderReference;
    @FindBy(how = How.ID, using = "message")
    private WebElement messageBox;
    @FindBy(how = How.ID, using = "submitMessage")
    private WebElement sendButton;


    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ContactUsPage fillSubjectHeading(String value) {
        Select dropdown = new Select(subjectHeading);
        dropdown.selectByValue(value);
        return this;
    }

    public ContactUsPage fillEmailBox(String email) {
        emailBox.sendKeys(email);
        return this;
    }

    public ContactUsPage fillOrderReference(String reference) {
        orderReference.sendKeys(reference);
        return this;
    }

    public ContactUsPage fillMessageBox(String message) {
        messageBox.sendKeys(message);
        return this;
    }

    public CustomerServicePage goToCustomerServicePage() {
        sendButton.click();
        return new CustomerServicePage(driver);
    }
}