package classTests.day3;

import baseWebTest.BaseWebTest;
import model.Article;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.DelfiHomePage;
import pageObject.day3.ProductsPage;
import pageObject.day3.SecondStorePage;
import pageObject.day3.StoreHomePage;

public class StoreTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void testStorePage() {
        StoreHomePage webstoreHome = new StoreHomePage(driver);
        webstoreHome.clickOnButtonWomen();

        SecondStorePage secondPage = new SecondStorePage(driver);
        secondPage.clickOnShirt();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.clickOnAddToCart();

        webstoreHome.clickOnButtonWomen();
        secondPage.clickOnBlouse();
        productsPage.clickOnAddToCart();

        webstoreHome.clickOnCartButton();

        //SecondStorePage storeStore = webstoreHome.getProductsName();
       // SecondStorePage storeStore = webstoreHome.getProductsAttributes()
        //Assertions.assertEquals(secondPage.getTitle(), storeStore.getTitle(), "Products not the same");

    }


}
