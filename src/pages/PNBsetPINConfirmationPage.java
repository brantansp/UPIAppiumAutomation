package pages;

import utils.Reporter;
import wrappers.GenericWrappers;

public class PNBsetPINConfirmationPage extends GenericWrappers{

	public PNBsetPINConfirmationPage enterOTP()
	{
		try {
			sleep(15000);
			Reporter.reportStep("OTP Entered Successfully", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("OTP Entry Filed", "FAIL");
		}
		return this;
	}
	
	public PNBsetPINConfirmationPage enterSetPIN(String newpin)
	{
		try {
			enterTextByID(prop.getProperty("SetPIN.NewPIN.ID"), newpin);
			Reporter.reportStep("New PIN Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Enter New PIN", "FAIL");
		}
		return this;
	}
	
	public PNBsetPINConfirmationPage enterSetPINConfirm(String confirmpin)
	{
		try {
			enterTextByID(prop.getProperty("SetPIN.NewPINConfirm.ID"), confirmpin);
			Reporter.reportStep("Confirm PIN Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Enter Confirm PIN", "FAIL");
		}
		return this;
	}
	
	public PNBsetPINConfirmationPage enterDebitcardnumber(String cardnumber)
	{
		try {
			enterTextByID(prop.getProperty("SetPIN.cardnumbers.ID"), cardnumber);
			Reporter.reportStep("Last 6 digit of CardNumber Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Enter CardNumber", "FAIL");
		}
		return this;
	}
	
	public PNBsetPINConfirmationPage enterexpirydate(String month,String year)
	{
		try {
			clickByXpath(prop.getProperty("SetPIN.expirymonth.Xpath"));
			enterTextByXpath(prop.getProperty("SetPIN.expirymonth.Xpath"), month);
			clickByXpath(prop.getProperty("SetPIN.expiryyear.Xpath"));
			enterTextByXpath(prop.getProperty("SetPIN.expiryyear.Xpath"), year);
			clickByXpath(prop.getProperty("SetPIN.OK.Xpath"));
			Reporter.reportStep("Card Expiry date entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Enter Expiry date", "FAIL");
		}
		return this;
	}
	
	public PNBsetPINConfirmationPage ClickSubmit()
	{
		try {
			clickByXpath(prop.getProperty("SetPIN.Submit.Xpath"));
			Reporter.reportStep("Submit Button Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to click Submit", "FAIL");
		}
		return this;
	}
	
	public PNBHomePage ClickAlertOkforSuccess()
	{
		try {
			clickByID(prop.getProperty("PaydetailsPage.alertOk.ID"));
			Reporter.reportStep("Alert Box Accepted", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Accept Alert", "FAIL");
		}
		return new PNBHomePage();
	}
	
	public PNBHomePage ClickAlertOkforFailure()
	{
		try {
			clickByID(prop.getProperty("PaydetailConfirmation.Alertok.ID"));
			Reporter.reportStep("Alert Box Accepted", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Accept Alert", "FAIL");
		}
		return new PNBHomePage();
	}
	public PNBsetPINConfirmationPage verifyalerttext(String text)
	{
		try {
			boolean val =verifyTextByID(prop.getProperty("SetPIN.alerttext.Id"),text);
			if (val == true)
			{
				Reporter.reportStep("Confirmation Text Successfull", "PASS");
			}
			else
			{Reporter.reportStep("Confirmation text not matched", "FAIL");}
			
		} catch (Exception e) {
			Reporter.reportStep("Confirmation text not matched", "FAIL");
		}
		return this;
	}
}
