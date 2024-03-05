package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePageOne extends ProjectSpecification {
	
	//@find by annotation used to locate web elements 
	
	@FindBy(xpath="//*[@id=\"shop-account-menu-71746153\"]/div/div/div[1]/div/div/div/div/a[1]")
	WebElement signup_button;
	
	@FindBy(xpath="//*[@id=\"gh-search-input\"]")
	WebElement search_button;
	
	@FindBy(xpath="//*[@id=\"fulfillment-add-to-cart-button-23540289\"]/div/div/div[1]/button")
	WebElement add_to_cart;
	
	@FindBy(xpath="//*[@id=\"shop-header-86599899\"]/div/div[1]/header/div[2]/div/nav/button/svg")
	WebElement menu;
	
	@FindBy(xpath="//*[@id=\"shop-header-86599899\"]/div/div[1]/header/div[2]/div/nav/div/div/ul/li[5]/button")
	WebElement shop_by_department;
	
	@FindBy(xpath="//*[@id=\"shop-header-86599899\"]/div/div[1]/header/div[2]/div/nav/div/div/ul/li[3]/button")
	WebElement brands;

	@FindBy(xpath="//*[@id=\"cartApp\"]/div[2]/div/div[1]/div/div[1]/div[1]/section[2]/div/div/div[4]/div/div[1]/button")
	WebElement check_out_page;
	
	
	
	
	//constructor initialization
			public HomePageOne(WebDriver driver) {
				
				this.driver = driver; 
				PageFactory.initElements(driver, this);
				
			}

				
			//Method to click sign up button and constructor chaining done to return to sign up page 
			public SignUpPageOne clickSignupone() throws InterruptedException {
				
				click(signup_button);
				sleep();
				
				return new SignUpPageOne(driver);
				
			}
			//Method to click search button 
			public SearchButton clicksearchbutton()  {
						
				click(search_button);
			
				return new SearchButton(driver);
				
			}
			
			//Method to click add to cart  button  
			public AddToCart clickAddToCart() {
				
				click(add_to_cart);
				
				return new AddToCart(driver);
			}
			
			//Method to click menu button 
			public Menu clickMenu() {
				
				click(menu);
				return new Menu(driver);
				
			}
			//Method to click shop by department
			public ShopByDeapartment clickShopByDepartment() throws InterruptedException {
				
				click(shop_by_department);
				sleep();
				return new ShopByDeapartment(driver);
				
			}
			
			//Method to click brands
			
            public Brands clickbrands() throws InterruptedException {
				
				click(brands);
				sleep();
				return new Brands(driver);
				
			}
            
//Method to click check out
			
            public CheckOutPage clickcheckoutpage() throws InterruptedException {
				
				click(check_out_page);
				sleep();
				return new CheckOutPage(driver);
				
			}
            
			
}
