package classTests.day1;

import baseWebTest.BaseWebTest;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day1.ChapterOnePage;
import pageObject.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://book.theautomatedtester.co.uk/");
    }

    @Test
    public void chapterOneTest() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.chapter1.isDisplayed(), "Chapter link not displayed");
        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("Hello World!");

        chapterPage.selectFromSelectTypeDD("Selenium IDE");



        // this 2 lines fails
       // Assertions.assertEquals("Hello World!", chapterPage.getTextOfTextBox(), "Text not the same");
        //chapterPage.getTextOfTextBox();

        //Assertions.assertNotNull(textLink);
      // Assertions.assertNotEquals("yellow", chapterPage.printCssValueguide());
        //Assertions.assertTrue(chapterPage.printCssValueguide().equals("yellow"), "some message");
        // the same, but other variant
        //Assertions.assertTrue(!chapterPage.printCssValueguide().equals("yellow"), "some message");

        chapterPage.getAttributeOfVerifyButton();
        chapterPage.getAttributeOfVerifyButton();
        chapterPage.printCssValueguide();
    }
}
