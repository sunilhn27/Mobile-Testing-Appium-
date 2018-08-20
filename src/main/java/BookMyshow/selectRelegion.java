package BookMyshow;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class selectRelegion {

	AndroidDriver d;

	@Test
	public void selecrt() throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "nexus 5");
		caps.setCapability("udid", "169.254.236.101:5555"); // Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability("app", "D:\\MS OFFICE\\Appium\\bookMyShowucb.apk");
		caps.setCapability("platformVersion", "5.1.0");
		caps.setCapability("appPackage", "com.bt.bms");
		caps.setCapability("appActivity", "com.bt.bms.activities.IntroActivity");
		caps.setCapability("noReset", true);
		System.out.println("ohoon");
		d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		d.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		System.out.println("SUccess");
		Thread.sleep(60000);
		d.findElementById("com.bt.bms:id/no_bt").click();

	}
}
