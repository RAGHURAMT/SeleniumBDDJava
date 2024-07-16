package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.SearchPage;
import utils.CommonMethods;

import static org.testng.Assert.assertEquals;

public class searchSteps {
    private WebDriver driver = Hooks.driver;
    private SearchPage searchPage;
    private HomePage homePage;
    private CommonMethods commonMethods;

    public searchSteps() {
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        commonMethods = new CommonMethods(driver);
    }

    @Given("I am on the homepage to test search functionality")
    public void I_am_on_the_homepage_to_test_search_functionality() {
        commonMethods.waitForClickable(By.cssSelector("#onetrust-reject-all-handler"));
        homePage.acceptCookies();
        String title = homePage.getTitle();
        assertEquals(title, "Welcome to Bright Horizons | Bright Horizons®");
    }

    @When("I click on the search button")
    public void i_click_on_the_search_button() {
        searchPage.clickSearchButton();
    }

    @When("I pass the value {string} into a search field")
    public void i_pass_the_value_into_a_search_field(String text) {
        searchPage.enterSearchText(text);
    }

    @When("I click on Search button")
    public void i_click_on_search_button() {
        searchPage.clickSubmitButton();
    }

    @Then("search result {string} displayed as the first search item in the search page")
    public void search_results_are_displayed_correctly(String text) {
        String firstResultTitle = searchPage.getFirstResultTitle();
        assertEquals(firstResultTitle, text, "Title of the first search result is not as expected.");
    }
}
