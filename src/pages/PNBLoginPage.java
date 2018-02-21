package pages;

import java.net.MalformedURLException;

import utils.Reporter;
import wrappers.AppiumWrappers;

public class PNBLoginPage extends AppiumWrappers{

	public PNBLoginPage launchAndroidApp() throws MalformedURLException, InterruptedException
	{
		try {
			launchApp(prop.getProperty("Mobile.Packagename"),prop.getProperty("Mobile.AppActivity"),prop.getProperty("Mobile.Serial"));
			//launchApp(appPackage, appActivity,devname);
			Thread.sleep(2000);
			Reporter.reportStep("App Lanched", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Launch App", "FAIL");
		}
		return this;
	}
	
	public PNBLoginPage launchUBIApp() throws MalformedURLException, InterruptedException
	{
		try {
			launchApp(prop.getProperty("UBI.Packagename"),prop.getProperty("UBI.AppActivity"),prop.getProperty("UBI.Serial"));
			//launchApp(appPackage, appActivity,devname);
			Thread.sleep(2000);
			Reporter.reportStep("UBI App Lanched", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Launch UBI App", "FAIL");
		}
		return this;
	}
	
	public PNBLoginPage launchPNBApp() throws MalformedURLException, InterruptedException
	{
		try {
			launchApp(prop.getProperty("PNB.Packagename"),prop.getProperty("PNB.AppActivity"),prop.getProperty("PNB.Serial"));
			//launchApp(appPackage, appActivity,devname);
			Thread.sleep(2000);
			Reporter.reportStep("App Lanched", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Launch App", "FAIL");
		}
		return this;
	}
	/*public PNBLoginPage launchAndroidApp(String devname,String appPackage,String appActivity) throws MalformedURLException, InterruptedException
	{
		try {
			launchApp(prop.getProperty("Mobile.Packagename"),prop.getProperty("Mobile.AppActivity"),prop.getProperty("Mobile.Serial"));
			//launchApp(appPackage, appActivity,devname);
			Thread.sleep(2000);
			Reporter.reportStep("App Lanched", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Launch App", "FAIL");
		}
		return this;
	}*/
	
	public PNBLoginPage EnterPasswordById(String txt) throws InterruptedException
	{	
		try {
			clickByID(prop.getProperty("HomePage.PNBPassword.Id"));
			//System.out.println(prop.getProperty("HomePage.Password.Id"));
			enterTextByID(prop.getProperty("HomePage.PNBPassword.Id"),txt);
			Reporter.reportStep("Password Text "+txt+" Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Password Not Entered", "FAIL");
		}
		return this;
	}
	
	public PNBLoginPage EnterPasswordByXpath(String txt) throws InterruptedException
	{	
		try {
			enterTextByXpath(prop.getProperty("HomePage.Password.Xpath"), txt);
			showhidekeyboard();
			Reporter.reportStep("Password Text "+txt+" Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Password Not Entered", "FAIL");
		}
		return this;
	}
	
	public PNBLoginPage getBatteryInfo()
	{
		try {
			String level = batteryinfo();
			Reporter.reportStepWOsnap("Battery level is "+level+" Percentage", "PASS");
					} catch (Exception e) {
						Reporter.reportStepWOsnap("Failed to get Battery Percentage", "FAIL");
		}
		return this;
	}
	
	public PNBHomePage ClickLoginButtonByXpathForSuccess()
	{
		try {
			//driver.hideKeyboard();
			clickByXpath(prop.getProperty("HomePage.LoginButton.Xpath"));
			Reporter.reportStep("Login Button Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to click Login Button", "FAIL");
		}
		return new PNBHomePage();
	}
	
	public PNBLoginPage ClickLoginButtonByXpathForFailure()
	{
		try {
			driver.hideKeyboard();
			clickByXpath(prop.getProperty("HomePage.LoginButton.Xpath"));
			Reporter.reportStep("Login Button Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to click Login Button", "FAIL");
		}
		return this;
	}
	
	public PNBLoginPage ForgotPasswordIsEnabled() throws InterruptedException
	{
		try {
			IsEnabledByID(prop.getProperty("HomePage.ForgotText.id"));
			Reporter.reportStep("Forgot Password is enabled to click", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Forgot Password not visible to Click", "FAIL");
		}
		return this;
	}
	
	public PNBForgotPasswordPage ClickForgotPasswordByXpath() throws InterruptedException
	{
		try {
			clickByXpath(prop.getProperty("HomePage.ForgotText.Xpath"));
			Reporter.reportStep("Forgot Password Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click Forgot Password", "FAIL");
		}
		return new PNBForgotPasswordPage();
	}
	
	
	public PNBLoginPage VerifyAlertText(String string)
	{
		try {
			//System.out.println(getTextById(prop.getProperty("HomePage.WrongpasswordAlert.Id")));
			boolean val=verifyTextByID(prop.getProperty("HomePage.WrongpasswordAlert.Id"), string);
			if (val == true)
			{
			Reporter.reportStep("Alert Text Verified", "PASS");
			}
			else
			{Reporter.reportStep("Alert Text Mismatch", "FAIL");}
		} catch (Exception e) {
			Reporter.reportStep("Alert Text Mismatch", "FAIL");
		}
		
		return this;
	}
	
	public PNBLoginPage ClickAlertOk()
	{
		try {
			clickByID(prop.getProperty("HomePage.AlertOk.Id"));
			Reporter.reportStep("Alert Ok clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click OK", "FAIL");
		}
		
		return this;
	}
	
	public PNBLoginPage Excelwrite()
	{
		try {
			writeDataInExcel("./data/test.xls", "Result1", "PR_1", "Testing data");
			//clickByID(prop.getProperty("HomePage.AlertOk.Id"));
			Reporter.reportStep("Excel write completed", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to write in Excel", "FAIL");
		}
		
		return this;
	}
	
	
	
}
