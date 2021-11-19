package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.support.PageFactory.*;

public class RegistrationPage {
    WebDriver driver;

    //locators
    @FindBy(id = "q3a3f0360c07a2f193f5d6c3deb4e3eaae30a645e") public WebElement firstNameTextBox;
    @FindBy(id = "qd1739dc6339989544b4f2cb33c5589b732dd64be") public WebElement lastNameTextBox;
    @FindBy(id = "q1849eab7c39f65c5cda6ad7e4d0b1bb6bf9662cd") public WebElement emailTextBox;
    @FindBy(id = "q46074f7038380274bd1a01b77e026c98036600e0") public WebElement mobileTextBox;
    @FindBy(id = "q03edae0235e3eb19801864a76eb03461edf03534") public WebElement organizationTextBox;
    @FindBy(id = "q50349b6cff30a2d2546d383f6107bedcd16e705e") public WebElement countryTextBox;
    @FindBy(id = "q1bfa2b510de7dfe05d4da6b84bd768694740c685") public WebElement interestedTextBox;
    @FindBy(id = "qc10e3b757b486718defa7935c538283a364cd8ce_postcode") public WebElement postCodeTextBox;
    @FindBy(xpath = "//fieldset/div/div/div/button") public WebElement uploadTextBox;
    @FindBy(xpath = "//a[contains(@href, '#qc10e3b757b486718defa7935c538283a364cd8ce_map')]") public WebElement currentLocationTextBox;
    @FindBy(id = "hs-eu-confirmation-button") public WebElement cookieAccept;
    @FindBy(xpath = "//fieldset/div/div/label") public WebElement receiveCommunicationTextBox;
    @FindBy(name = "next") public WebElement nextButton;


    //constructor
    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this); }

    //actions
    public void enterFirstName(String fn){firstNameTextBox.sendKeys(fn); }
    public void enterLastName(String ln){lastNameTextBox.sendKeys(ln); }
    public void enterEmail(String em){emailTextBox.sendKeys(em); }
    public void enterMobile(String mb){mobileTextBox.sendKeys(mb); }
    public void enterOrganization(String or){organizationTextBox.sendKeys(or); }
    public void enterCountry (){
        Select select = new Select(countryTextBox);
        select.selectByIndex(1);   }
    public void enterInteresting (){
        Select select = new Select(interestedTextBox);
        select.selectByIndex(2); }
 /*   public void clickUpLoadFile(String fp){
        WebElement fileinput = uploadTextBox;
        fileinput.sendKeys(fp); }*/
    public void enterPostCode(String pc) {postCodeTextBox.sendKeys(pc);}
    public void clickCookieAccept(){cookieAccept.click();}
    public void clickCommunication(){receiveCommunicationTextBox.click(); }
    public void clickNext(){nextButton.click(); }
}
