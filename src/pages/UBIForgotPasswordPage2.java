package pages;

import utils.Reporter;
import wrappers.AppiumWrappers;

public class UBIForgotPasswordPage2 extends AppiumWrappers{

	public UBIForgotPasswordPage2 VerifyPageHeadingById() throws InterruptedException
	{
		try {
			verifyTextByID(prop.getProperty("ForgotPassword.PageHeading.id"),"FORGOT PASSWORD");
			//if(prop.getProperty("ForgotPassword.PageHeading.id") == "FORGOT PASSWORD")
				Reporter.reportStep("Page Heading Verified", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Page Heading Verification Failed", "FAIL");
		}
		return new UBIForgotPasswordPage2();
	}

public UBIForgotPasswordPage2 EnterOldPasswordbyID(String txt)
{
	try {
		enterTextByID(prop.getProperty("ForgotPassword2.OldPassword.Id"),txt);
		Reporter.reportStep("Old password entered", "PASS");
	} catch (Exception e) {
		Reporter.reportStep("Old password entry Failed", "FAIL");
	}
	return this;
}

public UBIForgotPasswordPage2 EnterNewPasswordbyID(String txt)
{
	try {
		enterTextByID(prop.getProperty("ForgotPassword2.NewPassword.Id"),txt);
		Reporter.reportStep("New password entered", "PASS");
	} catch (Exception e) {
		Reporter.reportStep("New password entry Failed", "FAIL");
	}
	return this;
}

public UBIForgotPasswordPage2 EnterConfirmPasswordbyID(String txt)
{
	try {
		enterTextByID(prop.getProperty("ForgotPassword2.ConfirmPassword.Id"),txt);
		Reporter.reportStep("Confirm password entered", "PASS");
	} catch (Exception e) {
		Reporter.reportStep("Confirm password entry Failed", "FAIL");
	}
	return this;
}
	
public UBIForgotPasswordPage2 ClickSubmitbyID()
{
	try {
		clickByID(prop.getProperty("ForgotPassword2.submit.Id"));
		Reporter.reportStep("Confirm password entered", "PASS");
	} catch (Exception e) {
		Reporter.reportStep("Confirm password entry Failed", "FAIL");
	}
	return this;
}	

public UBIForgotPasswordPage ClickBackbyID()
{
	try {
		clickByID(prop.getProperty("ForgotPassword2.Back.Id"));
		Reporter.reportStep("Back Button Clicked", "PASS");
	} catch (Exception e) {
		Reporter.reportStep("Back Button Click Failed", "FAIL");
	}
	return new UBIForgotPasswordPage();
}

}
