package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class CheckOutPage extends ProjectSpecification {

    @FindBy(xpath = "//*[@id=\"cartApp\"]/div[2]/div/div[1]/div/div[1]/div[1]/section[2]/div/div/div[4]/div/div[1]/button")
    WebElement checkoutButton;

    @FindBy(xpath = "//*[@id=\"fld-e\"]")
    WebElement userEmail;

    @FindBy(xpath = "//*[@id=\"fld-p1\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"checkoutApp\"]/div[2]/div[1]/div[1]/main/div[3]/div[1]/section/div[2]/section/div/div/button")
    WebElement paymentInformationButton;
    
    @FindBy(xpath = "//*[@id=\"number\"]")
    WebElement cardNumber;
    
    @FindBy(xpath = "//*[@id=\"expMonth\"]")
    WebElement ExpirationMonth;
    
    @FindBy(xpath = "//*[@id=\"expYear\"]")
    WebElement expirationYear;
    
    @FindBy(xpath = "//*[@id=\"cvv\"]")
    WebElement securityCode;

    @FindBy(xpath = "//*[@id=\"first-name\"]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"last-name\"]")
    WebElement lastName;
    

    @FindBy(xpath = "//*[@id=\"address-input\"]")
    WebElement Address;

    @FindBy(xpath = "//*[@id=\"city\"]")
    WebElement city;

    @FindBy(xpath = "//*[@id=\"checkoutApp\"]/div[2]/div[1]/div[1]/main/div[3]/div[2]/div/section/div[3]/div/div[2]/button/span")
    WebElement placeOrderButton;

    // Constructor Initialization
    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to click Checkout
    public CheckOutPage clickCheckout() {
        click(checkoutButton);
        return this;
    }

    // Method to fill out dummy form with dummy payment information
    public CheckOutPage fillOutFormAndPlaceOrder(String checkoutbutton, String email, String Password, String cardNum, String expiryMonth, String expyear, String code, String firstname, String lastname, String addr, String City ) {
        sendKeys(userEmail, email);
        sendKeys(password, Password);
        sendKeys(cardNumber, cardNum);
        sendKeys(ExpirationMonth, expiryMonth);
        sendKeys(expirationYear, expyear);
        sendKeys(securityCode, code);
        sendKeys(firstName, firstname);
        sendKeys(lastName, lastname);
        sendKeys(Address, addr);
        sendKeys(city, City);
        click(placeOrderButton);
        return this;
    }
}