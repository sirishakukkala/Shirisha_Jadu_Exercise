package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage2 {
    WebDriver driver;

    //locators

    @FindBy(name = "commit") public WebElement submitButton;
    @FindBy(xpath = "//h2[contains(.,'Thanks for completing this form.')]") public WebElement registrationSuccessful;

    //constructor
    public RegistrationPage2(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this); }

    //actions

    public void clickSubmit(){submitButton.click(); }
    public boolean isRegistrationCreated(){return registrationSuccessful.isDisplayed();
    }
}
