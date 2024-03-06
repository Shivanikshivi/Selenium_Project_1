package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.CheckOutPage;

public class TC0016_CheckOut  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			
			new CheckOutPage(driver)
			.clickCheckout()
			
			.getScreenshot("TC0016_CheckOut");
		

		}
		
	}
