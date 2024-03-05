package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class AddToCart extends ProjectSpecification {

    @FindBy(xpath = "//*[@id=\"gh-search-input\"]")
    WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"shop-header-77611364\"]/div/div[1]/header/div[2]/div/div[1]/div/form/button[2]/span/svg")
    WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"fulfillment-add-to-cart-button-6469883\"]/div/div/div[1]/button")
    WebElement addToCartButton;

    // Constructor Initialization
    public AddToCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to search for a product
    public AddToCart searchForProduct(String searchString) {
        sendKeys(searchBox, searchString);
        click(searchButton);
        return this;
    }

    // Method to add the first search result to the cart
    public AddToCart addToCart() {
        // Assuming the first search result is being added to the cart
        WebElement firstSearchResult = driver.findElement(By.xpath("//*[@id=\"shop-sponsored-listing-40432006\"]/div/div"));
        hoverOverElement(firstSearchResult);
        click(addToCartButton);
        return this;
    }

	private void hoverOverElement(WebElement firstSearchResult) {
		
		
	}

    
}