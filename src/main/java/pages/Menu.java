package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class Menu extends ProjectSpecification {

    @FindBy(xpath = "//*[@id=\"shop-header-77250711\"]/div/div[1]/header/div[3]/div/nav/button/svg")
    WebElement menuButton;

    // Constructor Initialization
    public Menu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to click on the menu button
    public Menu clickMenu() {
        click(menuButton);
        return this;
    }

    
}