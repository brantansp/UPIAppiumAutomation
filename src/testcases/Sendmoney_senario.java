package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.PNBLoginPage;
import pages.UBILoginPage;
import utils.DataInputProvider;
import utils.Reporter;
import wrappers.GenericWrappers;

public class Sendmoney_senario extends GenericWrappers {
	protected String browserName;
	protected String dataSheetName;
	protected String filename;
	protected static String testCaseName;
	protected static String testDescription = "UPI Senario Testing";
	
	@BeforeSuite
	public void beforeSuite() throws FileNotFoundException, IOException{
		Reporter.startResult();
		loadObjects();
	}
		
	@AfterSuite
	public void afterSuite(){
		Reporter.endResult();
	}
		
	/**
	 * Send money using Registered Payee
	 *  Scenario 1
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_1" , enabled = true)
	public void SMRP_1(String password, String Bankname,String FromVPA,String Vaddr,String Amount, String pin, String text) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_1";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchPNBApp()
		  .getBatteryInfo()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .Selecttransferfrom(Bankname)
		  .SelectPayerVPA(FromVPA)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpinONON(pin)
		  .ClickSendMoney()
		  .verifyalerttext(text)
		  .ClickAlertOkforSuccess()
		  ;
		}
		
	/**
	 * Send money using Registered Payee
	 * Scenario 2
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException
	 * @throws MalformedURLException 
	 */
	
