package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
    private By searchButton = By.cssSelector(".nav-link-search.track_nav_interact[href='#subnav-search-desktop-top']");
    private By searchField = By.xpath("//nav[@id='subnav-search-desktop-top']//input[@id='search-field']");
    private By submitButton = By.cssSelector("nav[id='subnav-search-desktop-top'] button[type='submit']");
    private By firstResultLink = By.cssSelector(".results .search-result .title");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchButton() {
        clickElement(searchButton);
    }

    public void enterSearchText(String text) {
        clearAndSendKeys(searchField, text);
    }

    public void clickSubmitButton() {
        clickElement(submitButton);
    }

    public String getFirstResultTitle() {
        WebElement firstResult = findElement(firstResultLink);
        return firstResult.getText();
    }
}
