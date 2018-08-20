package selendroid;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollFunction extends Basics {

	public ScrollFunction(AndroidDriver d) {
		this.d = d;
	}

	AndroidDriver d;

	public void ScrollToAndClick(String name) {
		System.out.println("Scroll and click started");
		AndroidElement list = (AndroidElement) d.findElement(By.className("android.widget.TextView"));
		MobileElement listGroup = (MobileElement) d
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + name + "\"))"));
		listGroup.click();
		System.out.println("scroll and click");
	}

	public void ScrollTo(String name) throws Exception {
		System.out.println("scroll To");
		AndroidElement list = (AndroidElement) d.findElement(By.className("android.widget.TextView"));
		MobileElement listGroup = (MobileElement) d
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + name + "\"))"));
		System.out.println("Scrolled");
		listGroup.click();
	}
}
