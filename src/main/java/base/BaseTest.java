package base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.*;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest {
  public static WebDriver driver;
  public static Properties prop;
  public static RegistrationPage registrationPage;
  public static RegistrationPage2 registrationPage2;

  @BeforeAll
  public static void driverSetup(){
    prop = new Properties();
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.navigate().to(prop.getProperty("url"));
    driver.manage().window().maximize();
    registrationPage = new RegistrationPage(driver);
    registrationPage2 = new RegistrationPage2(driver);

    try{
      FileInputStream fs = new FileInputStream("src/main/java/config/data.properties");
      prop.load(fs);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

 @AfterAll
  public static void tearDown(){
    driver.quit();
  }
}
