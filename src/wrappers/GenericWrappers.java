package wrappers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class GenericWrappers {
	protected static AndroidDriver<WebElement> driver;
	protected static Properties prop;

	public GenericWrappers() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("./config.properties")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadObjects() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream(new File("./object.properties")));

	}

	public boolean launchApp(String appPackage, String appActivity, String deviceName) {
		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("appPackage", appPackage);
			dc.setCapability("appActivity", appActivity);
			dc.setCapability("deviceName", deviceName);
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean launchActivity(String appPackage, String appActivity) {
		try {
			driver.startActivity(appPackage, appActivity);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean launchBrowser(String browserName, String deviceName, String URL) {
		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("browserName", browserName);
			dc.setCapability("deviceName", deviceName);
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public void verifyAndInstallApp(String appPackage, String appPath) {
		if (!driver.isAppInstalled(appPackage)) {
			driver.installApp(appPath);
		} else {
			driver.removeApp(appPackage);
			driver.installApp(appPath);
		}
	}

	public void sleep(int mSec) {
		try {
			Thread.sleep(mSec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void printContext() {
		try {
			Set<String> contexts = driver.getContextHandles();
			for (String string : contexts) {
				System.out.println(string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getcontext()
	{
		System.out.println(driver.getContextHandles());
	}
	
	public boolean switchContext(String Context) {
		try {
			driver.context(Context);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean clickByID(String ID) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(ID)));
			driver.findElementById(ID).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean clickByAccessebilityID(String ID) {
		try {
			/*
			 * WebDriverWait wait = new WebDriverWait(driver, 30);
			 * wait.until(ExpectedConditions
			 * .presenceOfElementLocated(ByAccessibilityId(ID));
			 */
			driver.findElementByAccessibilityId(ID).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean clickByXpath(String Xpath) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
			if (driver.findElementByXPath(Xpath).isDisplayed()) {
				driver.findElementByXPath(Xpath).click();
				// System.out.println("Xpath is clicked");
			} else
				System.out.println("Xpath not displayed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean clickByXpathwithTextmatch(String Xpath, String txt) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
			if (driver.findElementByXPath(Xpath).isDisplayed()) {
				driver.findElementByXPath(Xpath).click();
				// System.out.println("Xpath is clicked");
			} else
				System.out.println("Xpath not displayed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	
	public String getTextByXpath(String Xpath) {
		String text = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
			if (driver.findElementByXPath(Xpath).isDisplayed())
			{
				text = driver.findElementByXPath(Xpath).getText();
			} else
				System.out.println("Xpath not displayed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public String getTextById(String id) {
		String text = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(id)));
			text = driver.findElementById(id).getText();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}

	public boolean verifyContentDescIsDisplayed(String Xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
		if (driver.findElementByXPath(Xpath).isDisplayed())
			return true;
		else
			return false;
	}

	public boolean clickByLinkText(String LinkText) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(LinkText)));
			driver.findElementByLinkText(LinkText).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean enterTextByID(String ID, String value) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(ID)));
			driver.findElementById(ID).clear();
			driver.findElementById(ID).sendKeys(value);
			showhidekeyboard();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean pressEnter() {
		driver.pressKeyCode(66);
		return true;
	}

	public boolean enterTextByXpath(String Xpath, String value) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
			driver.findElementByXPath(Xpath).clear();
			driver.findElementByXPath(Xpath).sendKeys(value);
			showhidekeyboard();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean takeScreenShot(String FileName) {
		try {
			File srcFiler = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFiler, new File(FileName));
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean verifyTextByID(String ID, String Expected) {
		boolean val = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(ID)));
			String name = driver.findElementById(ID).getText();
			System.out.println(name);
			if (name.contains(Expected)) {
				val = true;
			} else
				val = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}

	public boolean verifyTextByXpath(String Xpath, String Expected) {
		boolean val = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
			String name = driver.findElementByXPath(Xpath).getText();
			if (name.contains(Expected)) {
				val = true;
			} else
				val = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}

	public boolean IsEnabledByID(String Id) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Id)));
			if (driver.findElementById(Id).isDisplayed()) {
				return true;
			} else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean scrollDownInBrowser(int val) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0," + val + "\")", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean backButton() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean scrollToInApp(String text) {
		try {
			driver.scrollTo(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean scrollUsingDesc(String text) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@content-desc,'" + text + "')]")));
			Dimension size = driver.manage().window().getSize();
			int x0 = (int) (size.getWidth() * 0.2);
			int y0 = (int) (size.getHeight() * 0.2);
			Point xy = driver.findElementByXPath("//android.view.View[contains(@content-desc,'" + text + "')]")
					.getLocation();
			int x1 = (int) (xy.getX());
			int y1 = (int) (xy.getY());
			TouchAction touch = new TouchAction(driver);
			touch.press(x1, y1).waitAction(2000).moveTo(x0, y0).release().perform();
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean scrollUpinApp() {
		try {
			Dimension size = driver.manage().window().getSize();
			int x0 = (int) (size.getWidth() * 0.2);
			int y0 = (int) (size.getHeight() * 0.2);
			int x1 = (int) (size.getWidth() * 0.8);
			int y1 = (int) (size.getHeight() * 0.8);
			TouchAction touch = new TouchAction(driver);
			touch.press(x1, y1).waitAction(2000).moveTo(x0, y0).release().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean scrollHalfinApp() {
		try {
			Dimension size = driver.manage().window().getSize();
			int x0 = (int) (size.getWidth() * 0.2);
			int y0 = (int) (size.getHeight() * 0.2);
			int x1 = (int) (size.getWidth() * 0.5);
			int y1 = (int) (size.getHeight() * 0.5);
			TouchAction touch = new TouchAction(driver);
			touch.press(x1, y1).waitAction(2000).moveTo(x0, y0).release().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean clickInApp() {
		try {
			Dimension size = driver.manage().window().getSize();
			int x0 = (int) (size.getWidth() * 0.2);
			int y0 = (int) (size.getHeight() * 0.2);
			TouchAction touch = new TouchAction(driver);
			touch.press(x0, y0).release().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean pinchInApp(int x,int y) {
		try {
			Dimension size = driver.manage().window().getSize();
			int x0 = (int) (size.getWidth() * 0.5);
			int y0 = (int) (size.getHeight() * 0.5);
			driver.pinch(x, y);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean zoomInApp() {
		try {
			Dimension size = driver.manage().window().getSize();
			int x0 = (int) (size.getWidth() * 0.5);
			int y0 = (int) (size.getHeight() * 0.5);
			System.out.println(x0 + " " + y0);
			driver.zoom(100, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean zoomUsingElement(String Xpath) {
		try {
			driver.zoom(driver.findElementByXPath(Xpath));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean pinchUsingElement(String Xpath) {
		driver.pinch(driver.findElementByXPath(Xpath));
		return true;
	}

	public boolean pullFile(String devicePath, String remotePath) {
		byte[] b = driver.pullFile(devicePath);
		driver.pushFile(remotePath, b);
		return true;
	}

	public boolean hideKeyboard() {
		try {
			driver.hideKeyboard();
		} catch (Exception e) {

		}
		return true;
	}

	
	
	public boolean network() {
		try {
			// WebDriverWait wait = new WebDriverWait(driver, 30);
			// wait.until(ExpectedConditions.presenceOfElementLocated(By.id(ID)));
			driver.getNetworkConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public String batteryinfo() throws IOException
	{
		String level = null;
		level=adbcommand("adb shell dumpsys battery");
		level = level.substring(level.indexOf("level:")+7,level.indexOf("level:")+9);
	//System.out.println(level);
		return level;
	}
	
	public void showhidekeyboard() throws IOException
	{
		
			driver.hideKeyboard();
		
		
	}
	
	public String adbcommand(String command) throws IOException {
		StringBuilder processOutput = null;
		try {
			Process process = Runtime.getRuntime().exec(command);
			processOutput = new StringBuilder();
			try (BufferedReader processOutputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));) {
				String readLine;
				while ((readLine = processOutputReader.readLine()) != null) {
					processOutput.append(readLine + System.lineSeparator());
				}
			} catch (IOException e) {
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return processOutput.toString().trim();
	}

	public void datepicker(String date,String mon,String year)
	{
		
	List<WebElement> pick = driver.findElements(By.className("android.widget.EditText"));
	pick.get(0).click();
	pick.get(0).clear();
	pick.get(0).sendKeys(date);
	pick.get(1).click();
	pick.get(1).clear();
	pick.get(1).sendKeys(mon);
	//pick.get(2).sendKeys(year);
	}
	
	public void back()
	{
		driver.navigate().back();
	}
	
	public void TapinApp()
	{
		driver.tap(1,25, 310, 1);
	}
	
	
	public void TapinBankName()
	{	
		Point xy = driver.findElementById("com.fss.pnbpsp:id/autoCompleteTextView1")
				.getLocation();
		int x = (int) (xy.getX())+100;
		int y = (int) (xy.getY())+100;
		driver.tap(1, x, y, 1);
		
	}
	
	
	public void getxy()
	{
		Point xy = driver.findElementByXPath("//android.widget.EditText[@text='Search/Select your bank']")
				.getLocation();
		int x1 = (int) (xy.getX());
		int y1 = (int) (xy.getY());
		System.out.println("X is "+x1+",Y is "+y1);

	}
	
	//Write in Excel Sheet
	
	public boolean writeDataInExcel(String FileName, String sheet_name, String Data, String Data2) throws IOException {
		FileInputStream fis = new FileInputStream(new File(FileName));
		HSSFWorkbook workBook = new HSSFWorkbook(fis);

		// Create sheet
		HSSFSheet sheet = workBook.getSheet(sheet_name);

		int lastRowNumber = sheet.getLastRowNum();
		int columnCount = 0;
		HSSFRow row = null;
		// Create Row
		if (lastRowNumber <= 0) {
			row = sheet.createRow(lastRowNumber + 1);
		} else {
			row = sheet.getRow(lastRowNumber);
			columnCount = sheet.getRow(lastRowNumber).getLastCellNum();
		}
		// Create cell
		HSSFCell cell = row.createCell(columnCount);
		cell.setCellValue(Data);
		HSSFCell cell2 = row.createCell(columnCount+1);
		cell.setCellValue(Data2);
		FileOutputStream fos = new FileOutputStream(new File(FileName));
		workBook.write(fos);
		fos.close();
		workBook.close();
		return true;
	}
	
	//Write and Append data in excel sheet
		public boolean excelWriteAndAppend(String filename,String Data1,String Data2,String Result) throws IOException{
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
			String date = dateFormat.format(now);
			String refid=getTextByXpath(prop.getProperty("NPCI.ReferenceID.Xpath"));
			writeAppendDataInExcel(filename,date,Data1,refid,Result);
			//System.out.println(time);
			return true;
		}
		
		public boolean writeAppendDataInExcel(String FileName, String sheet_name, String Data1,String Data2,String Result) throws IOException {
			
			FileInputStream fis = new FileInputStream(new File(FileName));
			HSSFWorkbook workBook = new HSSFWorkbook(fis);
			int a=0,lastRowNumber;
			HSSFSheet sheet;
		
			 a=workBook.getSheetIndex(sheet_name);
			// Create sheet
			if ( a == -1){
				 sheet = workBook.createSheet(sheet_name);
				 lastRowNumber = sheet.getLastRowNum();
			}
	         else {
	        	  sheet = workBook.getSheet(sheet_name);
	        	  lastRowNumber = sheet.getLastRowNum()+1;
	         }
			
			CellStyle style = workBook.createCellStyle();
			Font font = workBook.createFont();
			style.setAlignment(style.ALIGN_CENTER);
			
			int columnCount = 0;
			HSSFRow row = null;
			// Create Row
			if (lastRowNumber <= 0) {
				row = sheet.createRow(lastRowNumber);
			} else {
				row = sheet.createRow(lastRowNumber);
				//columnCount = row.getLastCellNum();
			}
			// Create cell
			HSSFCell cell = row.createCell(columnCount);
			cell.setCellStyle(style);
			cell.setCellValue(Data1);
			HSSFCell cell2 = row.createCell(columnCount+1);
			//cell2.setCellStyle(style);
			cell2.setCellValue(Data2);
			HSSFCell cell3 = row.createCell(columnCount+2);
			CellStyle style1 = workBook.createCellStyle();
			if (Result.equals("PASS")){
				style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
				style1.setFillPattern(CellStyle.SOLID_FOREGROUND);
				style1.setAlignment(style.ALIGN_CENTER);
				font.setBold(true);
				//font.setFontName("Arial");
				style1.setFont(font);
				}
			else if (Result.equals("FAIL")){
				style1.setFillForegroundColor(IndexedColors.RED.getIndex());
				style1.setFillPattern(CellStyle.SOLID_FOREGROUND);
				style1.setAlignment(style.ALIGN_CENTER);
				font.setBold(true);
				style1.setFont(font);
				}
			cell3.setCellStyle(style1);
			cell3.setCellValue(Result);

			FileOutputStream fos = new FileOutputStream(new File(FileName));

			workBook.write(fos);

			fos.close();

			workBook.close();
			return true;
		}
		
		public String getrefId(String Xpath){
			String text = null;
			try {
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
				if (driver.findElementByXPath(Xpath).isDisplayed())
				{
					text = driver.findElementByXPath(Xpath).getText();
				} else
					System.out.println("Xpath not displayed");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}
		
		
		public boolean enterTextPressdownByXpath(String Xpath, String value) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
				driver.findElementByXPath(Xpath).clear();
				driver.findElementByXPath(Xpath).sendKeys(value);
				//Thread.sleep(3000);
				//driver.findElementByXPath("//android.widget.EditText[@text='"+value+"']").click();
				//driver.pressKeyCode(0);
				//driver.pressKeyCode(66);
				showhidekeyboard();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		
		
		
		
		
		public boolean NPCIKeyPad(String str) {
			try {
				
				for(int i=0;i<str.length();i++)
				{
				int val=Integer.parseInt(str.substring(i,i+1));
				//System.out.println(val+7);
				
				driver.pressKeyCode(val+7);
				}
				driver.findElementByXPath("(//android.widget.ImageView[@index='2'])[2]").click();
				//driver.pressKeyCode(160);
				//showhidekeyboard();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		
		public void clickdetails()
		{
			driver.findElementByXPath("(//android.widget.ImageView[@index='2'])").click();
		}
		
		
		/*public void pessdown()
		{
			driver.findElement(By.xpath("")).sendKeys("bankname",Keys.DOWN);
		}*/

	// Toast Message Handling

	// http://stackoverflow.com/questions/10659734/detecting-toast-messages

	/*
	 * public void onAccessibilityEvent(AccessibilityEvent event) { if
	 * (event.getEventType() !=
	 * AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED) return; // event is
	 * not a notification
	 * 
	 * String sourcePackageName = (String) event.getPackageName();
	 * 
	 * Parcelable parcelable = event.getParcelableData(); if (parcelable
	 * instanceof Notification) { // Statusbar Notification } else { //
	 * something else, e.g. a Toast message String log = "Message: " +
	 * event.getText().get(0) + " [Source: " + sourcePackageName + "]"; // write
	 * `log` to file... } }
	 */
}
