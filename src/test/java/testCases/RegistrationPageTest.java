package testCases;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

public class RegistrationPageTest extends BaseTest {
    @Test
    public void TestToRegister(){
        registrationPage.enterFirstName(prop.getProperty("FirstName"));
        registrationPage.enterLastName(prop.getProperty("LastName"));
        registrationPage.enterEmail(prop.getProperty("email"));
        registrationPage.enterMobile(prop.getProperty("Mobile"));
        registrationPage.enterOrganization(prop.getProperty("Organization"));
        registrationPage.enterCountry();
        registrationPage.enterInteresting();
        registrationPage.enterPostCode(prop.getProperty("PostCode"));
        registrationPage.clickCookieAccept();
//        registrationPage.clickUpLoadFile(prop.getProperty("FilePath"));
        registrationPage.clickCommunication();
        registrationPage.clickNext();
        registrationPage2.clickSubmit();
    }
}
