package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import tests.BaseTest;

public class BasePage extends BaseTest {

	public void waitElement(MobileElement e) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	public void click(MobileElement e) {
		waitElement(e);
		e.click();
	}

	public void sendText(MobileElement e, String t) {
		waitElement(e);
		e.sendKeys(t);
	}
}