package Tests;

import com.mycompany.testproject.pages.MainPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * @author m.prytkova
 */
public class Test1 {

    WebDriver driver;
    WebElement element;
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

    @Test
    public void openLJ() {
        mainPage = new MainPage(driver);
        driver.get(mainPage.url);
        mainPage.clickTop();

    }

}
