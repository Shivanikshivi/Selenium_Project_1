package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.SignUpPage;

public class TC0010_SignUp  extends ProjectSpecification{
	
	@Test
	
	public void launchApp() throws IOException {
		
				
			
			new SignUpPage(driver)
			.enterFirstName("K")
			.enterLastName("Shivani")
			.enterEmail("shivanikshivi")
			.enterPassword("S@12345678")
			.confirmEnteredPassword("S@12345678")
			.enterMobileNumber("1234567890")
			.agreeToTermsAndConditions()
			.clickSignUp()
			
		
			
			.getScreenshot("TC0010_SignUp");
		

		}
		
	}
