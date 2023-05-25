package First;

import java.net.URL;
import java.net.MalformedURLException;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class BasicAppium {
	
	@Test
	public void AppiumTest() throws MalformedURLException {
		
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("ApiDemos"); 
		options.setApp("//Users//mac//eclipse-workspace//hello//src//fixtures//ApiDemos-debug.apk");
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		}


}
