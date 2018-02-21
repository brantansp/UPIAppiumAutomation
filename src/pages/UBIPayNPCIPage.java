package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import utils.Reporter;
import wrappers.AppiumWrappers;

public class UBIPayNPCIPage extends AppiumWrappers{
	
	public UBIPayNPCIPage enterMpin(String mpin)
	{
		try {
			enterTextByXpath(prop.getProperty("PaydetailsPage.Mpin.Xpath"), mpin);
			Reporter.reportStep("Mpin Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Enter Mpin", "FAIL");
		}
		return this;
	}
	public UBIPayNPCIPage enterMpinonBalance(String mpin)
	{
		try {
			enterTextByXpath(prop.getProperty("PaydetailsPage.MpinBal.Xpath"), mpin);
			Reporter.reportStep("Mpin Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Enter Mpin", "FAIL");
		}
		return this;
	}
	
	public UBIPayNPCIPage enterCollectMpin(String mpin)
	{
		try {
			enterTextByXpath(prop.getProperty("PendingApprovals.Mpin.Xpath"), mpin);
			Reporter.reportStep("Mpin Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Enter Mpin", "FAIL");
		}
		return this;
	}
	
	public UBIPayNPCIPage ClickSubmit()
	{
		try {
			hideKeyboard();
			clickByXpath(prop.getProperty("PaydetailsPage.MpinPageSubmit.Xpath"));
			Reporter.reportStep("Submit Button Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click Submit button", "FAIL");
		}
		return this;
	}
	
	public UBIPayNPCIPage Getalerttext()
	{
		try {
			String txt = getTextByXpath(prop.getProperty("PaydetailsPage.alerttext.xpath"));
			Reporter.reportStep("Pay request Confirmation Text is "+txt, "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Capture Text", "FAIL");
		}
		return this;
	}
	
	public UBIHomePage ClickAlertOkforSuccess()
	{
		try {
			clickByID(prop.getProperty("PaydetailsPage.alertOk.ID"));
			Reporter.reportStep("Alert Box Accepted", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Accept Alert", "FAIL");
		}
		return new UBIHomePage();
	}
	
	public UBIPayNPCIPage ClickAlertOkforFailure()
	{
		try {
			clickByID(prop.getProperty("PaydetailConfirmation.Alertok.ID"));
			Reporter.reportStep("Alert Box Accepted", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Accept Alert", "FAIL");
		}
		return this;
	}
	
	public UBIPayNPCIPage getreferenceIdOnBalancePageByXpath() throws InterruptedException
	{	
		try {
			String txt = getTextByXpath(prop.getProperty("NPCI.ReferenceIDBal.Xpath"));
			//excelWriteAndAppend(filename, testCaseName, Data2, Result)
			System.out.println(txt);
			Reporter.reportStep("Reference Number Captured is "+txt, "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Capture Reference ID", "FAIL");
		}
		return new UBIPayNPCIPage();
	}
	
	public UBIPayNPCIPage getreferenceIdByXpath() throws InterruptedException
	{	
		try {
			String txt = getTextByXpath(prop.getProperty("NPCI.ReferenceID.Xpath"));
			//excelWriteAndAppend(filename, testCaseName, Data2, Result)
			System.out.println(txt);
			Reporter.reportStep("Reference Number Captured is "+txt, "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Capture Reference ID", "FAIL");
		}
		return new UBIPayNPCIPage();
	}
	
	
	public UBIPayNPCIPage verifyalerttext(String text)
	{
		try {
			boolean val =verifyTextByID(prop.getProperty("CollectConfirmation.alerttext.Id"),text);
			if (val == true)
			{
				Reporter.reportStep("Confirmation Text Successfull", "PASS");
			}
			else
			{Reporter.reportStep("Confirmation text not matched", "FAIL");}
			
		} catch (Exception e) {
			Reporter.reportStep("Confirmation text not matched", "FAIL");
		}
		return this;
	}
	
	public UBIPayNPCIPage resultWithRefId(String TCName,String mpin,String alertText) throws IOException{
		try {
			String Status;
			String refId=getrefId(prop.getProperty("NPCI.ReferenceID.Xpath"));
			System.out.println(refId);
			enterMpin(mpin);
			ClickSubmit();
			String Alert=driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).getText();
			System.out.println("Alert="+Alert);
			if(Alert.equals(alertText)){
				System.out.println("1\n");
				Status="PASS";
				}
			else{
				Status="FAIL";
				System.out.println("2\n");
			}
			System.out.println("status is :"+Status);
			excelWriteAndAppend("./data/Result.xls",TCName,refId,Status);
		} catch (Exception e) {
			
		}
		
		return this;
	}


}
