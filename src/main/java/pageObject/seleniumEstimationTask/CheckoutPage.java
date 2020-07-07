package pageObject.seleniumEstimationTask;

import core.BaseFunc;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutPage extends BaseFunc {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label")
    public WebElement guestCheckoutRadioButton;

    @FindBy(how = How.XPATH, using = "//*[@id='button-account']")
    public WebElement continueButton;

    // Personal Details
    @FindBy(how = How.XPATH, using = "//*[@id='input-payment-firstname']")
    public WebElement firstName;

    @FindBy(how = How.XPATH, using = "//*[@id='input-payment-lastname']")
    public WebElement lastName;

    @FindBy(how = How.XPATH, using = "//*[@id='input-payment-email']")
    public WebElement email;

    @FindBy(how = How.XPATH, using = "//*[@id='input-payment-telephone']")
    public WebElement telephone;

    // Your Address
    @FindBy(how = How.XPATH, using = "//*[@id='input-payment-company']")
    public WebElement company;

    @FindBy(how = How.XPATH, using = "//*[@id='input-payment-address-1']")
    public WebElement address1;

    @FindBy(how = How.XPATH, using = "//*[@id='input-payment-city']")
    public WebElement city;

    @FindBy(how = How.XPATH, using = "//*[@id='input-payment-postcode']")
    public WebElement postCode;

    @FindBy(how = How.XPATH, using = "//*[@id='input-payment-country']")
    public WebElement countryDD;

    @FindBy(how = How.XPATH, using = "//*[@id='input-payment-country']/option[126]")
    public WebElement dropDownCountryLatvia;

    @FindBy(how = How.XPATH, using = "//select[@id='input-payment-zone']//option[129]")
    private WebElement region;

    @FindBy(how = How.XPATH, using = "//*[@id='button-guest']")
    public WebElement continueBtn2;

    // Delivery Method
    @FindBy(how = How.XPATH, using = "//*[@id='collapse-shipping-method']/div/p[4]/textarea")
    public WebElement commentsAboutOrder;

    @FindBy(how = How.XPATH, using = "//*[@id='button-shipping-method']")
    public WebElement continueBtn3;

    // Payments Method (choosed by default)
    @FindBy(how = How.XPATH, using = "//*[@id='collapse-payment-method']/div/div[2]/div/input[1]")
    public WebElement checkboxTerms;

    @FindBy(how = How.XPATH, using = "//*[@id='button-payment-method']")
    public WebElement continueBtn4;

    // Confirm Order (Assertions)
    @FindBy(how = How.XPATH, using = "//*[@id='button-confirm']")
    public WebElement confirmBtn;
    //
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Your order has been placed!')]")
    private WebElement orderPlaced;

    @FindBy(how = How.XPATH, using = "//span[@id='cart-total']")
    private WebElement emptyCard;


    public void selectGuestCheckout() {
        waitElementAppeared(guestCheckoutRadioButton);
        guestCheckoutRadioButton.click();
    }

    public void clickOnContinueButton() {
        continueButton.click();
    }

    public void enterFirstName() {
        waitElementAppeared(firstName);
        firstName.sendKeys("Roberts");
    }

    public void enterLastName() {
        lastName.sendKeys("Kovalauskis");
    }

    public void enterEmail() {
        email.sendKeys("robert.kovalauskis@gmail.com");
    }

    public void enterTelephone() {
        telephone.sendKeys("222-333-444");
    }

    public void enterCompany() {
        company.sendKeys("Accenture");
    }

    public void enterAddress1() {
        address1.sendKeys("Asteru iela 9-13");
    }

    public void enterCity() {
        city.sendKeys("Jelgava");
    }

    public void enterPostCode() {
        postCode.sendKeys("LV-3001");
    }

    public void selectCountry() {
        countryDD.click();
        dropDownCountryLatvia.click();
    }

    public void selectRegion() {
        waitElementAppeared(region);
        region.click();
    }

    public void clickOnContinueBtn2() {
        continueBtn2.click();
    }

    // Delivery Method
    public void addComments() {
        waitElementAppeared(commentsAboutOrder);
        commentsAboutOrder.sendKeys("I'm your best fan");
    }

    public void clickOnContinueBtn3() {
        continueBtn3.click();
    }

    // Payments Method (choosed by default)
    public void markTermsCheckbox() {
        waitElementAppeared(checkboxTerms);
        checkboxTerms.click();
    }

    public void clickOnContinueBtn4() {
        waitElementAppeared(continueBtn4);
        continueBtn4.click();
    }

// Confirm Order (Assertions)

    public void clickOnConfirmBtn() {
        waitElementAppeared(confirmBtn);
        confirmBtn.click();
    }


    public String getTextFromCartButton() {
        waitElementAppeared(orderPlaced);
        return orderPlaced.getText();

    }

    public String verifyEmptyCart() {
        return emptyCard.getText();
    }

}
