import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class AppiumStart {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		RemoteWebDriver driver;
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "0b31bde602b33491");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", "C://Users/vipinsi/Downloads/app-v1.3.0-QA-2015-10-22-qa.apk");
		capabilities.setCapability("appPackage", "jp.co.rakuten.shibuya.customer.app");
		capabilities.setCapability("appActivity","jp.co.rakuten.shibuya.customer.app.ui.home.SplashScreenActivity");

		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		Thread.sleep(10000);
		
		
//	    DesiredCapabilities capabilities = new DesiredCapabilities();
//	    capabilities.setCapability("automationName", "Appium");
//	    capabilities.setCapability("deviceName", "Android ");
//	    capabilities.setCapability("platformName", "Android");
//	    capabilities.setCapability("platformVersion", "6.0");
//	    capabilities.setCapability("appActivity","jp.co.rakuten.shibuya.customer.app.ui.product.ProductActivity");
//	    capabilities.setCapability("appPackage", "jp.co.rakuten.shibuya.customer.app");
//	    capabilities.setCapability("fullReset", true);
//	 
//	    capabilities.setCapability("app", "C://Users/vipinsi/Downloads/app-v1.2.1-QA-2015-10-14-qa.apk");
//	    try
//	    {
//	      driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//	    } catch (
//	    MalformedURLException e)
//	    {
//	      e.printStackTrace();
	   // }

	}

}
