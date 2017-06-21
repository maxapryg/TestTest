package Tests;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

/**
 * @author m.prytkova
 */
public class Test1 {

    WebDriver driver;
    WebElement element;


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
            default:{
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
        System.out.println("Starting test ");
        driver.get("http://www.livejournal.com/");

        try {
            element = driver.findElement(By.className("s-header-item__link--ratings"));
            element.click();
        } catch (Exception e) {
        }
        Assert.assertNotNull(element);
        System.out.println("I cannot find " + element);
    }

}
