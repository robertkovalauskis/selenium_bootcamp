package pageObject.seleniumEstimationTask;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YourStoreHomePage extends BaseFunc {

    public YourStoreHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='menu']/div[2]/ul/li[3]/a")
    public WebElement componentDropDown;

    @FindBy(how = How.XPATH, using = "//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[2]/a")
    public WebElement monitorButton;



    public void clickOnComponentDropDown() {
        componentDropDown.click();
    }

    public void clickOnMonitorButton() {
        monitorButton.click();
    }



}
