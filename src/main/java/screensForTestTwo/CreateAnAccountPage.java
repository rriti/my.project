package screensForTestTwo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccountPage {
    WebDriver driver;
    @FindBy(how = How.ID, using = "id_gender1")
    private WebElement genderBox;
    @FindBy(how = How.ID, using = "customer_firstname")
    private WebElement customerFirstNameBox;
    @FindBy(how = How.ID, using = "customer_lastname")
    private WebElement customerLastNameBox;
    @FindBy(how = How.ID, using = "passwd")
    private WebElement passBox;
    @FindBy(how = How.ID, using = "days")
    private WebElement dayFromDateOfBirthBox;
    @FindBy(how = How.ID, using = "months")
    private WebElement mothFromDateOfBirthBox;
    @FindBy(how = How.ID, using = "years")
    private WebElement yearFromDateOfBirthBox;
    @FindBy(how = How.ID, using = "newsletter")
    private WebElement newsletterButton;
    @FindBy(how = How.ID, using = "firstname")
    private WebElement firstNameBox;
    @FindBy(how = How.ID, using = "lastname")
    private WebElement lastNameBox;
    @FindBy(how = How.ID, using = "company")
    private WebElement companyBox;
    @FindBy(how = How.ID, using = "address1")
    private WebElement addressBox;
    @FindBy(how = How.ID, using = "address2")
    private WebElement addressLine2Box;
    @FindBy(how = How.ID, using = "city")
    private WebElement cityBox;
    @FindBy(how = How.ID, using = "id_state")
    private WebElement stateBox;
    @FindBy(how = How.ID, using = "postcode")
    private WebElement zipCodeBox;
    @FindBy(how = How.ID, using = "id_country")
    private WebElement countryBox;
    @FindBy(how = How.ID, using = "phone_mobile")
    private WebElement mobilePhoneBox;
    @FindBy(how = How.ID, using = "alias")
    private WebElement futureReferenceBox;
    @FindBy(how = How.ID, using = "submitAccount")
    private WebElement registerButton;

    public CreateAnAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CreateAnAccountPage checkGenderBox() {
        genderBox.click();
        return this;
    }

    public CreateAnAccountPage fillCustomerFirstNameBox(String firstNameOfCustomer) {
        customerFirstNameBox.sendKeys(firstNameOfCustomer);
        return this;
    }

    public CreateAnAccountPage fillCustomerLastNameBox(String lastNameOfCustomer) {
        customerLastNameBox.sendKeys(lastNameOfCustomer);
        return this;
    }

    public CreateAnAccountPage fillPassBox(String password) {
        passBox.sendKeys(password);
        return this;
    }

    public CreateAnAccountPage fillDayFromDateOfBirthBox(String value) {
        Select dropdown = new Select(dayFromDateOfBirthBox);
        dropdown.selectByValue(value);
        return this;
    }

    public CreateAnAccountPage fillMothFromDateOfBirthBox(String value) {
        Select dropdown = new Select(mothFromDateOfBirthBox);
        dropdown.selectByValue(value);
        return this;
    }

    public CreateAnAccountPage fillYearFromDateOfBirthBox(String value) {
        Select dropdown = new Select(yearFromDateOfBirthBox);
        dropdown.selectByValue(value);
        return this;
    }

    public CreateAnAccountPage checkNewsletterButton() {
        newsletterButton.click();
        return this;
    }

    public CreateAnAccountPage fillFirstNameBox(String firstName) {
        firstNameBox.sendKeys(firstName);
        return this;
    }

    public CreateAnAccountPage fillLastNameBox(String lastName) {
        lastNameBox.sendKeys(lastName);
        return this;
    }

    public CreateAnAccountPage fillCompanyBox(String company) {
        companyBox.sendKeys(company);
        return this;
    }

    public CreateAnAccountPage fillAddressBox(String addressLineOne) {
        addressBox.sendKeys(addressLineOne);
        return this;
    }

    public CreateAnAccountPage fillAddressBoxLineTwo(String addressLineTwo) {
        addressLine2Box.sendKeys(addressLineTwo);
        return this;
    }

    public CreateAnAccountPage fillCityBox(String city) {
        cityBox.sendKeys(city);
        return this;
    }

    public CreateAnAccountPage fillStateBox(String value) {
        Select dropdown = new Select(stateBox);
        dropdown.selectByValue(value);
        return this;
    }

    public CreateAnAccountPage fillZipCodeBox(String zipCode) {
        zipCodeBox.sendKeys(zipCode);
        return this;
    }

    public CreateAnAccountPage fillCountryBox(String value) {
        Select dropdown = new Select(countryBox);
        dropdown.selectByValue(value);
        return this;
    }

    public CreateAnAccountPage fillMobilePhoneBox(String mobilePhone) {
        mobilePhoneBox.sendKeys(mobilePhone);
        return this;
    }

    public CreateAnAccountPage fillFutureReferenceBox(String futureReference) {
        futureReferenceBox.sendKeys(futureReference);
        return this;
    }

    public MyAccountPage goToAccountPage() {
        registerButton.click();
        return new MyAccountPage(driver);
    }
}
