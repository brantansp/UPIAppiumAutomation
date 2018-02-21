package pages;

import utils.Reporter;
import wrappers.AppiumWrappers;

public class PNBHomePage extends AppiumWrappers{
	
	
	public PNBViewBalancePage ClickViewBalanceByXpath()
	{
		try {
			clickByXpath(prop.getProperty("HomePage.ViewBalance.Xpath"));
			Reporter.reportStep("View Balance Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click ViewBalance", "FAIL");
		}
		return new PNBViewBalancePage();
	}
	
	public PNBPaydetailsPage ClickPayByXpath()
	{
		try {
			clickByXpath(prop.getProperty("HomePage.Pay.Xpath"));
			Reporter.reportStep("Pay Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Pay", "FAIL");
		}
		return new PNBPaydetailsPage();
	}
	
	public PNBAddBankPage ClickAddBankByXpath()
	{
		try {
			clickByXpath(prop.getProperty("HomePage.AddBank.Xpath"));
			Reporter.reportStep("Add Bank Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Add Bank", "FAIL");
		}
		return new PNBAddBankPage();
	}
	
	public PNBCollectdetailsPage ClickCollectByXpath()
	{
		try {
			clickByXpath(prop.getProperty("HomePage.Collect.Xpath"));
			Reporter.reportStep("Collect Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Collect", "FAIL");
		}
		return new PNBCollectdetailsPage();
	}
	
	
	public PNBHomePage OpenMenuDrawerByID()
	{
		try {
			clickByID(prop.getProperty("HomePage.Menu.ID"));
			Reporter.reportStep("Menu Drawer Opened", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Open Menudrawer", "FAIL");
		}
		return new PNBHomePage();
	}
	
	public PNBAddBankPage ClickAddBankAccByXpath()
	{
		try {
			clickByXpath(prop.getProperty("HomePage.AddBank.Xpath"));
			Reporter.reportStep("Add BAnk A/C Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Add Bank A/C", "FAIL");
		}
		return new PNBAddBankPage();
	}
	
	public PNBSetPINPage ClickSetPINByID()
	{
		try {
			clickByID(prop.getProperty("HomePage.SetPIN.Id"));
			Reporter.reportStep("Set PIN Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Set PIN", "FAIL");
		}
		return new PNBSetPINPage();
	}
	
	public PNBPendingApprovalPage ClickPendingApprovalByID()
	{
		try {
			clickByID(prop.getProperty("HomePage.PNBPendingApprovals.Id"));
			Reporter.reportStep("Pending Approvals Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Pending Approvals", "FAIL");
		}
		return new PNBPendingApprovalPage();
	}
	
	public PNBParticipantsPage ClickParticipantsByID()
	{
		try {
			clickByID(prop.getProperty("HomePage.Participants.Id"));
			Reporter.reportStep("Participants Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Participants", "FAIL");
		}
		return new PNBParticipantsPage();
	}
	
	public PNBChangePINPage1 ClickChangePINByID()
	{
		try {
			clickByID(prop.getProperty("HomePage.ChangePIN.Id"));
			Reporter.reportStep("Change PIN Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Change PIN", "FAIL");
		}
		return new PNBChangePINPage1();
	}
	
	public PNBAddVirtualAddressPage ClickAddVirtualAddressByXpath()
	{
		try {
			clickByXpath(prop.getProperty("HomePage.AddVirtualAddress.Xpath"));
			Reporter.reportStep("Add Virtual Address Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Add Virtual Address", "FAIL");
		}
		return new PNBAddVirtualAddressPage();
	}
	
	
	public PNBLoginPage VerifyAlertText(String string)
	{
		try {
			//System.out.println(getTextByXpath(prop.getProperty("HomePage.WrongpasswordAlert.Xpath")));
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
	
	public PNBLoginPage ClickAlertOk()
	{
		try {
			clickByID(prop.getProperty("HomePage.AlertOk.Id"));
			Reporter.reportStep("Alert Ok clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click OK", "FAIL");
		}
		
		return new PNBLoginPage();
	}
	
	public PNBHomePage ClickLogout()
	{
		try {
			clickByID(prop.getProperty("HomePage.Logout.Id"));
			Process Process = Runtime.getRuntime().exec("adb shell dumpsys battery > d:/output.txt");
			Reporter.reportStep("Logout Button clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Logout", "FAIL");
		}
		
		return new PNBHomePage();
	}
	
	public PNBLoginPage ClickYESOnAlert()
	{
		try {
			clickByID(prop.getProperty("HomePage.LogoutAlert.Id"));
			Reporter.reportStep("Alert YES clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click Alert YES", "FAIL");
		}
		
		return new PNBLoginPage();
	}
	
		
}
