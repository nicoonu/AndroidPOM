package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pages.BasePage;

public class BaseTest {

	protected static AppiumDriver<MobileElement> driver;
	public static BasePage basePage;

	@BeforeTest
	public void setUp() {

		try {
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "5203ac91fcde34ab");
			desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void initializePage() {
		basePage = new BasePage();
	}
}