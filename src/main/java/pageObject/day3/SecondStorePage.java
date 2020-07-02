package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SecondStorePage extends BaseFunc {
    public SecondStorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//img[@title='Faded Short Sleeve T-shirts']")
    private WebElement shirt;

    @FindBy(how = How.XPATH, using = "//img[@title='Blouse']")
    private WebElement blouse;


    public void clickOnShirt() {
        waitElementAppeared(shirt);
        shirt.click();
    }

    public void clickOnBlouse() {
        waitElementAppeared(blouse);
        blouse.click();
    }







}
