package whatsup;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WhatsUpTest {

	AndroidDriver<MobileElement> d;

	@BeforeTest
	public void initilize() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "nexus 5");
		caps.setCapability("udid", "4cf42f27cf40"); // Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability("platformVersion", "5.1.0");
		caps.setCapability("appPackage", "com.whatsapp"); // com.hmh.api
		caps.setCapability("appActivity", "com.whatsapp.HomeActivity"); // com.hmh.api.ApiDemos
		caps.setCapability("noReset", true);
		System.out.println("ohoon");
		d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		d.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		System.out.println("SUccess");

	}

	
	@Test(priority = 1)
	public void test() throws InterruptedException {
		System.out.println("launched");
		// d.findElementById("com.whatsapp:id/contact_row_container").click();
		// Thread.sleep(2000);
		// d.findElement(By.xpath("//*[contains(@text,'Manohar')]")).click();
		// d.findElement(By.xpath("//*[contains(@text,'Type a message')]")).sendKeys("hi
		// this is sunil");
		// d.findElementsByAccessibilityId("More options").c
		// d.findElementById("com.whatsapp:id/input_attach_button").click();
		System.out.println("End");
		// d.findElementById("com.whatsapp:id/send").click();
	}

	public void Headlines() {
		List<MobileElement> menu = d.findElements(By.className("android.widget.TextView"));
		/*
		 * for (MobileElement m : menu) { System.out.println(m.getText()); 
		 *}
		 */
		for (int i = 0; i < menu.size(); i++) {

			System.out.println(menu.get(i).getText());
		}
	}

	/**
	 * 
	 */
	@Test(priority = 2)
	public void navigate() {
		
		d.findElement(By.xpath("//*[contains(@text,'STATUS')]")).click();
		d.findElement(By.xpath("//*[contains(@text,'CALLS')]")).click();
		d.findElement(By.xpath("//*[contains(@text,'CHATS')]")).click();
		d.findElementById("com.whatsapp:id/fab").click();
		d.findElementByClassName("android.widget.ImageButton").click();
		d.findElementById("com.whatsapp:id/fab").click();
		// d.findElementById("com.whatsapp:id/menuitem_search").click();
		System.out.println("ENDING");
		ScrollFunction s = new ScrollFunction(d);
		s.ScrollToAndClick("Manohar");
		d.findElement(By.xpath("//*[contains(@text,'Type a message')]")).sendKeys("This is Sunil Fro APPIUM");

	}

}
