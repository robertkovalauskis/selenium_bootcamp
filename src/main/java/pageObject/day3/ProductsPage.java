package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductsPage extends BaseFunc {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//button[@class='exclusive']")
    private WebElement buttonAddToCart;

    @FindBy(how = How.XPATH, using = "//span[@title='Continue shopping']")
    private WebElement continueShoppingButton;

/////////////////
    @FindBy(how = How.XPATH, using = "//a[@title='Women']")
    private WebElement buttonWomen;
//////////////

    public void clickOnAddToCart() {
        waitElementAppeared(buttonAddToCart);
        buttonAddToCart.click();

        waitElementAppeared(continueShoppingButton);
        continueShoppingButton.click();

        buttonWomen.click();
    }






}
