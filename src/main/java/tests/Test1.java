package tests;

import help.BaseTest;
import org.junit.Test;
import screensForTestOne.CartPage;
import screensForTestOne.Homepage;

public class Test1 extends BaseTest {
    @Test
    public void addBlackBlouseInCart() {
        Homepage homepage = new Homepage(driver);
        homepage.goToTopsPage()
                .goToSubcategoryTopsPage()
                .goToBlosesPage()
                .goToBlackBlousePage()
                .setQuantity("2")
                .setSize("2")
                .setBlackColor()
                .addToCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.waitForContinueShoppingButton(driver);
        cartPage.continueShopping();
    }
}
