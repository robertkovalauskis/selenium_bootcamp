package classTests.seleniumEstimationTask;

import baseWebTest.BaseWebTest;
import classTests.day2.AlertTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.seleniumEstimationTask.AppleMonitorPage;
import pageObject.seleniumEstimationTask.CheckoutPage;
import pageObject.seleniumEstimationTask.MonitosPage;
import pageObject.seleniumEstimationTask.YourStoreHomePage;

import java.awt.*;

public class YourStoreTest extends BaseWebTest {

    private WebDriverWait wait;
    final Logger LOGGER = LogManager.getLogger(AlertTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://tutorialsninja.com/demo/");
    }

    @Test
    public void testYourStore() {

        LOGGER.info("Star test");
        YourStoreHomePage yourStoreHomePage = new YourStoreHomePage(driver);
        yourStoreHomePage.clickOnComponentDropDown();
        yourStoreHomePage.clickOnMonitorButton();

        LOGGER.info("Transfer to Monitors Page");
        MonitosPage monitosPage = new MonitosPage(driver);
        monitosPage.selectAppleMonitor();

        LOGGER.info("Transfer to Apple Monitor Page");
        AppleMonitorPage appleMonitorPage = new AppleMonitorPage(driver);
        appleMonitorPage.selectOnRadioButton();
        appleMonitorPage.selectCheckbox3();
        appleMonitorPage.selectTextField();
        appleMonitorPage.selectDropDown();
        appleMonitorPage.selectTextarea();
        LOGGER.info("Uploading...");
        WebElement element = driver.findElement(By.id("input-option222"));
        String jse = "arguments[0].value='image.JPG'";
        ((JavascriptExecutor)driver).executeScript(jse, element);
        LOGGER.info("Managed to upload file");
        appleMonitorPage.dateM();
        appleMonitorPage.timeM();
        appleMonitorPage.dateAndTimeM();
        appleMonitorPage.setQuantityValue();
        appleMonitorPage.addToCartM();
        appleMonitorPage.clickOnCart();
        appleMonitorPage.clickOnCheckout();
//
        LOGGER.info("CHECKOUT");
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.selectGuestCheckout();
        checkoutPage.clickOnContinueButton();

        LOGGER.info("Billing details");
        checkoutPage.enterFirstName();
        checkoutPage.enterLastName();
        checkoutPage.enterEmail();
        checkoutPage.enterTelephone();
        checkoutPage.enterCompany();
        checkoutPage.enterAddress1();
        checkoutPage.enterCity();
        checkoutPage.enterPostCode();
        checkoutPage.selectCountry();
        checkoutPage.selectRegion();
        checkoutPage.clickOnContinueBtn2();

        LOGGER.info("Delivery Method");
        checkoutPage.addComments();
        checkoutPage.clickOnContinueBtn3();
        checkoutPage.markTermsCheckbox();
        checkoutPage.clickOnContinueBtn4();

        LOGGER.info("Confirm Order (Assertions start)");
        Assertions.assertEquals("Your order has been placed!", checkoutPage.getTextFromCartButton(),"Error" );
        Assertions.assertEquals("0 item(s) - $0.00", checkoutPage.verifyEmptyCart(),"Error" );

        //assert Products Name
       // Assertions.assertEquals("Apple Cinema 30\"", checkoutPage.productName.getText(), "Error");
        //assert Model
//        Assertions.assertEquals("Product 15", driver.findElement(By.xpath("//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tbody/tr/td[2]")).getText(), "Error");
//        //assert Quantity
//        Assertions.assertEquals("3", driver.findElement(By.xpath("//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tbody/tr/td[3]")).getText(), "Error");

        checkoutPage.clickOnContinueBtn4();

    }

}
