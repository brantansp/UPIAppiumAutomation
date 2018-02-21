package testcases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.AppiumWrappers;

public class paytm extends AppiumWrappers{

	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		//AndroidDriver<WebElement> driver;
		AppiumDriver<WebElement> driver;
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("appPackage", "com.fss.ubipsp");
		dc.setCapability("appActivity", "com.fss.controller.MainActivity");
		dc.setCapability("deviceName", "MRZPWWPJDQF6YPJF");		
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//int batteryPercentage = getBatteryPercentage()
		//driver.get
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.fss.ubipsp:id/editText_login_password")));
		driver.findElementById("com.fss.ubipsp:id/editText_login_password").click();
		driver.findElementById("com.fss.ubipsp:id/editText_login_password").sendKeys("123456\n");
		driver.hideKeyboard();
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.widget.Button[@index='0']")));
		driver.findElementByXPath("//android.widget.Button[@index='0']").click();
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.fss.ubipsp:id/drawermenu")));
		driver.findElementById("com.fss.ubipsp:id/drawermenu").click();

	}

	

}