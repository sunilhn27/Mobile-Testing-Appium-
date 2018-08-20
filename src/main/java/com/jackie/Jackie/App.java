package com.jackie.Jackie;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * Hello world!
 *
 */
public class App {
	static AndroidDriver<MobileElement> d;

	public static void main(String[] args) throws MalformedURLException {
		System.out.println("jinstarthtgfdxt");
		DesiredCapabilities caps = new DesiredCapabilities();
		System.out.println("sadf");
		caps.setCapability("deviceName", "Redmi");
		caps.setCapability("udid", "48ec5ac87d43"); // Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		// caps.setCapability("app", "D:\\MS OFFICE\\Appium\\selendroid.apk");
		caps.setCapability("platformVersion", "5.1.0");
		caps.setCapability("appPackage", "io.selendroid.testapp");
		caps.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		caps.setCapability("noReset", true);
		d = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.findElementById("io.selendroid.testapp:id/my_text_field").sendKeys("SUnil");
		// List<MobileElement> buttons =
		// d.findElements(By.className("android.widget.Button"));

		// for (WebElement a : buttons) {
		// System.out.println("total no of buttons" + buttons.size());
		// System.out.println(a.isDisplayed());
		// System.out.println(a.getText());

		// }

//		d.quit();
		System.out.println("iugbiu");
	}
/*
	public void swipeVertical() {
		Dimension dim = d.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width / 2;
		int startx = (int) (height * 0.80);
		int enfy = (int) (height * 0.20);

	}
*/
}
