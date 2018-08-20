package Test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.jackie.Jackie.Base;

public class launch extends Base {

	@Test
	public void launch() throws MalformedURLException {
		Base b = new Base();
		b.d.findElement(By.xpath("//android.widget.Button[text,'Display Popup Window']")).click();
//		b.setup();
		System.out.println("success");
	}
}
