package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Menu;

public class TC0013_Menu  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			
			new Menu(driver)
			.clickMenu()
			.getScreenshot("TC0013_Menu");
		

		}
		
	}
