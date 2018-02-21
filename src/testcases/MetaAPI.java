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

public class MetaAPI extends GenericWrappers {
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
	
	@Test(dataProvider = "MT_6" , enabled = true)
    //Request for an OTP
	public void MT_6(String devname,String packagename,String Activity,String password,String bankname,String oldpin,String newpin,String confirmpin,String cardnumber,String month,String year,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "MT_6";
		 System.out.println(testCaseName);
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickSetPINByID()
		  .SelectTransaction(bankname)
		  .enterOTP()
		  .enterSetPIN(newpin)
		  .enterSetPINConfirm(confirmpin)
		  .enterDebitcardnumber(cardnumber)
		  .enterexpirydate(month, year)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	  }
	
	@Test(dataProvider = "MT_7" , enabled = true)
    //Incorrect OTP
	public void MT_7(String devname,String packagename,String Activity,String password,String bankname,String oldpin,String newpin,String confirmpin,String cardnumber,String month,String year,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "MT_7";
		 System.out.println(testCaseName);
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickSetPINByID()
		  .SelectTransaction(bankname)
		  .enterOTP()
		  .enterSetPIN(newpin)
		  .enterSetPINConfirm(confirmpin)
		  .enterDebitcardnumber(cardnumber)
		  .enterexpirydate(month, year)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	  }
	@Test(dataProvider = "MT_8" , enabled = true)
	    //OTP Time Expired
		public void MT_8(String devname,String packagename,String Activity,String password,String bankname,String oldpin,String newpin,String confirmpin,String cardnumber,String month,String year,String verifytext) throws MalformedURLException, InterruptedException {
			 testCaseName 	= "MT_8";
			 System.out.println(testCaseName);
				Reporter.startTestCase(testCaseName,testDescription); 
			 new PNBLoginPage()
			 .getBatteryInfo()
			  .launchAndroidApp()
			  .EnterPasswordByXpath(password)
			  .ClickLoginButtonByXpathForSuccess()
			  .ClickSetPINByID()
			  .SelectTransaction(bankname)
			  .enterOTP()
			  .enterSetPIN(newpin)
			  .enterSetPINConfirm(confirmpin)
			  .enterDebitcardnumber(cardnumber)
			  .enterexpirydate(month, year)
			  .ClickSubmit()
			  .verifyalerttext(verifytext)
			  .ClickAlertOkforSuccess()
			  ;
		  }
	  @Test(dataProvider = "MT_9" , enabled = true)
		    //OTP Transactoin limit exceeded
			public void MT_9(String devname,String packagename,String Activity,String password,String bankname,String oldpin,String newpin,String confirmpin,String cardnumber,String month,String year,String verifytext) throws MalformedURLException, InterruptedException {
				 testCaseName 	= "MT_9";
				 System.out.println(testCaseName);
					Reporter.startTestCase(testCaseName,testDescription); 
				 new PNBLoginPage()
				 .getBatteryInfo()
				  .launchAndroidApp()
				  .EnterPasswordByXpath(password)
				  .ClickLoginButtonByXpathForSuccess()
				  .ClickSetPINByID()
				  .SelectTransaction(bankname)
				  .enterOTP()
				  .enterSetPIN(newpin)
				  .enterSetPINConfirm(confirmpin)
				  .enterDebitcardnumber(cardnumber)
				  .enterexpirydate(month, year)
				  .ClickSubmit()
				  .verifyalerttext(verifytext)
				  .ClickAlertOkforSuccess()
				  ;
				  ;
			  }
	  @Test(dataProvider = "MT_10" , enabled = true)
	    //OTP Transactoin limit exceeded
		public void MT_10(String devname,String packagename,String Activity,String password,String bankname) throws MalformedURLException, InterruptedException {
			 testCaseName 	= "MT_10";
			 System.out.println(testCaseName);
				Reporter.startTestCase(testCaseName,testDescription); 
			 new PNBLoginPage()
			 .getBatteryInfo()
			  .launchAndroidApp()
			  .EnterPasswordByXpath(password)
			  .ClickLoginButtonByXpathForSuccess()
			  .ClickAddBankByXpath()
			  .EnterBankName(bankname)
			  .Selectbanknamefromlist()
			  ;
		  }
	
	  
	  
