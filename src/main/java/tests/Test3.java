package tests;

import help.BaseTest;
import org.junit.Test;
import screensForTestTwo.HomePage2;

public class Test3 extends BaseTest {
    @Test
    public void sameEmailAddress(){
        HomePage2 homePage2 = new HomePage2(driver);
        homePage2.goToCreateAnAccount()
                .fillEmailAddressBox("myproject5@myproject5.com")
                .beforeVerifyEmailAddress()
                .verifyEmailAddress();

    }

}
