package classTests.day2;

import baseWebTest.BaseWebTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.AlertPage;


public class AlertTest extends BaseWebTest {

    final Logger LOGGER = LogManager.getLogger(AlertTest.class);

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void alertTesting() {

        LOGGER.info("Initializing Alert Page");
        AlertPage alertPage = new AlertPage(driver);

        LOGGER.info("Clicking simple Alert");
        alertPage.clickSampleAlert();

        LOGGER.info("Asserting simple Alert");
        alertPage.acceptAlert();
    }





}
