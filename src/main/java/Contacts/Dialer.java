package Contacts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class Dialer {

	AndroidDriver<MobileElement> d;

	@BeforeTest
	public void initilize() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "nexus 5");
		caps.setCapability("udid", "169.254.80.102:5555"); // Give Device ID of your mobile phone
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
	public void add() {
		d.findElementById("com.android.dialer:id/floating_action_button").click();
		d.findElementById("com.android.dialer:id/nine").click();
		d.findElementById("com.android.dialer:id/nine").click();
		d.findElementById("com.android.dialer:id/two").click();
		d.findElementById("com.android.dialer:id/two").click();
		d.findElementById("com.android.dialer:id/nine").click();
		d.findElementById("com.android.dialer:id/six").click();
		d.findElementById("com.android.dialer:id/nine").click();
		d.findElementById("com.android.dialer:id/six").click();
		d.findElementById("com.android.dialer:id/two").click();
		d.findElementById("com.android.dialer:id/zero").click();
	}

	@Test
	public void navigate() {
		d.findElementById("com.android.dialer:id/cliv_name_textview").click();
		d.findElementById("com.android.contacts:id/cliv_name_textview").click();
		d.findElement(By.xpath("//*[contains(@text,'Name')]")).sendKeys("Mueen");
		d.pressKey(new KeyEvent(AndroidKey.BACK));
		System.out.println("completed");

	}
}
