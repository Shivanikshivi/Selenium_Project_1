package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SearchButton extends ProjectSpecification {

    @FindBy(xpath = "//*[@id=\"gh-search-input\"]")
    WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"shop-header-77611364\"]/div/div[1]/header/div[2]/div/div[1]/div/form/button[2]/span/svg")
    WebElement searchButton;

    // Constructor Initialization
    public SearchButton(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to perform a search
    public SearchButton performSearch(String searchString) {
        sendKeys(searchBox, searchString);
        click(searchButton);
        
        return this;
    }

    
}