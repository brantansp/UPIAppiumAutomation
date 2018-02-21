package pages;

import utils.Reporter;
import wrappers.AppiumWrappers;

public class UBICollectdetailsPage extends AppiumWrappers{
	
	public UBICollectdetailsPage SelectTransferToAccount(String Bankname)
	{
		try {
			clickByXpath(prop.getProperty("CollectDetailsPage.Transferto.Xpath"));
			//System.out.println(prop.getProperty("CollectDetailsPage.TransfertoBankName.Xpath")+Bankname+"')]");
			clickByXpath(prop.getProperty("CollectDetailsPage.TransfertoBankName.Xpath")+Bankname+"')]");
			
			Reporter.reportStep("Transfer To Account selected", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to select Account", "FAIL");
		}
		return this;
	}
	
	public UBICollectdetailsPage EnterVirtualAddress(String Vaddress)
	{
		try {
			enterTextByXpath(prop.getProperty("CollectdetailsPage.EnterVirtAddress.Xpath"), Vaddress);
			Reporter.reportStep("Virtual address entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter Virtual address", "FAIL");
		}
		return this;
	}

	public UBICollectdetailsPage EnterAmount(String Amount)
	{
		try {
			enterTextByXpath(prop.getProperty("CollectdetailsPage.EnterAmount.Xpath"), Amount);
			Reporter.reportStep("Amount entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter Amount", "FAIL");
		}
		return this;
	}
	
	
	public UBICollectdetailsPage clickstartdate()
	{
		try {
			clickByXpath(prop.getProperty("CollectdetailsPage.startdate.Xpath"));
			datepicker("22", "Jul", "2016");
			Reporter.reportStep("Start date clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to click start date", "FAIL");
		}
		return this;
	}
	
	public UBICollectdetailsPage ClickDone()
	{
		try {
			hideKeyboard();
			clickByXpath(prop.getProperty("CollectDetailsPage.DatepickerDone.Xpath"));
			Reporter.reportStep("Done Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click Done", "FAIL");
		}
		return this;
	}
	
	public UBICollectdetailsPage EnterRemarks(String remarks)
	{
		try {
			clickByID(prop.getProperty("CollectDetailsPage.remarks.Id"));
			enterTextByID(prop.getProperty("CollectDetailsPage.remarks.Id"), remarks);
			Reporter.reportStep("Done Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click Done", "FAIL");
		}
		return this;
	}
public 	UBICollectdetailsPageConfirmation ClickSubmit()
{
	try {
		clickByID(prop.getProperty("CollecDetails.Submit.Id"));
		Reporter.reportStep("Submit Button Clicked", "PASS");
	} catch (Exception e) {
		Reporter.reportStep("Failed to Click Submit Button", "FAIL");
	}
	return new UBICollectdetailsPageConfirmation();
}


}