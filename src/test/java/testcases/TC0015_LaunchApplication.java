package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Brands;

public class TC0015_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new Brands(driver)
			.getScreenshot("TC0015_LaunchApplication");
		

		}
		
	}
