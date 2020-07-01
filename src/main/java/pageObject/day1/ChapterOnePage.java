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
   public WebElement chapter1;

    //@FindBy(how = How.ID, using = "html5div")
    private WebElement textBox;

    @FindBy(how = How.XPATH, using = "//div[@class='mainbody']")
    private WebElement text;

    @FindBy(how = How.ID, using = "verifybutton")
    private WebElement verifybutton;

    @FindBy(how = How.CLASS_NAME, using = "mainheading")
    private WebElement mainheading;

    @FindBy(how = How.CSS, using = "[id='selecttype']")
    private WebElement selectTypeDD;

  public void clickChapterOne() {
       chapter1.click();
   }

    public void setTextBox(String textToSend) {
        textBox.clear();
        textBox.sendKeys(textToSend);
    }

    public String getTextOfTextBox() {
        return textBox.getText();
        }

    public void getTextOfWindowLink() {
        String textT= text.getText();
        System.out.println(text);
    }

    public void getAttributeOfVerifyButton() {
      String value = verifybutton.getAttribute("value");
    }

    public String printCssValueguide() {
        return "return null";
    }

    public void selectFromSelectTypeDD(String optionName) {
        selectByVisibleText(selectTypeDD, optionName);
    }



}
