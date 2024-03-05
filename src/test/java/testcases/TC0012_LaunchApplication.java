package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.AddToCart;

public class TC0012_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new AddToCart(driver)
			.getScreenshot("TC0012_LaunchApplication");
		

		}
		
	}
