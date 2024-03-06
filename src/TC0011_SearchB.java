package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SearchButton;

public class TC0011_SearchB  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			
			new SearchButton(driver)
			.performSearch("search")
			.getScreenshot("TC0011_SearchB");
		

		}
		
	}
