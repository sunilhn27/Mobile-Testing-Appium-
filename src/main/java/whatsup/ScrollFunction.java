package whatsup;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ScrollFunction extends WhatsUpTest {

	public ScrollFunction(AndroidDriver d) {
		this.d = d;
	}

	AndroidDriver d;

	String s = "new Uiscrollable(new Uiselector().scrollable(true).scrollIntoView(new UiSelector().text(\"sunil\"))";

	public void ScrollToAndClick(String name) {
		System.out.println("Scroll and click started");
		MobileElement listGroup = (MobileElement) d
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + name + "\"))"));
		listGroup.click();
		System.out.println("scroll and click");
	}

	public void ScrollTo(String name) throws Exception {
		System.out.println("scroll To");
		MobileElement listGroup = (MobileElement) d
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + name + "\"))"));
		System.out.println("Scrolled");
		listGroup.click();
	}
}
