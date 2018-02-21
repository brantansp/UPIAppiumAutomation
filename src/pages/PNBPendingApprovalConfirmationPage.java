package pages;

import utils.Reporter;
import wrappers.GenericWrappers;

public class PNBPendingApprovalConfirmationPage extends GenericWrappers {
	
	public PNBPendingApprovalConfirmationPage clickApprove()
	{
		try {
			clickByXpath(prop.getProperty("PendingApproval.Approve.Xpath"));
			Reporter.reportStep("Approve Button clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Approve Button", "FAIL");
		}
		return this;
	}

	public PNBPendingApprovalConfirmationPage clickDecline()
	{
		try {
			clickByXpath(prop.getProperty("PendingApproval.Decline.Xpath"));
			Reporter.reportStep("Decline Button clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click Decline Button ", "FAIL");
		}
		return this;
	}
	
	public PNBPendingApprovalConfirmationPage clickDefer()
	{
		try {
			clickByXpath(prop.getProperty("PendingApproval.Defer.Xpath"));
			Reporter.reportStep("Defer Button clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to click Defer Button", "FAIL");
		}
		return this;
	}
	
	public PNBPayNPCIPage ClickYes()
	{
		try {
			clickByXpath(prop.getProperty("PendingAproval.Alert.Yes"));
			Reporter.reportStep("Alert Yes Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Alert Yes", "FAIL");
		}
		return new PNBPayNPCIPage();
	}
	
	public PNBPendingApprovalConfirmationPage ClickNo()
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
