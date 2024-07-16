package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By acceptCookies = By.cssSelector("#onetrust-reject-all-handler");
    private By btnLearnMoreEdAssist = By.cssSelector("section[id='edAssist'] a[class='button home_lazy_edassist']");
    private By comments = By.cssSelector("[aria-describedby*='slick-slide-control0']");
    private By slickDots = By.cssSelector(".slick-dots li");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies() {
        clickElement(acceptCookies);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickLearnMoreEdAssist() {
        clickElement(btnLearnMoreEdAssist);
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public int countComments() {
        return driver.findElements(comments).size();
    }

    public int countDots() {
        return driver.findElements(slickDots).size();
    }
}
