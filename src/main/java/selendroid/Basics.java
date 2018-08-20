package selendroid;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class Basics {

	static AndroidDriver<MobileElement> d;

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "nexus 5");
		caps.setCapability("udid", "169.254.132.102:5555"); // Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability("platformVersion", "5.1.0");
		caps.setCapability("appPackage", "com.example.android.apis"); // com.hmh.api
		caps.setCapability("appActivity", "com.example.android.apis.ApiDemos"); // com.hmh.api.ApiDemos
		caps.setCapability("noReset", true);
		System.out.println("ohoon");
		d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		d.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		System.out.println("SUccess");
		ScrollFunction f = new ScrollFunction(d);
		f.ScrollToAndClick("Views");
		f.ScrollTo("Visibility");
		// KeyEvent k = new KeyEvent(AndroidKey.BACK);
		
	}
}
