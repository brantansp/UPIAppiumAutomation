package pages;

import utils.Reporter;
import wrappers.AppiumWrappers;

public class UBIForgotPasswordPage extends AppiumWrappers {
	
	public UBIForgotPasswordPage VerifyPageHeadingById() throws InterruptedException
	{
		try {
			verifyTextByID(prop.getProperty("ForgotPassword.PageHeading.id"),"FORGOT PASSWORD");
			//if(prop.getProperty("ForgatPassword.PageHeading.id") == "FORGOT PASSWORD")
				Reporter.reportStep("Page Heading Verified", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Page Heading Verification Failed", "FAIL");
		}
		return new UBIForgotPasswordPage();
	}

	public UBIForgotPasswordPage EnterEmailByXpath(String txt) throws InterruptedException
	{
		try {
			enterTextByXpath(prop.getProperty("ForgotPassword.Email.Xpath"),txt);
			Reporter.reportStep("Email Address Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Email address entry Failed", "FAIL");
		}
		return new UBIForgotPasswordPage();
	}
	
	public UBILoginPage ClickBackbyID()
	{
		try {
			clickByID(prop.getProperty("ForgotPassword.Back.Id"));
			Reporter.reportStep("Back Button Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Back Button Click Failed", "FAIL");
		}
		return new UBILoginPage();
	}
	public UBIForgotPasswordPage2 ClickSubmitbyId() throws InterruptedException
	{
		try {
			clickByID(prop.getProperty("ForgotPassword.Submit.id"));
			Reporter.reportStep("Submit Buttom Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click Submit", "FAIL");
		}
		return new UBIForgotPasswordPage2();
	}
	
}
