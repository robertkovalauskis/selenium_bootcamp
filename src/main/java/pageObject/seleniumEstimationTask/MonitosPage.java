package pageObject.seleniumEstimationTask;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MonitosPage extends BaseFunc {
    public MonitosPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='content']/div[3]/div[1]/div/div[2]/div[1]/h4/a")
    public WebElement appleMonitor;

    public void selectAppleMonitor() {
        appleMonitor.click();
    }
}
