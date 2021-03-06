package Tests.LiveJournal;

import com.mycompany.testproject.CoreTest;
import com.mycompany.testproject.pages.MainPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.jbehave.core.annotations.Given;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

/**
 * @author m.prytkova
 */@RunWith(SerenityRunner.class)//Обязательная аннотация для запуска тестов в Серенити
public class Test1 extends CoreTest{

    WebDriver driver;
    MainPage mainPage;

    @Before
    public void setup() {
        String browser = "chrome";
        switch (browser.toLowerCase()) {
            case "chrome": {
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
            }
            case "firefox": {
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;
            }
            case "opera": {
                OperaDriverManager.getInstance().setup();
                driver = new OperaDriver();
                break;
            }
            default: {
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
            }
        }
        driver.manage().window().maximize();
    }

    @After
    public void aftertest() {
        driver.quit();
    }

    @Given("OLOLO")
    public void openLJ() {
        mainPage = new MainPage(driver);
        driver.get(mainPage.url);
        mainPage.clickTop();//.openTopSettings();
        
       // this.startScript(driver, "jQuery('.b-mainpage-intro-settings-icon').click()");
    }

}
