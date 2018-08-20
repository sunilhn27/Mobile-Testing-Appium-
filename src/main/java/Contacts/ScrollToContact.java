package Contacts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScrollToContact {

	AndroidDriver<MobileElement> d;

	@BeforeTest
	public void initilize() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "nexus 5");
		caps.setCapability("udid", "169.254.19.102:5555"); // Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability("platformVersion", "5.1.0");
		caps.setCapability("appPackage", "com.android.dialer"); // com.hmh.api
		caps.setCapability("appActivity", "com.android.dialer.DialtactsActivity"); // com.hmh.api.ApiDemos
		caps.setCapability("noReset", true);
		System.out.println("ohoon");
		d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		d.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		System.out.println("SUccess");

	}

	@Test
	public void scrollandDelete() {
		d.findElement(By.xpath("//*[contains(@text,'Contacts')]")).click();
		MobileElement grouplink = (MobileElement) d.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Zumali\"))"));
		grouplink.click();
		d.findElement(By.xpath("//*[@content-desc='More options']")).click();
		d.findElement(By.xpath("//*[contains(@text,'Delete')]")).click();
		d.findElement(By.xpath("//*[contains(@text,'Cancel')]")).click();
		System.out.println("Success");
		
		

	}
}
