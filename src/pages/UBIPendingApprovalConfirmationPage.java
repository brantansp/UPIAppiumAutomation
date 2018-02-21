package pages;

import utils.Reporter;
import wrappers.GenericWrappers;

public class UBIPendingApprovalConfirmationPage extends GenericWrappers {
	
	public UBIPendingApprovalConfirmationPage clickApprove()
	{
		try {
			clickByXpath(prop.getProperty("PendingApproval.Approve.Xpath"));
			Reporter.reportStep("Approve Button clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Approve Button", "FAIL");
		}
		return this;
	}

	public UBIPendingApprovalConfirmationPage clickDecline()
	{
		try {
			clickByXpath(prop.getProperty("PendingApproval.Decline.Xpath"));
			Reporter.reportStep("Decline Button clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click Decline Button ", "FAIL");
		}
		return this;
	}
	
	public UBIPendingApprovalConfirmationPage clickDefer()
	{
		try {
			clickByXpath(prop.getProperty("PendingApproval.Defer.Xpath"));
			Reporter.reportStep("Defer Button clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to click Defer Button", "FAIL");
		}
		return this;
	}
	
	public UBIPayNPCIPage ClickYes()
	{
		try {
			clickByXpath(prop.getProperty("PendingAproval.Alert.Yes"));
			Reporter.reportStep("Alert Yes Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Alert Yes", "FAIL");
		}
		return new UBIPayNPCIPage();
	}
	
	public UBIPendingApprovalConfirmationPage ClickNo()
	{
		try {
			clickByXpath(prop.getProperty("PendingAproval.Alert.No"));
			Reporter.reportStep("Alert No Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Alert No", "FAIL");
		}
		return this;
	}
	
}
