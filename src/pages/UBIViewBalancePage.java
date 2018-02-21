package pages;

import utils.Reporter;
import wrappers.AppiumWrappers;

public class UBIViewBalancePage extends AppiumWrappers{
	
	public UBIPayNPCIPage SelectAccountByXpath(String txt)
	{
		try {
			System.out.println(prop.getProperty("ViewBalance.AccountList.Xpath")+txt+"']");
			clickByXpath(prop.getProperty("ViewBalance.AccountList.Xpath")+txt+"']");
			Reporter.reportStep("Account Selected", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed To Select Account", "FAIL");
		}
		return new UBIPayNPCIPage();
	}
	
	public UBILoginPage VerifyAlertText(String string)
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
	
	public UBIViewBalancePage ClickLogout()
	{
		try {
			clickByID(prop.getProperty("HomePage.Logout.Id"));
			Process Process = Runtime.getRuntime().exec("adb shell dumpsys battery > d:/output.txt");
			Reporter.reportStep("Logout Button clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Logout", "FAIL");
		}
		
		return new UBIViewBalancePage();
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
	
}
