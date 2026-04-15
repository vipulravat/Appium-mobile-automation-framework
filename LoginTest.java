package tests;

import base.BaseTest;
import org.junit.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void calculatorTest() {

        LoginPage page = new LoginPage(driver);

        page.calculate();

    }
}
