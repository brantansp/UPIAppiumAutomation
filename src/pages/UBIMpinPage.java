package pages;

import utils.Reporter;
import wrappers.AppiumWrappers;

public class UBIMpinPage extends AppiumWrappers{

	public UBIMpinPage EnterMpinByXpath(String txt) throws InterruptedException
	{	
		try {
			enterTextByXpath(prop.getProperty("ViewBalance.Mpin.Xpath"), txt);
			
			Reporter.reportStep("MPIN Text "+txt+" Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("MPIN Not Entered", "FAIL");
		}
		return new UBIMpinPage();
	}
	
	public UBIMpinPage ClickSubmitByXpath() throws InterruptedException
	{	
		try {
			hideKeyboard();
			clickByXpath(prop.getProperty("ViewBalance.Submit.Xpath"));
			
			Reporter.reportStep("Submit Button Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click Submit", "FAIL");
		}
		return new UBIMpinPage();
	}
	
	public UBIMpinPage getAccountBalanceByXpath() throws InterruptedException
	{	
		try {
			String bal = getTextByXpath(prop.getProperty("ViewBalance.AccountBalance.Xpath"));
			
			Reporter.reportStep("Account Balance is "+bal, "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Unable to get balance", "FAIL");
		}
		return new UBIMpinPage();
	}
	
	
	public UBIMpinPage ClickAlertOKByXpath() throws InterruptedException
	{	
		try {
			clickByXpath(prop.getProperty("ViewBalance.AlertOK.Xpath"));
			back();
			//back();
			Reporter.reportStep("OK Button Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click OK", "FAIL");
		}
		return new UBIMpinPage();
	}
	
	
	
}
