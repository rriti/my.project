package tests;

import help.BaseTest;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import screensForTestFourth.DressesPage;
import screensForTestFourth.Homepage3;
import screensForTestFourth.SummerDressesPage;

public class Test4 extends BaseTest {
    @Test
    public void compareProducts() {
        Homepage3 homepage3 = new Homepage3(driver);
        DressesPage dressesPage = new DressesPage(driver);
        SummerDressesPage summerDressesPage = new SummerDressesPage(driver);


        homepage3.goDressesPage();
        dressesPage.goToSummerDressesPage();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,650)", "");
        summerDressesPage.goToCompare1()
                .verifyProductsToCompare1()
                .goToCompare2()
                .verifyProductsToCompare2()
                .goToComparepage()
                .produceAddedInCart()
                .verifyProducAddedInCart();
    }
}