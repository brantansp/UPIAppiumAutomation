package pages;

import utils.Reporter;
import wrappers.AppiumWrappers;

public class UBIPaydetailsPage extends AppiumWrappers{
	
	public UBIPaydetailsPage SelectPayeeAddresstypeAcc()
	{
		try {
			clickByXpath(prop.getProperty("PaydetailsPage.PayeeAddress.Xpath"));
			clickByXpath(prop.getProperty("PaydetailsPage.PayeeAccounttypeIFSC.Xpath"));
			Reporter.reportStep("Payee Address Type Selected", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to select Payee Address type", "FAIL");
		}
		return this;
	}
	
	public UBIPaydetailsPage EnterAccNoOnPayeeIFSCTransferAccountNumber(String txt)
	{
		try {
			
			clickByXpath(prop.getProperty("PaydetailsIFSCCodePage.PayeeAccountNo.Xpath"));
			enterTextByXpath(prop.getProperty("PaydetailsIFSCCodePage.PayeeAccountNo.Xpath"),txt);
			hideKeyboard();
			Reporter.reportStep("Account Number Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter Account Number", "FAIL");
		}
		return this;
	}
	
	public UBIPaydetailsPage EnterAccNoOnPayeeIFSCTransferIFSC(String txt)
	{
		try {
			//clickByXpath(prop.getProperty("PaydetailsPage.PayeeAddress.Xpath"));
			enterTextByXpath(prop.getProperty("PaydetailsIFSCCodePage.PayeeIFSC.Xpath"),txt);
			Reporter.reportStep("IFSC Code Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter IFSC Code", "FAIL");
		}
		return this;
	}
	
	public UBIPaydetailsPage EnterAccNoOnPayeeIFSCTransferAmount(String txt)
	{
		try {
			//clickByXpath(prop.getProperty("PaydetailsPage.PayeeAddress.Xpath"));
			enterTextByXpath(prop.getProperty("PaydetailsIFSCCodePage.PayeeAmount.Xpath"),txt);
			Reporter.reportStep("Amount Entered Entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter Amount", "FAIL");
		}
		return this;
	}
	
	

	public UBIPaydetailsPage Selecttransferfrom(String Bankname)
	{
		try {
			clickByXpath(prop.getProperty("CollectDetailsPage.Transferto.Xpath"));
			clickByXpath(prop.getProperty("CollectDetailsPage.TransfertoBankName.Xpath")+Bankname+"')]");
			/*clickByXpath(prop.getProperty("PaydetailsPage.Transferfrom.Xpath"));
			clickByXpath(prop.getProperty("PaydetailsPage.selectTransferfrom.Xpath"));*/
			Reporter.reportStep("Transfer from Account Selected", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to select Transfer From Account", "FAIL");
		}
		return this;
	}

	public UBIPaydetailsPage SelectPayeeAddresstype()
	{
		try {
			clickByXpath(prop.getProperty("PaydetailsPage.PayeeAddress.Xpath"));
			clickByXpath(prop.getProperty("PaydetailsPage.PayeeAccounttype.Xpath"));
			Reporter.reportStep("Payee Address Type Selected", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to select Payee Address type", "FAIL");
		}
		return this;
	}

	public UBIPaydetailsPage EnterVirtualAddress(String Vaddr)
	{
		try {
			enterTextByXpath(prop.getProperty("PaydetailsPage.EnterVirtualaddress.Xpath"), Vaddr);
			hideKeyboard();
			Reporter.reportStep("Virtual address entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter Virtual address", "FAIL");
		}
		return this;
	}
	
	public UBIPaydetailsPage EnterVirtualAddress2(String Vaddr)
	{
		try {
			enterTextByID(prop.getProperty("PaydetailsPage.EnterVirtualaddress2.Xpath"), Vaddr);
			hideKeyboard();
			Reporter.reportStep("Seconf Virtual address entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter Second Virtual address", "FAIL");
		}
		return this;
	}
	
	
	public UBIPaydetailsPage ClickAddvirtualaddress()
	{
		try {
			clickByID(prop.getProperty("PaydetailsPage.AddVirtualaddress.Id"));
			//enterTextByXpath(prop.getProperty("PaydetailsPage.EnterVirtualaddress.Xpath"), Vaddr);
			hideKeyboard();
			Reporter.reportStep("Virtual address entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter Virtual address", "FAIL");
		}
		return this;
	}
	
	public UBIPaydetailsPage ClickAddAccountIFSC()
	{
		try {
			clickByID(prop.getProperty("PaydetailsPage.AccountIFSC.Id"));
			hideKeyboard();
			Reporter.reportStep("Account + IFSC new line added", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to add Account + IFSC ", "FAIL");
		}
		return this;
	}
	
	public UBIPaydetailsPage EnterAccountIFSCaccount2(String account)
	{
		try {
			enterTextByXpath(prop.getProperty("PaydetailsPage.AccountIFSC2.Xpath"), account);
			Reporter.reportStep("Second account number entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter second account", "FAIL");
		}
		return this;
	}
	
	public UBIPaydetailsPage EnterAccountIFSCAmount2(String Amount)
	{
		try {
			enterTextByXpath(prop.getProperty("PaydetailsPage.EnterAccountIFSCAmount2.Id"), Amount);
			Reporter.reportStep("Amount entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter Amount", "FAIL");
		}
		return this;
	}
	
	public UBIPaydetailsPage EnterAccountIFSCifsc2(String ifsc)
	{
		try {
			enterTextByXpath(prop.getProperty("PaydetailsPage.EnterAccountIFSCifsc2.Id"), ifsc);
			Reporter.reportStep("IFSC entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter IFSC", "FAIL");
		}
		return this;
	}
	
	public UBIPaydetailsPage EnterAmount(String Amount)
	{
		try {
			enterTextByXpath(prop.getProperty("PaydetailsPage.EnterAmount.Xpath"), Amount);
			Reporter.reportStep("Amount entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter Amount", "FAIL");
		}
		return this;
	}
	
	public UBIPaydetailsPage EnterAmount2ByID(String Amount)
	{
		try {
			enterTextByID(prop.getProperty("PaydetailsPage.EnterAmount2.Id"), Amount);
			Reporter.reportStep("Amount entered", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to enter Amount", "FAIL");
		}
		return this;
	}

	public UBIPaydetailsPage ScrolltoSubmit(String Amount)
	{
		try {
			scrollToInApp("SUBMIT");
			Reporter.reportStep("Page scrolled", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Scroll", "FAIL");
		}
		return this;
	}

	
	public PNBPaydetailsPageConfirmation ClickSubmitButton()
	{
		try {
			clickByXpath(prop.getProperty("PaydetailsPage.SubmitButton.Xpath"));
			Reporter.reportStep("Submit Button Clicked", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to Click Submit Button", "FAIL");
		}
		return new PNBPaydetailsPageConfirmation();
	}
	public UBIPaydetailsPage SelectTransferToAccount(String Bankname)
	{
		try {
			clickByXpath(prop.getProperty("CollectDetailsPage.Transferto.Xpath"));
			//System.out.println(prop.getProperty("CollectDetailsPage.TransfertoBankName.Xpath")+Bankname+"')]");
			clickByXpath(prop.getProperty("CollectDetailsPage.TransfertoBankName.Xpath")+Bankname+"')]");
			
			Reporter.reportStep("Transfer To Account selected", "PASS");
		} catch (Exception e) {
			Reporter.reportStep("Failed to select Account", "FAIL");
		}
		return this;
	}
	
}
