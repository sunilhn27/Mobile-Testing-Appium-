package com.jackie.Jackie;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Base {

	public AndroidDriver d;

	@Test
	public void setup() throws MalformedURLException, InterruptedException {
		System.out.println("jinstarthtgfdxt");
		DesiredCapabilities caps = new DesiredCapabilities();
		System.out.println("sadf");
		caps.setCapability("deviceName", "Redmi");
		caps.setCapability("udid", "464ad62d"); // Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
//		caps.setCapability("app", "D:\\MS OFFICE\\Appium\\selendroid.apk");
		caps.setCapability("platformVersion", "4.1.2");

		caps.setCapability("appPackage", "io.selendroid.testapp");
		caps.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		// com.android.contacts
		// com.android.contacts.activities.TwelveKeyDialer

		// caps.setCapability("appPackage", "com.android.contacts");
		// caps.setCapability("appActivity",
		// "com.android.contacts.activities.TwelveKeyDialer");

		//
		// caps.setCapability("appPackage", "com.android.dialer");
		// caps.setCapability("appActivity", "com.android.dialer.DialtactsActivity");

		// caps.setCapability("appPackage", "com.whatsapp");
		// caps.setCapability("appActivity", "com.whatsapp.HomeActivity");
//		caps.setCapability("noReset", true);
		d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		d.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);

		// WebElement dial =
		// d.findElement(By.id("com.android.dialer:id/floating_action_button"));
		//

		WebElement text = d.findElement(By.id("io.selendroid.testapp:id/my_text_field"));

		text.sendKeys("Sunil Is Rocking");

		/*
		 * d.findElement(By.id("com.android.dialer:id/three")).click();
		 * d.findElement(By.id("com.android.dialer:id/nine")).click();
		 * d.findElement(By.id("com.android.dialer:id/seven")).click();
		 */ }

	@AfterClass
	public void textbox() throws InterruptedException {
		System.out.println("Closing app");
		Thread.sleep(4000);

		// d.quit();

	}
}
