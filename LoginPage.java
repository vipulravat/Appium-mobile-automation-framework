package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage {

    AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    By two = By.id("com.android.calculator2:id/digit_2");
    By plus = By.id("com.android.calculator2:id/op_add");
    By three = By.id("com.android.calculator2:id/digit_3");
    By equals = By.id("com.android.calculator2:id/eq");

    public void calculate() {

        driver.findElement(two).click();
        driver.findElement(plus).click();
        driver.findElement(three).click();
        driver.findElement(equals).click();

    }
}