	@Test(dataProvider = "SM_2" , enabled = true)
	public void SMRP_2(String password, String Bankname,String FromVPA,String Vaddr, String Amount, String mpin, String verifytext) throws InterruptedException, MalformedURLException  {
		testCaseName 	= "SMRP_2";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchPNBApp()
		  .getBatteryInfo()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .Selecttransferfrom(Bankname)
		  .SelectPayerVPA(FromVPA)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Registered Payee
	 * Scenario 3
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_3" , enabled = true)
	public void SMRP_3(String password, String Bankname,String FromVPA,String Vaddr,String Amount, String mpin, String verifytext) throws InterruptedException, MalformedURLException  {
		testCaseName = "SMRP_3";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchPNBApp()
		  .getBatteryInfo()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .Selecttransferfrom(Bankname)
		  .SelectPayerVPA(FromVPA)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Registered Payee
	 *  Scenario 4
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_4" , enabled = true)
	public void SMRP_4(String password, String Bankname,String FromVPA,String Vaddr, String ifsc, String Amount, String mpin, String verifytext) throws InterruptedException, MalformedURLException  {
		testCaseName 	= "SMRP_4";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchPNBApp()
		  .getBatteryInfo()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .Selecttransferfrom(Bankname)
		  .SelectPayerVPA(FromVPA)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  //.ClickSubmit()
		  .verifyalerttext(verifytext)
		  //.verifyresponsecode(respcode)
		  .ClickAlertOkforSuccess()
		  ;
	}
		
	/**
	 *  Send money using Registered Payee
	 *  Scenario 5
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_5" , enabled = true)
	public void SMRP_5(String password, String Bankname,String FromVPA,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		 testCaseName 	= "SMRP_5";
			Reporter.startTestCase(testCaseName,testDescription); 
		  new PNBLoginPage()
		  .getBatteryInfo()
		 .launchPNBApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .Selecttransferfrom(Bankname)
		  .SelectPayerVPA(FromVPA)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  //.getreferenceIdByXpath()
		  .enterMpinONON(mpin)
		  .ClickSendMoney()
		 // .ClickSubmit()
		  .verifyalerttext(verifytext)
		  //.verifyresponsecode(respcode)
		  .ClickAlertOkforSuccess()
		  ;
		 }
	
	/**
	 *  Send money using Registered Payee
	 *  Scenario 6
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_6" , enabled = true)
	public void SMRP_6(String password, String Bankname,String FromVPA,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		 testCaseName 	= "SMRP_6";
			Reporter.startTestCase(testCaseName,testDescription); 
			new PNBLoginPage()
			  .getBatteryInfo()
			 .launchPNBApp()
			  .EnterPasswordByXpath(password)
			  .ClickLoginButtonByXpathForSuccess()
			  .ClickPayByXpath()
			  .Selecttransferfrom(Bankname)
			  .SelectPayerVPA(FromVPA)
			  .SelectPayeeAddresstypeAcc()
			  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
			  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
			  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
			  .ClickSubmitButton()
			  .ClickConfirmButton()
			  .getreferenceIdByXpath()
			  .enterMpin(mpin)
			 // .ClickSubmit()
			 .verifyalerttext(verifytext)
			  //.verifyresponsecode(respcode)
			  .ClickAlertOkforSuccess()
			  ;
		 }
	
	/**
	 *  Send money using Registered Payee
	 *  Scenario 7
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_7" , enabled = true)
	public void SMRP_7(String password, String Bankname,String FromVPA,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		 testCaseName 	= "SMRP_7";
			Reporter.startTestCase(testCaseName,testDescription); 
			new PNBLoginPage()
			  .getBatteryInfo()
			 .launchPNBApp()
			  .EnterPasswordByXpath(password)
			  .ClickLoginButtonByXpathForSuccess()
			  .ClickPayByXpath()
			  .Selecttransferfrom(Bankname)
			  .SelectPayerVPA(FromVPA)
			  .SelectPayeeAddresstypeAcc()
			  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
			  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
			  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
			  .ClickSubmitButton()
			  .ClickConfirmButton()
			  .getreferenceIdByXpath()
			  .enterMpin(mpin)
			 // .ClickSubmit()
			  .verifyalerttext(verifytext)
			  //.verifyresponsecode(respcode)
			  .ClickAlertOkforSuccess()
			  ;
		 }
	
	/**
	 *  Send money using Registered Payee
	 *  Scenario 8
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_8" , enabled = true)
	public void SMRP_8(String password, String Bankname,String FromVPA,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_8";
		Reporter.startTestCase(testCaseName,testDescription); 
		new PNBLoginPage()
		  .getBatteryInfo()
		 .launchPNBApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .Selecttransferfrom(Bankname)
		  .SelectPayerVPA(FromVPA)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		 // .ClickSubmit()
		  .verifyalerttext(verifytext)
		  //.verifyresponsecode(respcode)
		  .ClickAlertOkforSuccess()
		  ;
		 }
	
	/**
	 * Send money using Registered Payee
	 *  Scenario 9
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_9" , enabled = true)
	public void SMQP_9(String password, String Bankname,String FromVPA,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_9";
		Reporter.startTestCase(testCaseName,testDescription); 
		new PNBLoginPage()
		  .getBatteryInfo()
		  .launchPNBApp()
		  .getBatteryInfo()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .Selecttransferfrom(Bankname)
		  .SelectPayerVPA(FromVPA)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpinONON(pin)
		  .ClickSendMoney()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
		}
		
	/**
	 * Send money using Registered Payee
	 *  Scenario 10
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_10" , enabled = false)
	public void SMQP_10(String password, String Bankname,String FromVPA,String Vaddr, String Amount, String mpin, String verifytext) throws InterruptedException, MalformedURLException  {
		testCaseName 	= "SMQP_10";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchPNBApp()
		  .getBatteryInfo()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .Selecttransferfrom(Bankname)
		  .SelectPayerVPA(FromVPA)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Registered Payee
	 *  Scenario 11
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_11" , enabled = false)
	public void SMQP_11(String password, String Bankname,String FromVPA,String Vaddr, String ifsc, String Amount, String mpin, String verifytext) throws InterruptedException, MalformedURLException  {
		testCaseName 	= "SMQP_11";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchPNBApp()
		  .getBatteryInfo()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .Selecttransferfrom(Bankname)
		  .SelectPayerVPA(FromVPA)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Registered Payee
	 *  Scenario 12
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_12" , enabled = true)
	public void SMQP_12(String password, String Bankname,String FromVPA,String Vaddr, String ifsc, String Amount, String mpin, String verifytext) throws InterruptedException, MalformedURLException  {
		testCaseName 	= "SMQP_12";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchPNBApp()
		  .getBatteryInfo()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .Selecttransferfrom(Bankname)
		  .SelectPayerVPA(FromVPA)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
		
	/**
	 *  Send money using Registered Payee
	 *  Scenario 13
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_13" , enabled = false)
	public void SMQP_13(String password, String Bankname,String FromVPA,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		 testCaseName 	= "SMQP_13";
			Reporter.startTestCase(testCaseName,testDescription); 
			 new PNBLoginPage()
			  .getBatteryInfo()
			 .launchPNBApp()
			  .EnterPasswordByXpath(password)
			  .ClickLoginButtonByXpathForSuccess()
			  .ClickPayByXpath()
			  .Selecttransferfrom(Bankname)
			  .SelectPayerVPA(FromVPA)
			  .SelectPayeeAddresstypeAcc()
			  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
			  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
			  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
			  .ClickSubmitButton()
			  .ClickConfirmButton()
			  .enterMpinONON(mpin)
			  .ClickSendMoney()
			  .verifyalerttext(verifytext)
			  .ClickAlertOkforSuccess()
			  ;
			 }
	
	/**
	 *  Send money using Registered Payee
	 *  Scenario 14
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_14" , enabled = false)
	public void SMQP_14(String password, String Bankname,String FromVPA,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		 testCaseName 	= "SMQP_14";
			Reporter.startTestCase(testCaseName,testDescription); 
			new PNBLoginPage()
			  .getBatteryInfo()
			 .launchPNBApp()
			  .EnterPasswordByXpath(password)
			  .ClickLoginButtonByXpathForSuccess()
			  .ClickPayByXpath()
			  .Selecttransferfrom(Bankname)
			  .SelectPayerVPA(FromVPA)
			  .SelectPayeeAddresstypeAcc()
			  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
			  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
			  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
			  .ClickSubmitButton()
			  .ClickConfirmButton()
			  .getreferenceIdByXpath()
			  .enterMpin(mpin)
			  .verifyalerttext(verifytext)
			  .ClickAlertOkforSuccess()
			  ;
			 }
	
	/**
	 *  Send money using Registered Payee
	 *  Scenario 15
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_15" , enabled = false)
	public void SMQP_15(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		 testCaseName 	= "SMQP_15";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpinONON(mpin)
		  .ClickSendMoney()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Registered Payee
	 *  Scenario 16
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SM_16" , enabled = false)
	public void SMQP_16(String password, String Bankname,String FromVPA,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_16";
		Reporter.startTestCase(testCaseName,testDescription); 
		new PNBLoginPage()
		  .getBatteryInfo()
		 .launchPNBApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .Selecttransferfrom(Bankname)
		  .SelectPayerVPA(FromVPA)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
		 }
	
	/**
	 * Send money using Split Payment
	 *  Scenario 1
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMSP_1" , enabled = false)
	public void SMSP_1(String password, String Bankname,
			String Vaddr,String Amount, String Vaddr2,String Amount2,String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMSP_1";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickAddvirtualaddress()
		  .EnterVirtualAddress2(Vaddr2)
		  .EnterAmount2ByID(Amount2)
		  .ClickSubmitButton()
		  .ClickConfirmButtonforONON()
		  .EnterPIN(pin)
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
	}
	
	/**
	 * Send money using Split Payment
	 *  Scenario 2
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMSP_2" , enabled = false)
	public void SMSP_2(String password, String Bankname,String Vaddr,String Amount, String Vaddr2,String Amount2,String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMSP_2";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickAddvirtualaddress()
		  .EnterVirtualAddress2(Vaddr2)
		  .EnterAmount2ByID(Amount2)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
	}
	
	/**
	 * Send money using Split Payment
	 *  Scenario 3
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMSP_3" , enabled = false)
	public void SMSP_3(String password, String Bankname,String Vaddr,String Amount, String Vaddr2,String Amount2,String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMSP_3";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickAddvirtualaddress()
		  .EnterVirtualAddress2(Vaddr2)
		  .EnterAmount2ByID(Amount2)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
	}
	
	/**
	 * Send money using Split Payment
	 *  Scenario 4
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMSP_4" , enabled = false)
	public void SMSP_4(String password, String Bankname,
			String Vaddr,String Amount, String Vaddr2,String Amount2,String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMSP_4";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickAddvirtualaddress()
		  .EnterVirtualAddress2(Vaddr2)
		  .EnterAmount2ByID(Amount2)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
	}
	
	/**
	 * Send money using Split Payment
	 *  Scenario 5
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMSP_5" , enabled = true)
	public void SMSP_5(String password, String Bankname,String Accno,String ifsc,String Amount,String Accno2,String ifsc2,String Amount2,String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMSP_5";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .ClickAddAccountIFSC()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno2)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc2)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount2)
		  .ClickSubmitButton()
		  .ClickConfirmButtonforONON()
		  .EnterPIN(pin)
		  .ClickSendmoney()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
	}
	
	/**
	 * Send money using Split Payment
	 *  Scenario 6
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMSP_6" , enabled = true)
	public void SMSP_6(String password, String Bankname,String Accno,String ifsc,String Amount,String Accno2,String ifsc2,String Amount2,String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMSP_6";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .ClickAddAccountIFSC()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno2)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc2)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount2)
		  .ClickSubmitButton()
		  .ClickConfirmButtonforONON()
		  .EnterPIN(pin)
		  .ClickSendmoney()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
	}
	
	/**
	 * Send money using Split Payment
	 *  Scenario 7
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMSP_7" , enabled = true)
	public void SMSP_7(String password, String Bankname,String Accno,String ifsc,String Amount,String Accno2,String ifsc2,String Amount2,String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMSP_7";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .ClickAddAccountIFSC()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno2)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc2)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount2)
		  .ClickSubmitButton()
		  .ClickConfirmButtonforONON()
		  .EnterPIN(pin)
		  .ClickSendmoney()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
	}
	
	/**
	 * Send money using Split Payment
	 *  Scenario 8
	 * @param devname
	 * @param packagename
	 * @param Activity
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMSP_8" , enabled = true)
	public void SMSP_8(String password, String Bankname,String Accno,String ifsc,String Amount,String Accno2,String ifsc2,String Amount2,String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMSP_8";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .ClickAddAccountIFSC()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno2)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc2)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount2)
		  .ClickSubmitButton()
		  .ClickConfirmButtonforONON()
		  .EnterPIN(pin)
		  .ClickSendmoney()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
	}
	
	/**
	 * Send money using Registered Payee
	 *  Scenario 19
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_19" , enabled = true)
	public void SMRP_19(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_19";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchPNBApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
		
	/**
	 * Send money using Registered Payee
	 *  Scenario 20
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_20" , enabled = true)
	public void SMRP_20(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_20";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchPNBApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Registered Payee
	 *  Scenario 21
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_21" , enabled = true)
	public void SMRP_21(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_21";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchPNBApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Registered Payee
	 *  Scenario 22
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_22" , enabled = true)
	public void SMRP_22(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_22";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchPNBApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Registered Payee
	 *  Scenario 23
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_23" , enabled = true)
	public void SMRP_23(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_23";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Registered Payee
	 *  Scenario 24
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_24" , enabled = true)
	public void SMRP_24(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_24";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Registered Payee
	 *  Scenario 25
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_25" , enabled = true)
	public void SMRP_25(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_25";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Registered Payee
	 *  Scenario 26
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_26" , enabled = true)
	public void SMRP_26(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_26";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 *  Send money using Registered Payee
	 *  Scenario 27
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_27" , enabled = false)
	public void SMRP_27(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_27";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Registered Payee
	 *  Scenario 28
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_28" , enabled = false)
	public void SMRP_28(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_28";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Registered Payee
	 *  Scenario 29
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_29" , enabled = false)
	public void SMRP_29(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_29";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Registered Payee
	 *  Scenario 30
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_30" , enabled = false)
	public void SMRP_30(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_30";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Registered Payee
	 *  Scenario 31
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_31" , enabled = false)
	public void SMRP_31(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_31";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Registered Payee
	 *  Scenario 32
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_32" , enabled = false)
	public void SMRP_32(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_32";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Registered Payee
	 *  Scenario 33
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_33" , enabled = false)
	public void SMRP_33(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_33";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Registered Payee
	 *  Scenario 34
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_34" , enabled = false)
	public void SMRP_34(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_34";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 * Send money using Quick Payment
	 *  Scenario 35
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_35" , enabled = true)
	public void SMQP_35(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_35";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Quick Payment
	 *  Scenario 36
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_36" , enabled = true)
	public void SMQP_36(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_36";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Quick Payment
	 *  Scenario 37
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_37" , enabled = true)
	public void SMQP_37(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_37";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Quick Payment
	 *  Scenario 38
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_38" , enabled = true)
	public void SMQP_38(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_38";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Quick Payment
	 *  Scenario 39
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_39" , enabled = true)
	public void SMQP_39(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_39";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Quick Payment
	 *  Scenario 40
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_40" , enabled = true)
	public void SMQP_40(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_40";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Send money using Quick Payment
	 * Scenario 41
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_41" , enabled = true)
	public void SMQP_41(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_41";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	/**
	 * Send money using Quick Payment
	 *  Scenario 42
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_42" , enabled = true)
	public void SMQP_42(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_42";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 *  Send money using Quick Payment
	 *  Scenario 43
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_43" , enabled = false)
	public void SMQP_43(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_43";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Quick Payment
	 *  Scenario 44
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_44" , enabled = false)
	public void SMQP_44(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_44";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Quick Payment
	 *  Scenario 45
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_45" , enabled = false)
	public void SMQP_45(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_45";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Quick Payment
	 *  Scenario 46
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_46" , enabled = false)
	public void SMQP_46(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_46";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Quick Payment
	 *  Scenario 47
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_47" , enabled = false)
	public void SMQP_47(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_47";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Quick Payment
	 *  Scenario 48
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_48" , enabled = false)
	public void SMQP_48(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_48";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Quick Payment
	 *  Scenario 49
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_49" , enabled = false)
	public void SMQP_49(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_49";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 *  Send money using Quick Payment
	 *  Scenario 50
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_50" , enabled = false)
	public void SMQP_50(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_50";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 * Reversal Transaction
	 * Send money using Registered Payee
	 *  Scenario 51
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_51" , enabled = true)
	public void SMRP_51(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_51";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 52
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_52" , enabled = false)
	public void SMRP_52(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_52";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	
	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 53
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_53" , enabled = false)
	public void SMRP_53(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_53";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	
	/**
	 * Reversal Transaction
	 * Send money using Registered Payee
	 *  Scenario 54
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_54" , enabled = true)
	public void SMQP_54(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_54";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 55
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_55" , enabled = false)
	public void SMRP_55(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_55";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	
	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 56
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_56" , enabled = false)
	public void SMQP_56(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_56";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	
	/**
	 * Reversal Transaction
	 * Send money using Registered Payee
	 *  Scenario 57
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMSP_57" , enabled = true)
	public void SMSP_57(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMSP_57";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 58
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_58" , enabled = true)
	public void SMQP_58(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_58";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
		 }
	
	
	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 59
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMSP_59" , enabled = false)
	public void SMSP_59(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMSP_59";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 60
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_60" , enabled = true)
	public void SMRP_60(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_60";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 61
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_61" , enabled = true)
	public void SMRP_61(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_61";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	

	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 62
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_62" , enabled = false)
	public void SMRP_62(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_62";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 63
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_63" , enabled = false)
	public void SMRP_63(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_63";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	

	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 64
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_64" , enabled = true)
	public void SMQP_64(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_64";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 65
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMQP_65" , enabled = true)
	public void SMQP_65(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMQP_65";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}	
	
	

	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 66
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_66" , enabled = false)
	public void SMRP_66(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_66";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	
	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 67
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_67" , enabled = false)
	public void SMRP_67(String password, String Bankname,String Accno, String ifsc, String Amount, String mpin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_67";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstypeAcc()
		  .EnterAccNoOnPayeeIFSCTransferAccountNumber(Accno)
		  .EnterAccNoOnPayeeIFSCTransferIFSC(ifsc)
		  .EnterAccNoOnPayeeIFSCTransferAmount(Amount)
		  .SelectTransferToAccount(Bankname)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .getreferenceIdByXpath()
		  .enterMpin(mpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess();
		 }
	

	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 68
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_68" , enabled = true)
	public void SMRP_68(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_68";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Reversal Transaction
	 *  Send money using Quick Payment
	 *  Scenario 60
	 * @param password
	 * @param Bankname
	 * @param Accno
	 * @param ifsc
	 * @param Amount
	 * @param mpin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "SMRP_69" , enabled = true)
	public void SMRP_69(String password, String Bankname,String Vaddr,String Amount, String pin, String verifytext) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "SMRP_69";
		Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPayByXpath()
		  .SelectTransferToAccount(Bankname)
		  .SelectPayeeAddresstype()
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .ClickSubmitButton()
		  .ClickConfirmButton()
		  .enterMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	
	@DataProvider(name = "SM_1")
	public Object[][] getData1() {
		return DataInputProvider.getSheet("Sendmoney","SM_1");
	}
	
	@DataProvider(name = "SM_2")
	public Object[][] getData2() {
		return DataInputProvider.getSheet("Sendmoney","SM_2");
	}
	
	@DataProvider(name = "SM_3")
	public Object[][] getData3() {
		return DataInputProvider.getSheet("Sendmoney","SM_3");
	}
	
	@DataProvider(name = "SM_4")
	public Object[][] getData4() {
		return DataInputProvider.getSheet("Sendmoney","SM_4");
	}
	
	@DataProvider(name = "SM_5")
	public Object[][] getData5() {
		return DataInputProvider.getSheet("Sendmoney","SM_5");
	}
	
	@DataProvider(name = "SM_6")
	public Object[][] getData6() {
		return DataInputProvider.getSheet("Sendmoney","SM_6");
	}
	
	@DataProvider(name = "SM_7")
	public Object[][] getData7() {
		return DataInputProvider.getSheet("Sendmoney","SM_7");
	}
	
	@DataProvider(name = "SM_8")
	public Object[][] getData8() {
		return DataInputProvider.getSheet("Sendmoney","SM_8");
	}
	
	@DataProvider(name = "SM_9")
	public Object[][] getData9() {
		return DataInputProvider.getSheet("Sendmoney","SM_9");
	}
	
	@DataProvider(name = "SM_10")
	public Object[][] getData10() {
		return DataInputProvider.getSheet("Sendmoney","SM_10");
	}
	
	@DataProvider(name = "SM_11")
	public Object[][] getData11() {
		return DataInputProvider.getSheet("Sendmoney","SM_11");
	}
	
	@DataProvider(name = "SM_12")
	public Object[][] getData12() {
		return DataInputProvider.getSheet("Sendmoney","SM_12");
	}
	
	@DataProvider(name = "SM_13")
	public Object[][] getData13() {
		return DataInputProvider.getSheet("Sendmoney","SM_13");
	}
	
	@DataProvider(name = "SM_14")
	public Object[][] getData14() {
		return DataInputProvider.getSheet("Sendmoney","SM_14");
	}
	
	@DataProvider(name = "SM_15")
	public Object[][] getData15() {
		return DataInputProvider.getSheet("Sendmoney","SM_15");
	}
	
	@DataProvider(name = "SM_16")
	public Object[][] getData16() {
		return DataInputProvider.getSheet("Sendmoney","SM_16");
	}
	
	@DataProvider(name = "SMSP_1")
	public Object[][] getData17() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_1");
	}
	
	@DataProvider(name = "SMSP_2")
	public Object[][] getData18() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_2");
	}
	
	@DataProvider(name = "SMSP_3")
	public Object[][] getData19() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_3");
	}
	
	@DataProvider(name = "SMSP_4")
	public Object[][] getData20() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_4");
	}
	
	@DataProvider(name = "SMSP_5")
	public Object[][] getData21() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_5");
	}
  
	@DataProvider(name = "SMSP_6")
	public Object[][] getData22() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_6");
	}
	
	@DataProvider(name = "SMSP_7")
	public Object[][] getData23() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_7");
	}
	
	@DataProvider(name = "SMSP_8")
	public Object[][] getData24() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_8");
	}
	
	@DataProvider(name = "SMRP_19")
	public Object[][] getData25() {
		return DataInputProvider.getSheet("Sendmoney","SMRP_19");
	}
	@DataProvider(name = "SMRP_20")
	public Object[][] getData26() {
		return DataInputProvider.getSheet("Sendmoney","SMRP_20");
	}
	@DataProvider(name = "SMRP_21")
	public Object[][] getData27() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_21");
	}
	@DataProvider(name = "SMRP_22")
	public Object[][] getData28() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_22");
	}
	@DataProvider(name = "SMSP_23")
	public Object[][] getData29() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_23");
	}
	@DataProvider(name = "SMRP_24")
	public Object[][] getData30() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_24");
	}
	
	@DataProvider(name = "SMRP_25")
	public Object[][] getData31() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_25");
	}
	
	@DataProvider(name = "SMRP_26")
	public Object[][] getData32() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_26");
	}
	
	@DataProvider(name = "SMRP_27")
	public Object[][] getData33() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_27");
	}
	
	@DataProvider(name = "SMRP_28")
	public Object[][] getData34() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_28");
	}
	
	@DataProvider(name = "SMRP_29")
	public Object[][] getData35() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_29");
	}
	
	@DataProvider(name = "SMRP_30")
	public Object[][] getData36() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_30");
	}
	@DataProvider(name = "SMRP_31")
	public Object[][] getData37() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_31");
	}
	@DataProvider(name = "SMRP_32")
	public Object[][] getData38() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_32");
	}
	@DataProvider(name = "SMRP_33")
	public Object[][] getData39() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_33");
	}
	@DataProvider(name = "SMRP_34")
	public Object[][] getData40() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_34");
	}
	@DataProvider(name = "SMQP_35")
	public Object[][] getData41() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_35");
	}
	@DataProvider(name = "SMQP_36")
	public Object[][] getData42() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_36");
	}
	@DataProvider(name = "SMQP_37")
	public Object[][] getData43() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_37");
	}
	@DataProvider(name = "SMQP_38")
	public Object[][] getData44() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_38");
	}
	@DataProvider(name = "SMQP_39")
	public Object[][] getData45() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_39");
	}
	@DataProvider(name = "SMQP_40")
	public Object[][] getData46() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_40");
	}
	@DataProvider(name = "SMQP_41")
	public Object[][] getData47() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_41");
	}
	@DataProvider(name = "SMQP_42")
	public Object[][] getData48() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_42");
	}
	@DataProvider(name = "SMQP_43")
	public Object[][] getData49() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_43");
	}
	@DataProvider(name = "SMQP_44")
	public Object[][] getData50() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_44");
	}
	@DataProvider(name = "SMQP_45")
	public Object[][] getData51() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_45");
	}
	@DataProvider(name = "SMQP_46")
	public Object[][] getData52() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_46");
	}
	@DataProvider(name = "SMQP_47")
	public Object[][] getData53() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_53");
	}
	@DataProvider(name = "SMQP_48")
	public Object[][] getData54() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_54");
	}
	@DataProvider(name = "SMQP_49")
	public Object[][] getData55() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_49");
	}
	@DataProvider(name = "SMQP_50")
	public Object[][] getData56() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_50");
	}
	@DataProvider(name = "SMRP_51")
	public Object[][] getData57() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_51");
	}
	@DataProvider(name = "SMRP_52")
	public Object[][] getData58() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_52");
	}
	@DataProvider(name = "SMRP_53")
	public Object[][] getData59() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_53");
	}
	@DataProvider(name = "SMQP_54")
	public Object[][] getData60() {
		return DataInputProvider.getSheet("Sendmoney","SMQP_54");
	}
	@DataProvider(name = "SMQP_55")
	public Object[][] getData61() {
		return DataInputProvider.getSheet("Sendmoney","SMQP_55");
	}
	@DataProvider(name = "SMQP_56")
	public Object[][] getData62() {
		return DataInputProvider.getSheet("Sendmoney","SMQP_56");
	}
	@DataProvider(name = "SMSP_57")
	public Object[][] getData63() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_57");
	}
	@DataProvider(name = "SMSP_58")
	public Object[][] getData64() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_58");
	}
	@DataProvider(name = "SMQP_59")
	public Object[][] getData65() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_59");
	}
	@DataProvider(name = "SMRP_60")
	public Object[][] getData66() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_60");
	}
	@DataProvider(name = "SMRP_61")
	public Object[][] getData67() {
		return DataInputProvider.getSheet("Sendmoney","SMRP_61");
	}
	@DataProvider(name = "SMRP_62")
	public Object[][] getData68() {
		return DataInputProvider.getSheet("Sendmoney","SMRP_62");
	}
	@DataProvider(name = "SMRP_63")
	public Object[][] getData69() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_63");
	}
	@DataProvider(name = "SMRP_64")
	public Object[][] getData70() {
		return DataInputProvider.getSheet("Sendmoney","SMRP_64");
	}
	@DataProvider(name = "SMRP_65")
	public Object[][] getData71() {
		return DataInputProvider.getSheet("Sendmoney","SMRP_65");
	}
	@DataProvider(name = "SMRP_66")
	public Object[][] getData72() {
		return DataInputProvider.getSheet("Sendmoney","SMRP_66");
	}
	@DataProvider(name = "SMRP_67")
	public Object[][] getData73() {
		return DataInputProvider.getSheet("Sendmoney","SMSP_67");
	}
}
