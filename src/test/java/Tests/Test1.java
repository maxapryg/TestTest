package Tests;

import java.nio.file.Paths;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author m.prytkova
 */
public class Test1 {

    WebDriver driver;
    WebElement element;

    public Test1() {
        
        String pathToGeckoDriver = Paths.get("C:\\Users\\m.prytkova\\Documents\\NetBeansProjects\\testProject\\src\\main\\chromedriver.exe").toAbsolutePath().toString();
        System.setProperty("webdriver.chrome.driver", pathToGeckoDriver);
        this.driver = new ChromeDriver();
    }

    @Before
    public void setup() {
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
