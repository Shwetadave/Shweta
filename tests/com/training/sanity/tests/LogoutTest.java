package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.logout.Logout;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LogoutTest {

	private WebDriver driver;
	private String baseUrl;
	private String userName;
	private String password;
	private Logout logout;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		logout = new Logout(driver); 
		baseUrl = properties.getProperty("baseURL");
		userName = properties.getProperty("userName");
		password = properties.getProperty("password");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		logout.sendUserName(userName);
		logout.sendPassword(password);
		logout.clickLoginBtn(); 
		logout.loginImageClick();
		logout.logoutClick();
		screenShot.captureScreenShot("ELTC_015");
	
		
	}
}
