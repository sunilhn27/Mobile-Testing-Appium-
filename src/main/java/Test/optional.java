package Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import whatsup.ScrollFunction;

public class optional {

	AndroidDriver<MobileElement> d;

	@Test
	@Parameters({ "UID", "PORT" })
	public void parameter1(String UID, String PORT) throws MalformedURLException {
		System.out.println(UID);
		System.out.println(PORT);
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Note3");
		caps.setCapability("udid", UID); // Give Device ID of your mobile phone
											// 4cf42f27cf40192.168.43.190:5555
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "5.1.0");
		caps.setCapability("appPackage", "com.whatsapp"); // com.hmh.api
		caps.setCapability("appActivity", "com.whatsapp.HomeActivity"); // com.hmh.api.ApiDemos
		caps.setCapability("noReset", true);
		System.out.println("ohoon");
		d = new AndroidDriver(new URL("http://127.0.0.1:" + PORT + "/wd/hub"), caps);
		d.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		System.out.println("SUccess");

		// @Test(priority = 2)
		// public void navigate() {
		System.out.println("hello appium");
		d.findElement(By.xpath("//*[contains(@text,'STATUS')]")).click();
		d.findElement(By.xpath("//*[contains(@text,'CALLS')]")).click();
		d.findElement(By.xpath("//*[contains(@text,'CHATS')]")).click();
		d.findElementById("com.whatsapp:id/fab").click();
		d.findElementByClassName("android.widget.ImageButton").click();
		d.findElementById("com.whatsapp:id/fab").click();
		// d.findElementById("com.whatsapp:id/menuitem_search").click();
		System.out.println("ENDING");
		ScrollFunction s = new ScrollFunction(d);
		s.ScrollToAndClick("Aziz");
		d.findElement(By.xpath("//*[contains(@text,'Type a message')]")).sendKeys("This is Sunil Fro APPIUM");

	}

	
}