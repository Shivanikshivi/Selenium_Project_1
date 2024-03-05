package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class ShopByDeapartment extends ProjectSpecification {

    @FindBy(xpath = "//*[@id=\"shop-header-92674015\"]/div/div[1]/header/div[3]/div/nav/button/svg")
    WebElement menuButton;

    @FindBy(xpath = "//*[@id=\"shop-header-92674015\"]/div/div[1]/header/div[3]/div/nav/div/div/ul/li[5]/button")
    WebElement appliancesLink;

    @FindBy(xpath = "//*[@id=\"shop-header-92674015\"]/div/div[1]/header/div[3]/div/nav/div/div/ul/li[2]/button")
    WebElement majorKitchenAppliancesLink;

    @FindBy(xpath = "//*[@id=\"shop-header-92674015\"]/div/div[1]/header/div[3]/div/nav/div/div/ul/li[3]/div/ul/li[2]/a")
    WebElement applianceSaleEventLink;

    

    // Constructor Initialization
    public ShopByDeapartment(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to perform the shopping 
    public ShopByDeapartment performShoppingWorkflow() {
        click(menuButton);
        click(appliancesLink);
        click(majorKitchenAppliancesLink);
        click(applianceSaleEventLink);
        
        return this;
    }

   
}