package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import utils.Reporter;
import wrappers.AppiumWrappers;

public class PNBCollectdetailsPageConfirmation extends AppiumWrappers{
	public PNBCollectdetailsPageConfirmation clickconfirm()
	{
		try {
			clickByID(prop.getProperty("CollecDetails.Submit.Id"));
			Reporter.reportStep("Confirm button Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("failed to Click Confirm button", "FAIL");
		}
		return this;
	}

	public PNBCollectdetailsPageConfirmation verifyalerttext(String text)
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
	
	public PNBHomePage ClickOK()
	{
		try {
			clickByID(prop.getProperty("CollectConfirmation.alertOK.Id"));
			Reporter.reportStep("Alert Accepted", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to click OK", "FAIL");
		}
		return new PNBHomePage();
	}
	public PNBCollectdetailsPageConfirmation resultWithoutRefId(String TCName,String alertText) throws IOException{
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
