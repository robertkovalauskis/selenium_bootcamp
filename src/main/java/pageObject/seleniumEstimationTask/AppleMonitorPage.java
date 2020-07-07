package pageObject.seleniumEstimationTask;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URISyntaxException;

public class AppleMonitorPage extends BaseFunc {
    public AppleMonitorPage(WebDriver driver) {
        super(driver);
    }

    private WebDriverWait wait;

    String path = System.getProperty("user.dir") + "\\src\\resources\\image.jpg";
    //String path = "C:\\Users\\rober\\IdeaProjects\\selenium_bootcamp\\src\\resources\\image.jpg";

    @FindBy(how = How.XPATH, using = "//*[@id='input-option218']/div[2]/label/input")
    public WebElement radioButtonMedium;

    @FindBy(how = How.XPATH, using = "//*[@id='input-option223']/div[3]/label/input")
    public WebElement checkbox3;

    @FindBy(how = How.XPATH, using = "//input[@name='option[208]']")
    public WebElement textField;

    @FindBy(how = How.XPATH, using = "//*[@id='input-option217']")
    public WebElement dropdown;

    @FindBy(how = How.XPATH, using = "//*[@id='input-option217']/option[3]")
    public WebElement dropDownParameterBlue;

    @FindBy(how = How.XPATH, using = "//*[@id='input-option209']")
    public WebElement textarea;

    @FindBy(how = How.ID, using = "button-upload222")
    public WebElement fileInputApplePage;

    @FindBy(how = How.XPATH, using = "//*[@id='input-option219']")
    public WebElement dateField;

    @FindBy(how = How.XPATH, using = "//*[@id='input-option221']")
    public WebElement timeField;

    @FindBy(how = How.XPATH, using = "//*[@id='input-option220']")
    public WebElement dateAndTimeField;

    @FindBy(how = How.XPATH, using = "//*[@id='input-quantity']")
    public WebElement quantityField;

    @FindBy(how = How.XPATH, using = "//*[@id='button-cart']")
    public WebElement addToCartButton;

    @FindBy(how = How.XPATH, using = "//*[@id='cart']/button")
    public WebElement cartOnTheTop;

    @FindBy(how = How.XPATH, using = "//*[@id='cart']/ul/li[2]/div/p/a[2]/strong")
    public WebElement checkoutButton;


    public void selectOnRadioButton() {
        radioButtonMedium.click();
    }

    public void selectCheckbox3() {
        checkbox3.click();
    }

    public void selectTextField() {
        textField.sendKeys("I would like to have Apple monitor");
    }

    public void selectDropDown() {
        dropdown.click();
        dropDownParameterBlue.click();
    }

    public void selectTextarea() {
        textarea.sendKeys("Apple production is the best");
    }

   // public void uploadFileOnApplePage() {

    //}

//    public void uploadFileOnApplePage() {
//        fileInputApplePage.click();
//
//        StringSelection ss = new StringSelection(path);
//
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//        Robot robot = null;
//        try {
//            robot = new Robot();
//        } catch (AWTException e) {
//            e.printStackTrace();
//        }
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//    }

//    public void uploadFileOnApplePage(WebDriver driver) {
////        JavascriptExecutor executor = (JavascriptExecutor)driver;
////        executor.executeScript("document.getElementById('input-option222').setAttribute('type', 'file')");
////
////       // WebElement input = driver.findElement(By.id("input-option222"));
////
////        fileInputApplePage.sendKeys(path);
////              //fileInputApplePage.sendKeys(path);
////    }

//    public void uploadFileOnApplePage() throws AWTException {
//        File file = null;
//
//        try {
//            file = new File(AppleMonitorPage.class.getClassLoader().getResource("image.jpg").toURI());
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }
//
//        fileInputApplePage.click();
//
//        StringSelection ss = new StringSelection(file.getAbsolutePath());
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//        //imitate mouse events like ENTER, CTRL+C, CTRL+V
//        Robot robot = new Robot();
//
//       // Robot robot = new Robot();
//
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.delay(250);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        robot.delay(250);
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.delay(250);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.delay(250);
//        robot.keyRelease(KeyEvent.VK_V);
//        robot.delay(250);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.delay(250);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.delay(250);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        robot.delay(2000);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.delay(250);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        robot.delay(2000);
//    }


    public void dateM() {
        dateField.clear();
        dateField.sendKeys("2020-07-04");
    }

    public void timeM() {
        timeField.clear();
        timeField.sendKeys("16:53");
    }

    public void dateAndTimeM() {
        dateAndTimeField.clear();
        dateAndTimeField.sendKeys("2020-07-04 16:53");
    }

    public void setQuantityValue() {
        quantityField.clear();
        quantityField.sendKeys("3");
    }

    public void addToCartM() {
        addToCartButton.click();
    }

    public void clickOnCart() {
        cartOnTheTop.click();
    }

    public void clickOnCheckout() {
        waitElementAppeared(checkoutButton);
        checkoutButton.click();
    }

}
