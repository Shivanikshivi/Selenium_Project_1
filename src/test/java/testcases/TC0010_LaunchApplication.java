package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SignUpPage;

public class TC0010_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new SignUpPage(driver)
			.getScreenshot("TC0010_LaunchApplication");
		

		}
		
	}
