package pages;

import utils.Reporter;
import wrappers.AppiumWrappers;

public class PNBAddBankPage extends AppiumWrappers {
	public PNBAddBankPage pagetitle(String txt)
	{
		try {
			verifyTextByXpath((prop.getProperty("AddBank.Pagetitle.xpath")),txt);
			Reporter.reportStep("Page Title Verified", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Page Title Not Matched", "FAIL");
		}
		
		return this;
	}

	public PNBAddBankPage EnterBankName(String txt)
	{
		try {
			enterTextPressdownByXpath((prop.getProperty("AddBank.Bankname.xpath")), txt);
			//enterTextByXpath((prop.getProperty("AddBank.Bankname.xpath")),txt);
			//pressEnter();
			Reporter.reportStep("Bank Name entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter Bank Name", "FAIL");
		}
		
		return this;
	}
	
	public PNBAddBankPage Selectbanknamefromlist()
	{
		try {
			//clickByXpath((prop.getProperty("AddBank.Banknamelist.xpath")));
			//TapinApp();
			TapinBankName();
			//getxy();
			Reporter.reportStep("Bank Name entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter Bank Name", "FAIL");
		}
		
		return this;
	}
	
}
