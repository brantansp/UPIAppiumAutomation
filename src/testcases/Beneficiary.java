package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.PNBLoginPage;
import utils.DataInputProvider;
import utils.Reporter;
import wrappers.GenericWrappers;

public class Beneficiary extends GenericWrappers {
	protected String browserName;
	protected String dataSheetName;
	protected String filename;
	protected static String testCaseName;
	protected static String testDescription = "PNB Mobile App Functional Testing";
	
	@BeforeSuite
	public void beforeSuite() throws FileNotFoundException, IOException{
		Reporter.startResult();
		loadObjects();
	}
		
	@AfterSuite
	public void afterSuite(){
		Reporter.endResult();
	}
	
	@Test(dataProvider = "BE_1" , enabled = true)
    //A Pay Scenario where Payer is using Acc No + IFSC & Payee is VPA
	public void BE_1(String devname,String packagename,String Activity,String password,String Bankname,String Vaddr,String Amount,String mpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "BE_1";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforFailure();
		 }
	@Test(dataProvider = "BE_2" , enabled = true)
    //A Pay Scenario where Payer is using Mobile no + MMID & Payee is Acc no and IFSC
	public void BE_2(String devname,String packagename,String Activity,String password,String Bankname,String toaccount,String toifsc,String toamount,String mpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "BE_2";
			Reporter.startTestCase(testCaseName,testDescription); 
			 new PNBLoginPage()
			  .getBatteryInfo()
			  .launchAndroidApp()
			  .EnterPasswordByXpath(password)
			  .ClickLoginButtonByXpathForSuccess()
			  .ClickPayByXpath()
			  .SelectTransferToAccount(Bankname)
			  .SelectPayeeAddresstypeAcc()
			  .EnterAccNoOnPayeeIFSCTransferAccountNumber(toaccount)
			  .EnterAccNoOnPayeeIFSCTransferIFSC(toifsc)
			  .EnterAccNoOnPayeeIFSCTransferAmount(toamount)
			  .ClickSubmitButton()
			  .ClickConfirmButton()
			  .getreferenceIdByXpath()
			  .enterMpin(mpin)
			  .ClickSubmit()
			  .verifyalerttext(verifytext)
			  .ClickAlertOkforSuccess();
			 }
		 
	
	@Test(dataProvider = "BE_3" , enabled = true)
    //A Pay Scenario where Payer is using Acc No + IFSC & Payee is Adhaar no
	public void BE_3(String devname,String packagename,String Activity,String password,String Bankname,String Vaddr,String Amount,String mpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "BE_3";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
		 }
	@Test(dataProvider = "BE_4" , enabled = true)
    //A Pay Scenario where Payer is using Acc No + IFSC & Payee is Mobile no and MMID
	public void BE_4(String devname,String packagename,String Activity,String password,String Bankname,String Vaddr,String Amount,String mpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "BE_4";
		  Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		 .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	@Test(dataProvider = "BE_5" , enabled = true)
    //A Pay Scenario where Payer is using Mobile no + MMID & Payee is Adhaar no and IIN
	public void BE_5(String devname,String packagename,String Activity,String password,String Bankname,String Vaddr,String Amount,String mpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "BE_5";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/*@Test(dataProvider = "BE_6" , enabled = true)
    //Timeout at Beneficiary end
	public void BE_6(String devname,String packagename,String Activity,String password,String Bankname,String Vaddr,String Amount,String mpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "BE_6";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp(devname,packagename,Activity)
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOk();
		 }*/
	@Test(dataProvider = "BE_7" , enabled = true)
    //INACTIVE OR DORMANT ACCOUNT 
	public void BE_7(String devname,String packagename,String Activity,String password,String Bankname,String Vaddr,String Amount,String mpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "BE_7";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		 .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		 .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforFailure()
		  ;
		 }
	/*@Test(dataProvider = "BE_8" , enabled = true)
    //Partial Debit Reversal 
	public void BE_8(String devname,String packagename,String Activity,String password,String Bankname,String Vaddr,String Amount,String mpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "BE_8";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		 .getBatteryInfo()
		  .launchAndroidApp(devname,packagename,Activity)
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOk();
		 }*/
	@Test(dataProvider = "BE_9" , enabled = true)
    //ACCOUNT DOES NOT EXIST 
	public void BE_9(String devname,String packagename,String Activity,String password,String Bankname,String Vaddr,String Amount,String mpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "BE_9";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		 .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/*@Test(dataProvider = "BE_10" , enabled = true)
    //BENEFICIARY CBS Offline
	public void BE_10(String devname,String packagename,String Activity,String password,String Bankname,String Vaddr,String Amount,String mpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "BE_10";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp(devname,packagename,Activity)
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOk();
		 }*/
	@Test(dataProvider = "BE_12" , enabled = true)
    //Invalid Beneficiary Credentials
	public void BE_12(String devname,String packagename,String Activity,String password,String Bankname,String Vaddr,String Amount,String mpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "BE_12";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		 .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
		 }
	@Test(dataProvider = "BE_14" , enabled = true)
    //Invalid Amount
	public void BE_14(String devname,String packagename,String Activity,String password,String Bankname,String Vaddr,String Amount,String mpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "BE_14";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		 .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	@Test(dataProvider = "BE_17" , enabled = true)
    //BENEFICIARY ACCOUNT BLOCKED/FROZEN
	public void BE_19(String devname,String packagename,String Activity,String password,String Bankname,String Vaddr,String Amount,String mpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "BE_17";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		 .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	@DataProvider(name = "BE_1")
	public Object[][] getData1() {
		return DataInputProvider.getSheet("UPI_Beneficiary","BE_1");
	}
	@DataProvider(name = "BE_2")
	public Object[][] getData2() {
		return DataInputProvider.getSheet("UPI_Beneficiary","BE_2");
	}
	@DataProvider(name = "BE_3")
	public Object[][] getData3() {
		return DataInputProvider.getSheet("UPI_Beneficiary","BE_3");
	}
	@DataProvider(name = "BE_4")
	public Object[][] getData4() {
		return DataInputProvider.getSheet("UPI_Beneficiary","BE_4");
	}
	@DataProvider(name = "BE_5")
	public Object[][] getData5() {
		return DataInputProvider.getSheet("UPI_Beneficiary","BE_5");
	}
	@DataProvider(name = "BE_6")
	public Object[][] getData6() {
		return DataInputProvider.getSheet("UPI_Beneficiary","BE_6");
	}
	@DataProvider(name = "BE_7")
	public Object[][] getData7() {
		return DataInputProvider.getSheet("UPI_Beneficiary","BE_7");
	}
	
	@DataProvider(name = "BE_8")
	public Object[][] getData8() {
		return DataInputProvider.getSheet("UPI_Beneficiary","BE_8");
	}
	@DataProvider(name = "BE_9")
	public Object[][] getData9() {
		return DataInputProvider.getSheet("UPI_Beneficiary","BE_9");
	}
	
	@DataProvider(name = "BE_10")
	public Object[][] getData10() {
		return DataInputProvider.getSheet("UPI_Beneficiary","BE_10");
	}
	@DataProvider(name = "BE_12")
	public Object[][] getData12() {
		return DataInputProvider.getSheet("UPI_Beneficiary","BE_12");
	}
	@DataProvider(name = "BE_14")
	public Object[][] getData14() {
		return DataInputProvider.getSheet("UPI_Beneficiary","BE_14");
	}
	@DataProvider(name = "BE_17")
	public Object[][] getData17() {
		return DataInputProvider.getSheet("UPI_Beneficiary","BE_17");
	}
	
  
}
