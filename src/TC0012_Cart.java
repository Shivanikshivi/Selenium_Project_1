package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.AddToCart;

public class TC0012_Cart  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			
			new AddToCart(driver)
			.searchForProduct("search")
			.addToCart()
			.getScreenshot("TC0012_cart");
		

		}
		
	}
