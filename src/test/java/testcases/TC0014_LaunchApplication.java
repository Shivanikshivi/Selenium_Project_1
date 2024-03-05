package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.ShopByDeapartment;

public class TC0014_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new ShopByDeapartment(driver)
			.getScreenshot("TC0014_LaunchApplication");
		

		}
		
	}