	@Test(dataProvider = "MT_19" , enabled = true)
    //Changing MPIN
	public void MT_19(String devname,String packagename,String Activity,String password,String bankname,String oldpin,String newpin,String confirmpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "MT_19";
		 System.out.println(testCaseName);
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickChangePINByID()
		  .SelectTransaction(bankname)
		  .Enteroldpin(oldpin)
		  .EnterNewpin(newpin)
		  .EnterConfirmNewPin(confirmpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	  }
	
	@Test(dataProvider = "MT_20" , enabled = true)
    //Invalid MPIN. Response code - ZM
	public void MT_20(String devname,String packagename,String Activity,String password,String bankname,String oldpin,String newpin,String confirmpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "MT_20";
		 System.out.println(testCaseName);
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickChangePINByID()
		  .SelectTransaction(bankname)
		  .Enteroldpin(oldpin)
		  .EnterNewpin(newpin)
		  .EnterConfirmNewPin(confirmpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	  }
	
	@Test(dataProvider = "MT_21" , enabled = true)
    //Invalid MPIN. Response code - ZM
	public void MT_21(String devname,String packagename,String Activity,String password,String bankname,String oldpin,String newpin,String confirmpin,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "MT_21";
		 System.out.println(testCaseName);
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickChangePINByID()
		  .SelectTransaction(bankname)
		  .Enteroldpin(oldpin)
		  .EnterNewpin(newpin)
		  .EnterConfirmNewPin(confirmpin)
		  .ClickSubmit()
		  .verifyalerttext(verifytext)
		  .ClickAlertOkforSuccess()
		  ;
	  }
	
	@Test(dataProvider = "MT_22" , enabled = true)
    //Add Beneficiary VPA
	public void MT_22(String devname,String packagename,String Activity,String password,String Bankname,String vpa,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "MT_22";
		 System.out.println(testCaseName);
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPendingApprovalByID()
		  ;
	  }
	
	
	@Test(dataProvider = "MT_23" , enabled = true)
    //Add Beneficiary VPA
	public void MT_23(String devname,String packagename,String Activity,String password) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "MT_23";
		 System.out.println(testCaseName);
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickPendingApprovalByID()
		  ;
			 
	  }
	
	@Test(dataProvider = "MT_24" , enabled = true)
    //Add Beneficiary VPA
	public void MT_24(String devname,String packagename,String Activity,String password,String Bankname,String vpa,String verifytext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "MT_24";
		 System.out.println(testCaseName);
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickAddVirtualAddressByXpath()
		  .SelectAccount(Bankname)
		  .enterVirtualAddress(vpa)	
		  .ClickSubmit()
		  .VerifyAlertText(verifytext)
		  .ClickLoginButtonByXpathForSuccess()
		  ;
	  }
	
	
	@Test(dataProvider = "MT_26" , enabled = true)
    //Balance Enquiry
	public void MT_26(String devname,String packagename,String Activity,String password,String Bankname,String mpin) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "MT_26";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickViewBalanceByXpath()
		  .SelectAccountByXpath(Bankname)	
		  .getreferenceIdOnBalancePageByXpath()
		  .enterMpinonBalance(mpin)
		  .ClickSubmit()
		  .Getalerttext()
		  .ClickAlertOkforSuccess();
		 }
	
	@Test(dataProvider = "MT_27" , enabled = true)
    //Balance Enquiry with Invalid MPIN
	public void MT_27(String devname,String packagename,String Activity,String password,String Bankname,String mpin,String alerttext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "MT_27";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickViewBalanceByXpath()
		  .SelectAccountByXpath(Bankname)	
		  .getreferenceIdOnBalancePageByXpath()
		  .enterMpinonBalance(mpin)
		  .ClickSubmit()
		  .verifyalerttext(alerttext)
		  .Getalerttext()
		  .ClickAlertOkforSuccess();
		 }
	@Test(dataProvider = "MT_28" , enabled = true)
    //Balance Enquiry with no. of PIN tries Exceeded
	public void MT_28(String devname,String packagename,String Activity,String password,String Bankname,String mpin,String alerttext) throws MalformedURLException, InterruptedException {
		 testCaseName 	= "MT_28";
			Reporter.startTestCase(testCaseName,testDescription); 
		 new PNBLoginPage()
		  .getBatteryInfo()
		  .launchAndroidApp()
		  .EnterPasswordByXpath(password)
		  .ClickLoginButtonByXpathForSuccess()
		  .ClickViewBalanceByXpath()
		  .SelectAccountByXpath(Bankname)	
		  .getreferenceIdOnBalancePageByXpath()
		  .enterMpinonBalance(mpin)
		  .ClickSubmit()
		  .verifyalerttext(alerttext)
		  .Getalerttext()
		  .ClickAlertOkforSuccess();
		 }
	
	@DataProvider(name = "MT_10")
	public Object[][] getData13() {
		return DataInputProvider.getSheet("UPI_MetaAPI","MT_10");
	}
	@DataProvider(name = "MT_6")
	public Object[][] getData12() {
		return DataInputProvider.getSheet("UPI_MetaAPI","MT_6");
	}
	@DataProvider(name = "MT_7")
	public Object[][] getData11() {
		return DataInputProvider.getSheet("UPI_MetaAPI","MT_7");
	}
	@DataProvider(name = "MT_8")
	public Object[][] getData10() {
		return DataInputProvider.getSheet("UPI_MetaAPI","MT_8");
	}
	@DataProvider(name = "MT_9")
	public Object[][] getData9() {
		return DataInputProvider.getSheet("UPI_MetaAPI","MT_9");
	}
	@DataProvider(name = "MT_19")
	public Object[][] getData8() {
		return DataInputProvider.getSheet("UPI_MetaAPI","MT_19");
	}
	@DataProvider(name = "MT_20")
	public Object[][] getData7() {
		return DataInputProvider.getSheet("UPI_MetaAPI","MT_20");
	}
	@DataProvider(name = "MT_21")
	public Object[][] getData6() {
		return DataInputProvider.getSheet("UPI_MetaAPI","MT_21");
	}
	@DataProvider(name = "MT_23")
	public Object[][] getData5() {
		return DataInputProvider.getSheet("UPI_MetaAPI","MT_23");
	}
	@DataProvider(name = "MT_24")
	public Object[][] getData4() {
		return DataInputProvider.getSheet("UPI_MetaAPI","MT_24");
	}
	@DataProvider(name = "MT_26")
	public Object[][] getData1() {
		return DataInputProvider.getSheet("UPI_MetaAPI","MT_26");
	}
	@DataProvider(name = "MT_27")
	public Object[][] getData2() {
		return DataInputProvider.getSheet("UPI_MetaAPI","MT_27");
	}
	@DataProvider(name = "MT_28")
	public Object[][] getData3() {
		return DataInputProvider.getSheet("UPI_MetaAPI","MT_28");
	}	
	
}
