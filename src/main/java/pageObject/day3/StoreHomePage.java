package pageObject.day3;

import core.BaseFunc;
import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class StoreHomePage extends BaseFunc {


    public StoreHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@title='Women']")
    private WebElement buttonWomen;

    @FindBy(how = How.XPATH, using = "//div[@class='shopping_cart']")
    private WebElement cartButton;


    public void clickOnButtonWomen() {
        buttonWomen.click();
    }

    public void clickOnCartButton() {
        cartButton.click();
    }

    //after public we specified that we want to return our Object model (in this case Article.java)
    //public SecondStorePage getProductsName(Integer i) {

        // SecondStorePage productName = new SecondStorePage();
        //String title = productName.findElement(By.tagName("h1")).getText();
        // productName.setTitle(title);
    //}

}
