package pageObject.day1;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChapterOnePage extends BaseFunc {

    public ChapterOnePage(WebDriver driver) {
        super(driver);
    }

   @FindBy(how = How.LINK_TEXT, using = "Chapter1")
   private WebElement chapter1;

    @FindBy(how = How.ID, using = "html5div")
    private WebElement textBox;

    @FindBy(how = How.XPATH, using = "//div[@class='mainbody']")
    private WebElement text;

    @FindBy(how = How.ID, using = "verifybutton")
    private WebElement verifybutton;

    @FindBy(how = How.CLASS_NAME, using = "mainheading")
    private WebElement mainheading;

//    public void clickChapterOne() {
//        chapter1.click();
//    }

    public void setTextBox(String textToSend) {
        //textBox.clear();
        //textBox.sendKeys(textToSend);
    }

    public void getTextOfWindowLink() {
        String textT= text.getText();
        System.out.println(text);
    }

    public void getAttributeOfVerifyButton() {
//        String value = verifybutton.getAttribute("value");
    }

    public void printCssValueguide() {

    }

}
