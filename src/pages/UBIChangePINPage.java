package pages;

import utils.Reporter;
import wrappers.GenericWrappers;

public class UBIChangePINPage extends GenericWrappers{
	
	public PNBPayNPCIPage SelectAccountByXpath(String txt)
	{
		try {
			System.out.println(prop.getProperty("ViewBalance.AccountList.Xpath")+txt+"']");
			clickByXpath(prop.getProperty("ViewBalance.AccountList.Xpath")+txt+"']");
			Reporter.reportStep("Account Selected", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Select Account", "FAIL");
		}
		return new PNBPayNPCIPage();
	}
	
	public PNBLoginPage VerifyAlertText(String string)
	{
		try {
			boolean val = verifyTextByID(prop.getProperty("HomePage.WrongpasswordAlert.Id"), string);
			if (val == true)
			{
			Reporter.reportStep("Alert Text verified Successfully", "PASS");
			}
			else
			{Reporter.reportStep("Alert Text Not verified", "FAIL");}
		} catch (Exception e) {
			Reporter.reportStep("Alert Text Not verified", "FAIL");
		}
		
		return new PNBLoginPage();
	}

	public PNBHomePage ClickAlertOkforSuccess()
	{
		try {
			clickByXpath(prop.getProperty("ClickAlert.OK.Xpath"));
			//clickByID(prop.getProperty("PaydetailsPage.alertOk.ID"));
			Reporter.reportStep("Alert Box Accepted", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Accept Alert", "FAIL");
		}
		return new PNBHomePage();
	}
	
	public UBIChangePINPage ClickAlertOkforFailure()
	{
		try {
			clickByID(prop.getProperty("PaydetailConfirmation.Alertok.ID"));
			Reporter.reportStep("Alert Box Accepted", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Accept Alert", "FAIL");
		}
		return this;
	}
	
	public UBIChangePINPage Enteroldpin(String oldpin)
	{
		try {
			enterTextByID(prop.getProperty("ChangePin.oldpin.Id"), oldpin);
			Reporter.reportStep("Old PIN Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter Old PIN", "FAIL");
		}
		return this;
	}
	public UBIChangePINPage EnterNewpin(String oldpin)
	{
		try {
			enterTextByID(prop.getProperty("ChangePin.Newpin.Id"), oldpin);
			Reporter.reportStep("New PIN Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter New PIN", "FAIL");
		}
		return this;
	}
	public UBIChangePINPage EnterConfirmNewPin(String oldpin)
	{
		try {
			enterTextByID(prop.getProperty("ChangePin.ReenterNewpin.Id"), oldpin);
			Reporter.reportStep("New PIN Re-entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Re-enter New PIN", "FAIL");
		}
		return this;
	}
	
	

	public UBIChangePINPage verifyalerttext(String text)
	{
		try {
			boolean val =verifyTextByID(prop.getProperty("CollectConfirmation.alerttext.Id"),text);
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
	
	public UBIChangePINPage ClickSubmit()
	{
		try {
			hideKeyboard();
			clickByXpath(prop.getProperty("ChangePINPage.Submit.Xpath"));
			Reporter.reportStep("Submit Button Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click Submit button", "FAIL");
		}
		return this;
	}
	
	

	
}
