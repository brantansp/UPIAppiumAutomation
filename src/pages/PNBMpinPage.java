package pages;

import utils.Reporter;
import wrappers.AppiumWrappers;

public class PNBMpinPage extends AppiumWrappers{

	public PNBMpinPage EnterMpinByXpath(String txt) throws InterruptedException
	{	
		try {
			enterTextByXpath(prop.getProperty("ViewBalance.Mpin.Xpath"), txt);
			
			Reporter.reportStep("MPIN Text "+txt+" Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("MPIN Not Entered", "FAIL");
		}
		return new PNBMpinPage();
	}
	
	public PNBMpinPage ClickSubmitByXpath() throws InterruptedException
	{	
		try {
			hideKeyboard();
			clickByXpath(prop.getProperty("ViewBalance.Submit.Xpath"));
			
			Reporter.reportStep("Submit Button Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click Submit", "FAIL");
		}
		return new PNBMpinPage();
	}
	
	public PNBMpinPage getAccountBalanceByXpath() throws InterruptedException
	{	
		try {
			String bal = getTextByXpath(prop.getProperty("ViewBalance.AccountBalance.Xpath"));
			
			Reporter.reportStep("Account Balance is "+bal, "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Unable to get balance", "FAIL");
		}
		return new PNBMpinPage();
	}
	
	
	public PNBMpinPage ClickAlertOKByXpath() throws InterruptedException
	{	
		try {
			clickByXpath(prop.getProperty("ViewBalance.AlertOK.Xpath"));
			back();
			//back();
			Reporter.reportStep("OK Button Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click OK", "FAIL");
		}
		return new PNBMpinPage();
	}
	
	
	
}
