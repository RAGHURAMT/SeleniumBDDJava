package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void open(String url) {
        driver.get(url);
    }

    public void clickElement(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    public void clearAndSendKeys(By locator, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }
}
