package com.jackie.Jackie;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Redmi {

	static AndroidDriver d;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		System.out.println("sadf");
		caps.setCapability("deviceName", "nexus 5");
		caps.setCapability("udid", "169.254.236.101:5555"); // Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		// caps.setCapability("app", "D:\\MS OFFICE\\Appium\\selendroid.apk");
		caps.setCapability("platformVersion", "5.1.0");
		caps.setCapability("appPackage", "io.selendroid.testapp");
		caps.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		caps.setCapability("noReset", true);
		System.out.println("ohoon");
		d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys("sunil");	
		d.findElement(By.id("io.selendroid.testapp:id/showPopupWindowButton")).click();
		d.findElementById("io.selendroid.testapp:id/exceptionTestField").sendKeys("Sunil is Rocking");
		

		
		
		
		
			
		
		// d.findElement(By.className("android.widget.EditText")).sendKeys("sunil");
		// List<WebElement> button =
		// d.findElements(By.className("android.widget.LinearLayout"));
		// System.out.println("buttons size" + button.size());
		// for (WebElement a : button) {
		//
		// System.out.println(a.isDisplayed());
		//
		// System.out.println("names :" + a.getText());
		// }
		//
		// Thread.sleep(2000);
		//
		// d.quit();
	}
}
