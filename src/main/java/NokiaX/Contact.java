package NokiaX;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import selendroid.ScrollFunction;

public class Contact {

	AndroidDriver<MobileElement> d;

	@BeforeTest
	public void initilize() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "nexus 5");
		caps.setCapability("udid", "192.168.43.145:5555"); // Give Device ID of your mobile phone
															// 4cf42f27cf40192.168.43.190:5555
		caps.setCapability("platformName", "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability("platformVersion", "4.1.2");
		caps.setCapability("appPackage", "com.android.contacts"); // com.hmh.api
		caps.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity"); // com.hmh.api.ApiDemos
		caps.setCapability("noReset", true);
		System.out.println("ohoon");
		d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		d.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);

	}

	// @Test
	public void testing1() {
		System.out.println("inside contact");
		d.findElement(By.xpath("//com.android.contacts[@index=‘2’]")).click();
		System.out.println("Succes");
	}

	@Test
	public void scroll() throws Exception {

		d.findElement(By.xpath("//android.widget.TextView[contains(@text,'Abhijeeth']")).click();

		// ScrollFunction s = new ScrollFunction(d);
		// s.ScrollTo("Bharath");
	}

}
