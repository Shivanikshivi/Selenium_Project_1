package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Menu;

public class TC0013_LaunchApplication  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			//SpiceJet Application launched 
			new Menu(driver)
			.getScreenshot("TC0013_LaunchApplication");
		

		}
		
	}
