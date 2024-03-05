package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePageOne;

public class TC009_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new HomePageOne(driver)
			.getScreenshot("TC009_LaunchApplication");
		

		}
		
	}
