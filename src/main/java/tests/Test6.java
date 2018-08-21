package tests;

import help.BaseTest;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import screensForTestOne.Homepage;

public class Test6 extends BaseTest {
    @Test
    public void verifyTheBestsellersList(){
        Homepage homepage=new Homepage(driver);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,650)", "");
        homepage.goToBestSellers()
                .verifyBestSellers()
                .numberOfProducts();
    }
}
