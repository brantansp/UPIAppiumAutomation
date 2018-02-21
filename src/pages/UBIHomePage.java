package pages;

import java.io.IOException;
import utils.Reporter;
import wrappers.AppiumWrappers;

public class UBIHomePage extends AppiumWrappers{
	
	
	public UBIViewBalancePage ClickViewBalanceByXpath()
	{
		try {
			clickByXpath(prop.getProperty("HomePage.ViewBalance.Xpath"));
			Reporter.reportStep("View Balance Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click ViewBalance", "FAIL");
		}
		return new UBIViewBalancePage();
	}
	
	public UBIPaydetailsPage ClickPayByXpath()
	{
		try {
			clickByXpath(prop.getProperty("HomePage.Pay.Xpath"));
			Reporter.reportStep("Pay Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Pay", "FAIL");
		}
		return new UBIPaydetailsPage();
	}
	
	public UBIAddBankPage ClickAddBankByXpath()
	{
		try {
			clickByXpath(prop.getProperty("HomePage.AddBank.Xpath"));
			Reporter.reportStep("Add Bank Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Add Bank", "FAIL");
		}
		return new UBIAddBankPage();
	}
	
	public UBICollectdetailsPage ClickCollectByXpath()
	{
		try {
			clickByXpath(prop.getProperty("HomePage.Collect.Xpath"));
			Reporter.reportStep("Collect Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Collect", "FAIL");
		}
		return new UBICollectdetailsPage();
	}
	
	
	public UBIHomePage OpenMenuDrawerByID()
	{
		try {
			clickByID(prop.getProperty("HomePage.Menu.ID"));
			Reporter.reportStep("Menu Drawer Opened", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Open Menudrawer", "FAIL");
		}
		return new UBIHomePage();
	}
	
	public UBIAddBankPage ClickAddBankAccByXpath()
	{
		try {
			clickByXpath(prop.getProperty("HomePage.AddBank.Xpath"));
			Reporter.reportStep("Add BAnk A/C Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Add Bank A/C", "FAIL");
		}
		return new UBIAddBankPage();
	}
	
	public UBISetPINPage ClickSetPINByID()
	{
		try {
			clickByID(prop.getProperty("HomePage.SetPIN.Id"));
			Reporter.reportStep("Set PIN Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Set PIN", "FAIL");
		}
		return new UBISetPINPage();
	}
	
	public UBIPendingApprovalPage ClickPendingApprovalByID()
	{
		try {
			clickByID(prop.getProperty("HomePage.UBIPendingApprovals.Id"));
			Reporter.reportStep("Pending Approvals Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Pending Approvals", "FAIL");
		}
		return new UBIPendingApprovalPage();
	}
	
	public UBIParticipantsPage ClickParticipantsByID()
	{
		try {
			clickByID(prop.getProperty("HomePage.Participants.Id"));
			Reporter.reportStep("Participants Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Participants", "FAIL");
		}
		return new UBIParticipantsPage();
	}
	
	public UBIChangePINPage1 ClickChangePINByID()
	{
		try {
			clickByID(prop.getProperty("HomePage.ChangePIN.Id"));
			Reporter.reportStep("Change PIN Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Change PIN", "FAIL");
		}
		return new UBIChangePINPage1();
	}
	
	public UBIAddVirtualAddressPage ClickAddVirtualAddressByXpath()
	{
		try {
			clickByXpath(prop.getProperty("HomePage.AddVirtualAddress.Xpath"));
			Reporter.reportStep("Add Virtual Address Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Click Add Virtual Address", "FAIL");
		}
		return new UBIAddVirtualAddressPage();
	}
	
	
	public UBILoginPage VerifyAlertText(String string)
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
		
		return new UBILoginPage();
	}
	
	public UBILoginPage ClickAlertOk()
	{
		try {
			clickByID(prop.getProperty("HomePage.AlertOk.Id"));
			Reporter.reportStep("Alert Ok clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click OK", "FAIL");
		}
		
		return new UBILoginPage();
	}
	
	public UBIHomePage ClickLogout()
	{
		try {
			clickByID(prop.getProperty("HomePage.Logout.Id"));
			Process Process = Runtime.getRuntime().exec("adb shell dumpsys battery > d:/output.txt");
			Reporter.reportStep("Logout Button clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Logout", "FAIL");
		}
		
		return new UBIHomePage();
	}
	
	public UBILoginPage ClickYESOnAlert()
	{
		try {
			clickByID(prop.getProperty("HomePage.LogoutAlert.Id"));
			Reporter.reportStep("Alert YES clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click Alert YES", "FAIL");
		}
		
		return new UBILoginPage();
	}
	
	public UBIHomePage SwitchApplication() throws IOException
	{
		switchapp();
		
		return new UBIHomePage();
	}
	
	public UBILoginPage launchUBIApp() 
	{
		try {
			launchApp(prop.getProperty("UBI.Packagename"),prop.getProperty("UBI.AppActivity"),prop.getProperty("UBI.Serial"));
			//launchApp(appPackage, appActivity,devname);
			Thread.sleep(2000);
			Reporter.reportStep("UBI App Lanched", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Launch UBI App", "FAIL");
		}
		return new UBILoginPage();
	}
	
	public PNBLoginPage launchPNBApp() 
	{
		try {
			launchActivity(prop.getProperty("PNB.Packagename"),prop.getProperty("PNB.AppActivity"));
			//launchApp(appPackage, appActivity,devname);
			Thread.sleep(2000);
			Reporter.reportStep("App Lanched", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Launch App", "FAIL");
		}
		return new PNBLoginPage();
	}		
}
