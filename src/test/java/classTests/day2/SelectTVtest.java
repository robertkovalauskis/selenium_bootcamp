package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.OneAtVpage;

public class SelectTVtest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("https://www.1a.lv/c/tv-audio-video-spelu-konsoles/televizori-un-piederumi/televizori/2wu");
    }

    @Test
    public void tvTest() {
        OneAtVpage oneApage = new OneAtVpage(driver);

        oneApage.printProductDetails(15);
    }








}
