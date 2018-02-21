package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import utils.Reporter;
import wrappers.AppiumWrappers;

public class UBIPaydetailsPageONONmpin extends AppiumWrappers{
	
	public UBIPayNPCIPage ClickSendmoney()
	{
		try {
			clickByXpath(prop.getProperty("PaydetailsPageConfirmation.sendmoney.Xpath"));
			Reporter.reportStep("Sendmoney Button Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click Sendmoney Button", "FAIL");
		}
		return new UBIPayNPCIPage();
	}
	
	public UBIPaydetailsPageONONmpin verifyalerttext(String text)
	{
		try {
			boolean val = verifyTextByID(prop.getProperty("CollectConfirmation.alerttext.Id"),text);
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
	
	public UBIPaydetailsPageONONmpin ClickAlertOkforSuccess()
	{
		try {
			
			clickByID(prop.getProperty("PaydetailsPage.alertOk.ID"));
			Reporter.reportStep("Alert Box Accepted", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Accept Alert", "FAIL");
		}
		return this;
	}
	
	public UBIPaydetailsPageONONmpin ClickAlertOkforFailure()
	{
		try {
			clickByID(prop.getProperty("PaydetailConfirmation.Alertok.ID"));
			Reporter.reportStep("Alert Box Accepted", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Accept Alert", "FAIL");
		}
		return this;
	}
	
	public UBIHomePage ClickOK()
	{
		try {
			clickByID(prop.getProperty("CollectConfirmation.alertOK.Id"));
			Reporter.reportStep("Alert Accepted", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to click OK", "FAIL");
		}
		return new UBIHomePage();
	}
	
	public UBIPaydetailsPageONONmpin EnterPIN(String pin)
	{
		try {
			enterTextByID(prop.getProperty("PaydetailConfirmation.PIN.ID"), pin);
			
			Reporter.reportStep("Alert Box Accepted", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Accept Alert", "FAIL");
		}
		return this;
	}
	
	
	public UBIPaydetailsPageONONmpin resultWithoutRefId(String TCName,String alertText) throws IOException{
		try {
			String Status;
			String Alert=driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).getText();
			System.out.println("Alert="+Alert);
			if(Alert.equals(alertText)){
				Status="PASS";
				}
			else{
				Status="FAIL";
			}
			excelWriteAndAppend("./reports/Result.xls",TCName,"N/A",Status);
		} catch (Exception e) {
			
		}
		
		return this;
	}
	
}
