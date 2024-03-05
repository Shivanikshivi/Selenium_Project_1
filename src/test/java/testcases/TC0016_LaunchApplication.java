package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.CheckOutPage;

public class TC0016_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new CheckOutPage(driver)
			.getScreenshot("TC0016_LaunchApplication");
		

		}
		
	}
