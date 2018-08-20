package BookMyshow;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Launch {

	AndroidDriver d;

	@Test
	public void launchBookMyShoew() throws MalformedURLException {

		// File app = new File();

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "nexus 5");
		caps.setCapability("udid", "169.254.49.101:5555"); // Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability("app", "D:\\MS OFFICE\\Appium\\bookMyShowucb.apk");
		caps.setCapability("platformVersion", "5.1.0");
		caps.setCapability("appPackage", "com.bt.bms");
		caps.setCapability("appActivity", "com.bt.bms.activities.IntroActivity");
		caps.setCapability("noReset", true);
		System.out.println("ohoon");

		d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println("SUccess");

		d.findElementById("com.bt.bms:id/btnLogin").click();
		// d.findElementById("com.bt.bms:id/btnNoThanks").click();
		d.findElementById("com.bt.bms:id/btnSignUp").click();
		d.findElementById("com.bt.bms:id/edtFirstName").sendKeys("Sunil");
		d.findElementById("com.bt.bms:id/edtLastName").sendKeys("H N");
		d.findElementById("com.bt.bms:id/edtEmailId").sendKeys("sunilhn3@gmail.com");
		d.findElementById("com.bt.bms:id/edtPassword").sendKeys("SUnil@1234");
		d.findElementById("com.bt.bms:id/action_icon").click();

		d.findElementById("com.bt.bms:id/dismiss"); // dismiss
		// d.findElementById("com.bt.bms:id/no_bt"); cancel
		d.findElementById("com.bt.bms:id/yes_bt");// update

		d.findElementById("com.bt.bms:id/yes_bt");
	//	d.findElement(MobileBy.ByAndroidUIAut)

	}
}