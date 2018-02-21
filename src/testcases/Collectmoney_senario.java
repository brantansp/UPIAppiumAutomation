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

public class Collectmoney_senario extends GenericWrappers {
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
	 * Collect money using Registered Payee
	 *  Scenario 1
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "CMRP_1" , enabled = true)
	public void CMRP_1(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMRP_1";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
		
	/**
	 * Collect money using Registered Payee
	 *  Scenario 2
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test(dataProvider = "CMRP_2" , enabled = true)
	public void CMRP_2(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws InterruptedException, IOException  {
		testCaseName 	= "CMRP_2";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		 // .SwitchApplication()
		 .launchPNBApp()
		 .EnterPasswordById(password)
		 .ClickLoginButtonByXpathForSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	
	/**
	 * Collect money using Registered Payee
	 *  Scenario 3
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "CMRP_3" , enabled = true)
	public void CMRP_3(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMRP_3";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Quick Payment
	 *  Scenario 5
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "CMQP_5" , enabled = true)
	public void CMQP_5(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMQP_5";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Quick Payment
	 *  Scenario 6
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "CMQP_6" , enabled = true)
	public void CMQP_6(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMQP_6";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Quick Payment
	 *  Scenario 2
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test(dataProvider = "CMQP_7" , enabled = true)
	public void CMQP_7(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws InterruptedException, IOException  {
		testCaseName 	= "CMQP_7";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		 // .SwitchApplication()
		 .launchPNBApp()
		 .EnterPasswordById(password)
		 .ClickLoginButtonByXpathForSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	
	/**
	 * Collect money using Split Payment
	 *  Scenario 9
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "CMSP_9" , enabled = true)
	public void CMSP_9(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMSP_9";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Split Payment
	 *  Scenario 10
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "CMSP_10" , enabled = true)
	public void CMSP_10(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMsP_10";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Split Payment
	 *  Scenario 11
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test(dataProvider = "CMSP_11" , enabled = true)
	public void CMSP_11(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws InterruptedException, IOException  {
		testCaseName 	= "CMSP_11";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		 // .SwitchApplication()
		 .launchPNBApp()
		 .EnterPasswordById(password)
		 .ClickLoginButtonByXpathForSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Registered Payee
	 *  Scenario 11
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "CMRP_11" , enabled = true)
	public void CMRP_11(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMRP_11";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Registered Payee
	 *  Scenario 12
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "CMRP_12" , enabled = true)
	public void CMRP_12(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMRP_12";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Registered Payee
	 *  Scenario 13
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "CMRP_13" , enabled = true)
	public void CMRP_13(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMRP_13";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Registered Payee
	 *  Scenario 14
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "CMRP_14" , enabled = true)
	public void CMRP_14(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMRP_14";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Registered Payee
	 *  Scenario 15
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test(dataProvider = "CMRP_15" , enabled = true)
	public void CMRP_15(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws InterruptedException, IOException  {
		testCaseName 	= "CMRP_15";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		 // .SwitchApplication()
		 .launchPNBApp()
		 .EnterPasswordById(password)
		 .ClickLoginButtonByXpathForSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Registered Payee
	 *  Scenario 16
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test(dataProvider = "CMRP_16" , enabled = true)
	public void CMRP_16(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws InterruptedException, IOException  {
		testCaseName 	= "CMRP_16";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		 // .SwitchApplication()
		 .launchPNBApp()
		 .EnterPasswordById(password)
		 .ClickLoginButtonByXpathForSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Registered Payee
	 *  Scenario 17
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test(dataProvider = "CMRP_17" , enabled = true)
	public void CMRP_17(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws InterruptedException, IOException  {
		testCaseName 	= "CMRP_17";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		 // .SwitchApplication()
		 .launchPNBApp()
		 .EnterPasswordById(password)
		 .ClickLoginButtonByXpathForSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Registered Payee
	 *  Scenario 18
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test(dataProvider = "CMRP_18" , enabled = true)
	public void CMRP_18(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws InterruptedException, IOException  {
		testCaseName 	= "CMRP_18";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		 // .SwitchApplication()
		 .launchPNBApp()
		 .EnterPasswordById(password)
		 .ClickLoginButtonByXpathForSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Quick Payee
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
	@Test(dataProvider = "CMRP_19" , enabled = true)
	public void CMRP_19(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMRP_11";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Quick Payee
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
	@Test(dataProvider = "CMQP_20" , enabled = true)
	public void CMQP_20(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMRP_12";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Quick Payement
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
	@Test(dataProvider = "CMQP_21" , enabled = true)
	public void CMQP_21(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMQP_21";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Quick Payement
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
	@Test(dataProvider = "CMQP_22" , enabled = true)
	public void CMQP_22(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMQP_22";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Quick Payement
	 *  Scenario 23
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test(dataProvider = "CMQP_23" , enabled = true)
	public void CMQP_23(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws InterruptedException, IOException  {
		testCaseName 	= "CMQP_23";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		 // .SwitchApplication()
		 .launchPNBApp()
		 .EnterPasswordById(password)
		 .ClickLoginButtonByXpathForSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Quick Payement
	 *  Scenario 24
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test(dataProvider = "CMQP_24" , enabled = true)
	public void CMQP_24(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws InterruptedException, IOException  {
		testCaseName 	= "CMQP_24";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		 // .SwitchApplication()
		 .launchPNBApp()
		 .EnterPasswordById(password)
		 .ClickLoginButtonByXpathForSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Quick Payment
	 *  Scenario 25
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test(dataProvider = "CMQP_25" , enabled = true)
	public void CMQP_25(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws InterruptedException, IOException  {
		testCaseName 	= "CMQP_25";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		 // .SwitchApplication()
		 .launchPNBApp()
		 .EnterPasswordById(password)
		 .ClickLoginButtonByXpathForSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	/**
	 * Collect money using Quick Payment
	 *  Scenario 26
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test(dataProvider = "CMQP_26" , enabled = true)
	public void CMQP_26(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws InterruptedException, IOException  {
		testCaseName 	= "CMQP_26";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		 // .SwitchApplication()
		 .launchPNBApp()
		 .EnterPasswordById(password)
		 .ClickLoginButtonByXpathForSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	
	/**
	 * Collect money using Registered Payee
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
	@Test(dataProvider = "CMRP_51" , enabled = true)
	public void CMRP_51(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMRP_51";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}/**
	 * Collect money using Registered Payee
	 *  Scenario 52
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "CMRP_52" , enabled = true)
	public void CMRP_52(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMRP_52";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}/**
	 * Collect money using Registered Payee
	 *  Scenario 53
	 * @param password
	 * @param Bankname
	 * @param Vaddr
	 * @param Amount
	 * @param pin
	 * @param verifytext
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test(dataProvider = "CMRP_53" , enabled = true)
	public void CMRP_53(String password, String Bankname,String Vaddr,String Amount, String remarks, String verifytext, String pin) throws MalformedURLException, InterruptedException  {
		testCaseName 	= "CMRP_53";
		System.out.println(testCaseName);
		Reporter.startTestCase(testCaseName,testDescription); 
		 new UBILoginPage()
		  .getBatteryInfo()
		  .launchUBIApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickCollectByXpath()
		  .SelectTransferToAccount(Bankname)
		  .EnterVirtualAddress(Vaddr)
		  .EnterAmount(Amount)
		  .EnterRemarks(remarks)
		  .ClickSubmit()
		  .clickconfirm()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  .ClickPendingApprovalByID()
		  .SelectTransaction(Amount)
		  .clickApprove()
		  .ClickYes()
		  .enterCollectMpin(pin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	}
	
	
	@DataProvider(name = "CMRP_1")
	public Object[][] getData1() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_1");
	}
	
	@DataProvider(name = "CMRP_2")
	public Object[][] getData2() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_2");
	}
	
	@DataProvider(name = "CMRP_3")
	public Object[][] getData3() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_3");
	}
	
	@DataProvider(name = "CMRP_4")
	public Object[][] getData4() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_4");
	}
	
	@DataProvider(name = "CMQP_5")
	public Object[][] getData5() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_5");
	}
	
	@DataProvider(name = "CMQP_6")
	public Object[][] getData6() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_6");
	}
	
	@DataProvider(name = "CMQP_7")
	public Object[][] getData7() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_7");
	}
	
	@DataProvider(name = "CMQP_8")
	public Object[][] getData8() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_8");
	}
	
	@DataProvider(name = "CMSP_9")
	public Object[][] getData9() {
		return DataInputProvider.getSheet("Collectmoney","CMSP_9");
	}
	
	@DataProvider(name = "CMSP_10")
	public Object[][] getData10() {
		return DataInputProvider.getSheet("Collectmoney","CMSP_10");
	}
	
	@DataProvider(name = "CMSP_11")
	public Object[][] getData11() {
		return DataInputProvider.getSheet("Collectmoney","CMSP_11");
	}
	
	@DataProvider(name = "CMSP_12")
	public Object[][] getData12() {
		return DataInputProvider.getSheet("Collectmoney","CMSP_12");
	}
	
	@DataProvider(name = "CMRP_11")
	public Object[][] getData111() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_11");
	}
	
	@DataProvider(name = "CMRP_12")
	public Object[][] getData112() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_12");
	}
	
	@DataProvider(name = "CMRP_13")
	public Object[][] getData13() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_13");
	}
	
	@DataProvider(name = "CMRP_14")
	public Object[][] getData14() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_14");
	}
	
	@DataProvider(name = "CMRP_15")
	public Object[][] getData15() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_15");
	}
	
	@DataProvider(name = "CMRP_16")
	public Object[][] getData16() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_16");
	}
	
	@DataProvider(name = "CMRP_17")
	public Object[][] getData17() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_17");
	}
	
	@DataProvider(name = "CMRP_18")
	public Object[][] getData18() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_18");
	}
	
	@DataProvider(name = "CMQP_19")
	public Object[][] getData19() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_19");
	}
	
	@DataProvider(name = "CMQP_20")
	public Object[][] getData20() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_20");
	}
	
	@DataProvider(name = "CMQP_21")
	public Object[][] getData21() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_21");
	}
	
	@DataProvider(name = "CMQP_22")
	public Object[][] getData22() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_22");
	}
	
	@DataProvider(name = "CMQP_23")
	public Object[][] getData23() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_23");
	}
	
	@DataProvider(name = "CMQP_24")
	public Object[][] getData24() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_24");
	}
	
	@DataProvider(name = "CMQP_25")
	public Object[][] getData25() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_25");
	}
	
	@DataProvider(name = "CMQP_26")
	public Object[][] getData26() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_26");
	}
	@DataProvider(name = "CMRP_51")
	public Object[][] getData51() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_51");
	}
	
	@DataProvider(name = "CMRP_52")
	public Object[][] getData52() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_52");
	}
	
	@DataProvider(name = "CMRP_53")
	public Object[][] getData53() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_53");
	}
	
	@DataProvider(name = "CMQP_54")
	public Object[][] getData54() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_54");
	}
	
	@DataProvider(name = "CMQP_55")
	public Object[][] getData55() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_55");
	}
	
	@DataProvider(name = "CMRP_56")
	public Object[][] getData56() {
		return DataInputProvider.getSheet("Collectmoney","CMQP_56");
	}
	
	@DataProvider(name = "CMsP_57")
	public Object[][] getData57() {
		return DataInputProvider.getSheet("Collectmoney","CMSP_57");
	}
	
	@DataProvider(name = "CMSP_58")
	public Object[][] getData58() {
		return DataInputProvider.getSheet("Collectmoney","CMSP_58");
	}
	
	@DataProvider(name = "CMSP_59")
	public Object[][] getData59() {
		return DataInputProvider.getSheet("Collectmoney","CMSP_59");
	}
	@DataProvider(name = "CMRP_60")
	public Object[][] getData60() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_60");
	}
	
	@DataProvider(name = "CMRP_62")
	public Object[][] getData61() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_61");
	}
	
	@DataProvider(name = "CMRP_63")
	public Object[][] getData63() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_63");
	}
	
	@DataProvider(name = "CMRP_64")
	public Object[][] getData64() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_64");
	}
	
	@DataProvider(name = "CMRP_65")
	public Object[][] getData65() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_65");
	}
	
	@DataProvider(name = "CMRP_66")
	public Object[][] getData66() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_66");
	}
	
	@DataProvider(name = "CMRP_67")
	public Object[][] getData67() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_67");
	}
	
	@DataProvider(name = "CMRP_68")
	public Object[][] getData68() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_68");
	}
	@DataProvider(name = "CMRP_69")
	public Object[][] getData69() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_69");
	}
	
	@DataProvider(name = "CMRP_70")
	public Object[][] getData70() {
		return DataInputProvider.getSheet("Collectmoney","CMRP_70");
	}
}
