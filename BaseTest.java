import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.After;
import org.junit.Before;

import java.net.URL;

public class BaseTest {

    protected AndroidDriver driver;

    @Before
    public void setup() throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"), caps);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
