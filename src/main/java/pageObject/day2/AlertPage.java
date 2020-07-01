package pageObject.day2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlertPage extends BaseFunc {

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "[onclick='jsAlert()']")
    private WebElement simpleAlert;


    @FindBy(how = How.CSS, using = "[onclick='jsConfirm()']")
    private WebElement simpleAlert2;

    @FindBy(how = How.CSS, using = "[onclick='jsPromt()']")
    private WebElement simpleAlert3;

    public void clickSampleAlert() {
        simpleAlert.click();
    }

    public void clickSampleAlert2() {
        simpleAlert2.click();
    }
    public void clickSampleAlert3() {
        simpleAlert3.click();
    }

}
