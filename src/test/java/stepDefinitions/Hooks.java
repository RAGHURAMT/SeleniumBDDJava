package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

public class Hooks {
    public static WebDriver driver;
    private static final ConfigReader configReader = new ConfigReader();
    private static final String baseUrl = configReader.getUrl("base_url");

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
