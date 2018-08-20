package selendroid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemo {

	AndroidDriver d;

	@Test
	public void bas() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "nexus 5");
		caps.setCapability("udid", "169.254.215.101:5555"); // Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		// caps.setCapability("app", "D:\\MS OFFICE\\Appium\\bookMyShowucb.apk");
		caps.setCapability("platformVersion", "5.1.0");
		caps.setCapability("appPackage", "com.example.android.apis");
		caps.setCapability("appActivity", "com.example.android.apis.ApiDemos");
		caps.setCapability("noReset", true);
		System.out.println("ohoon");
		d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		d.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		System.out.println("SUccess");

		List<WebElement> Elem = d.findElements(By.className("android.widget.TextView"));

		for (WebElement g : Elem) {
			System.out.println(g.getText());

			if (g.getText().contains("Security")) {
//				g.click();
				System.out.println("clcikde");
			}
		}

		List<WebElement> view = d.findElements(By.className("android.widget.TextView"));

		for (WebElement v : view) {

			if (v.getText().contains("Views")) {
				TouchActions action = new TouchActions(d);
				action.scroll(v, 10, 100);
				action.perform();
				System.out.println("inside touch");
			}

		}

	}
}
