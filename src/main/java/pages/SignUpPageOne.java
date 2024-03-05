package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;

public class SignUpPageOne extends ProjectSpecification {

    
    @FindBy(xpath = "//*[@id=\"fld-e\"]")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"fld-p1\"]")
    WebElement password;

    @FindBy(xpath = "/html/body/div[1]/div/section/main/div[2]/div/div/div[1]/div/div/div/div/div/form/div[3]/button")
    WebElement signUpButton;

    // Constructor Initialization
    public SignUpPageOne(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // Method to enter email
    public SignUpPageOne enterEmail(String emailAddress) {
        sendKeys(email, emailAddress);
        return this;
    }

    // Method to enter password
    public SignUpPageOne enterPassword(String pass) {
        sendKeys(password, pass);
        return this;
    }


    // Method to click on Sign Up button
    public SignUpPageOne clickSignUp() {
        click(signUpButton);
        return this;
    }

   
}