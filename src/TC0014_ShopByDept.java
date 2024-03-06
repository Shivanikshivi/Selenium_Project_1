package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.ShopByDeapartment;

public class TC0014_ShopByDept  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			
			new ShopByDeapartment(driver)
			.performShoppingWorkflow()
			.getScreenshot("TC0014_ShopByDept");
		

		}
		
	}
