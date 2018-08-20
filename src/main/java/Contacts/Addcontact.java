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

public class Addcontact {

	AndroidDriver<MobileElement> d;

	@BeforeTest
	public void initilize() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "nexus 5");
		caps.setCapability("udid", "169.254.184.101:5555"); // Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability("platformVersion", "5.1.0");
		caps.setCapability("appPackage", "com.android.contacts"); // com.hmh.api
		caps.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity"); // com.hmh.api.ApiDemos
		caps.setCapability("noReset", true);
		System.out.println("ohoon");
		d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		d.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		System.out.println("SUccess");

	}

	public void webelements() {
		d.findElementById("com.android.contacts:id/menu_search");
		d.findElementsByAccessibilityId("More options");
		d.findElement(By.xpath("//*[text()='Favorites']")).click();

	}

	@Test
	public void addContact() throws InterruptedException {
		System.out.println("Started");
		d.findElement(By.xpath("//*[contains(@text,'Favorites')]")).click();
		d.findElement(By.xpath("//*[contains(@text,'All contacts')]")).click();
		d.findElementById("com.android.contacts:id/floating_action_button").click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[contains(@text,'Name')]")).sendKeys("Kavitha");
		d.findElement(By.xpath("//*[contains(@text,'Phone')]")).sendKeys("8123400172");
		d.pressKey(new KeyEvent(AndroidKey.BACK));
	}
}
