package GcsApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GcsLogin {

	AndroidDriver<MobileElement> d;

	@Test
	@Parameters({ "UID", "PORT" })
	public void initilize(String uid, String PORT) throws MalformedURLException, InterruptedException {
		System.out.println("uid " + uid + "port  " + PORT);
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Note3");
		caps.setCapability("udid", uid); // Give Device ID of your mobile phone
											// 4cf42f27cf40192.168.43.190:5555
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "5.1.0");
		caps.setCapability("appPackage", "com.schneiderelectric.cfsupport"); // com.hmh.api
		caps.setCapability("appActivity", "com.schneiderelectric.cfsupport.activities.SplashActivity"); // com.hmh.api.ApiDemos
		caps.setCapability("noReset", true);
		System.out.println("ohoon");
		d = new AndroidDriver(new URL("http://127.0.0.1:" + PORT + "/wd/hub"), caps);
		d.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		System.out.println("SUccess");

		System.out.println("inside naviagte");
		Thread.sleep(3000);
		d.findElement(By.id("com.schneiderelectric.cfsupport:id/et_username")).sendKeys("AVTest4@AVTest4.com");
		d.findElement(By.id("com.schneiderelectric.cfsupport:id/et_password")).sendKeys("GCSWeb2014");
		d.findElement(By.id("com.schneiderelectric.cfsupport:id/login_submit")).click();

	}

	/*
	 * @Test public void navigate() throws InterruptedException {
	 */ }
