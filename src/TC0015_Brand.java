package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Brands;

public class TC0015_Brand  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
						new Brands(driver)
						.performShoppingWorkflow()
			.getScreenshot("TC0015_Brand");
		

		}
		
	}
