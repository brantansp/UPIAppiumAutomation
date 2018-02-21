package pages;

import utils.Reporter;
import wrappers.GenericWrappers;

public class PNBChangePINPage1 extends GenericWrappers{
	public PNBChangePINPage SelectTransaction(String txt)
	{
		try {
			//System.out.println((prop.getProperty("PendingApproval.Amount.Xpath")+txt+"')]"));
			clickByXpath(prop.getProperty("PendingApproval.Amount.Xpath")+txt+"')]");
			Reporter.reportStep("Account Seceted For Approval", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to select Account", "FAIL");
		}
		return new PNBChangePINPage();
	}
}
