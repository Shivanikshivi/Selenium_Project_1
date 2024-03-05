package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class Brands extends ProjectSpecification {
	
	@FindBy(xpath = "//*[@id=\"shop-header-92674015\"]/div/div[1]/header/div[3]/div/nav/button/svg")
    WebElement menuButton;

    @FindBy(xpath = "//*[@id=\"shop-header-60889658\"]/div/div[1]/header/div[2]/div/nav/div/div/ul/li[3]/button")
    WebElement brandsLink;

    @FindBy(xpath = "//*[@id=\"shop-header-60889658\"]/div/div[1]/header/div[2]/div/nav/div/div/ul/li[4]/div/ul/li[2]/a")
    WebElement appleBrandLink;

 // Constructor Initialization
    public Brands(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to perform the shopping 
    public Brands performShoppingWorkflow() {
        click(menuButton);
        click(brandsLink);
        click(appleBrandLink);
        
        
        return this;
    }
}