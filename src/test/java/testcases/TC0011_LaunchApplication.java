package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SearchButton;

public class TC0011_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new SearchButton(driver)
			.getScreenshot("TC0011_LaunchApplication");
		

		}
		
	}
