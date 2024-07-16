package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonMethods {
    private WebDriver driver;
    private WebDriverWait wait;

    public CommonMethods(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void waitForClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForTitleContains(String title) {
        wait.until(ExpectedConditions.titleContains(title));
    }
}
