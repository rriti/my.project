package tests;

import help.BaseTest;
import org.junit.Test;
import screensForTestTwo.HomePage2;

public class Test2 extends BaseTest {
    @Test
    public void createNewAccount() {
        HomePage2 homePage2 = new HomePage2(driver);
        homePage2.goToCreateAnAccount()
                .fillEmailAddressBox("myproject366@myproject366.com")
                .goToCreateAnAccountPage()
                .checkGenderBox()
                .fillCustomerFirstNameBox("Raul")
                .fillCustomerLastNameBox("Riti")
                .fillPassBox("nNGQr8N'uBa<<-Ds")
                .fillDayFromDateOfBirthBox("14")
                .fillMothFromDateOfBirthBox("1")
                .fillYearFromDateOfBirthBox("1991")
                .checkNewsletterButton()
                .fillFirstNameBox("Raul")
                .fillLastNameBox("Riti")
                .fillCompanyBox("Endava")
                .fillAddressBox("Str. Mihaita Batausu")
                .fillAddressBoxLineTwo("first street")
                .fillCityBox("Bandar Seri Begawan")
                .fillStateBox("43")
                .fillZipCodeBox("12345")
                .fillCountryBox("21")
                .fillMobilePhoneBox("9876543210")
                .fillFutureReferenceBox("magic@magic.com")
                .goToAccountPage()
                .verifyAccountPage();
    }
}
