package tests;

import help.BaseTest;
import org.junit.Test;
import screensForTestFifth.HomePage5;


public class Test5 extends BaseTest {
    @Test
    public void searchForProductsAndContactMessage(){
        HomePage5 homePage5=new HomePage5(driver);
        homePage5.clickToSearchBox()
                .fillSearchBox("jeans")
                .goToSearchResultsPage()
                .verifySearchResultBox()
                .goToContactUsPage()
                .fillSubjectHeading("2")
                .fillEmailBox("test@test.com")
                .fillOrderReference("Order ID: jeans?")
                .fillMessageBox("Please add my pink jeans!!!")
                .goToCustomerServicePage()
                .verifyMessageSent()
                .goToHomePage();
    }
}
