package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class TestDemo extends BaseTest {

	@Test
	public void openApp() {
		MobileElement appYoutube = driver.findElement(
				By.xpath("//android.widget.FrameLayout[@content-desc=\"YouTube\"]/android.widget.ImageView"));
		basePage.click(appYoutube);
	}

	@Test
	public void search() throws InterruptedException {
		MobileElement searchBottom = driver
				.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Buscar\"]"));
		basePage.click(searchBottom);

		MobileElement boxText = driver.findElement(By.id("com.google.android.youtube:id/search_edit_text"));
		basePage.sendText(boxText, "mobile automation");
	}
}