package pages;

import utils.Reporter;
import wrappers.AppiumWrappers;

public class PNBAddVirtualAddressPage extends AppiumWrappers {
	public PNBAddVirtualAddressPage pagetitle(String txt)
	{
		try {
			verifyTextByXpath((prop.getProperty("AddVirtualAddress.Pagetitle.Xpath")),txt);
			Reporter.reportStep("Page Title Verified", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Page Title Not Matched", "FAIL");
		}
		
		return this;
	}

	public PNBAddVirtualAddressPage SelectAccount(String txt)
	{
		try {
			
			//System.out.println((prop.getProperty("AddVirtualAddress.Account.Xpath"))+txt+"')]");
			clickByXpath((prop.getProperty("AddVirtualAddress.Account.Xpath"))+txt+"')]");
			Reporter.reportStep("Account Selected", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Select Account", "FAIL");
		}
		
		return this;
	}
	
	public PNBAddVirtualAddressPage enterVirtualAddress(String txt)
	{
		try {			
			enterTextByXpath(prop.getProperty("AddVirtualAddress.VirtualAdress.Xpath"),txt);
			Reporter.reportStep("Virtual Address entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter Virtual Address", "FAIL");
		}
		
		return this;
	}
	public PNBAddVirtualAddressPage selectFrequency()
	{
		try {			
			clickByXpath(prop.getProperty("AddVirtualAddress.Frequency.Xpath"));
			Reporter.reportStep("Frequency selected", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to select Frequency", "FAIL");
		}
		
		return this;
	}
	public PNBAddVirtualAddressPage clickSubmit()
	{
		try {
			clickByXpath(prop.getProperty("AddVirtualAddress.Submit.Xpath"));
			Reporter.reportStep("Submit clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to click Submit", "FAIL");
		}
		
		return this;
	}
	public PNBAddVirtualAddressPage verifyAlertText(String txt)
	{
		try {
			String text = getTextByXpath(prop.getProperty("AddVirtualAddress.AlertText.Xpath"));
			verifyTextByXpath(prop.getProperty("AddVirtualAddress.AlertText.Xpath"), txt);
			//System.out.println(text);
			Reporter.reportStep("Verification successful", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Verification Failed", "FAIL");
		}
		
		return this;
	}
	public PNBHomePage acceptAlertOK()
	{
		try {
			clickByXpath(prop.getProperty("AddVirtualAddress.AlertOK.Xpath"));
			Reporter.reportStep("Alert OK clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to click Alert OK", "FAIL");
		}
		
		return new PNBHomePage();
	}
	
	public PNBHomePage ClickSubmit()
	{
		try {
			clickByXpath(prop.getProperty("AddVirtualAddress.Submit.Xpath"));
			Reporter.reportStep("Submit Button clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to click Submit", "FAIL");
		}
		return new PNBHomePage();
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
	
	public PNBAddVirtualAddressPage ClickAlertOkforFailure()
	{
		try {
			clickByID(prop.getProperty("PaydetailConfirmation.Alertok.ID"));
			Reporter.reportStep("Alert Box Accepted", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Accept Alert", "FAIL");
		}
		return this;
	}
	
}
