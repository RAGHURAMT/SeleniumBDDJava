package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import utils.CommonMethods;

import static org.testng.Assert.*;

public class homepageSteps {
    private WebDriver driver = Hooks.driver;
    private HomePage homePage;
    private CommonMethods commonMethods;

    public homepageSteps() {
        homePage = new HomePage(driver);
        commonMethods = new CommonMethods(driver);
    }

    @Given("I am on the homepage")
    public void I_am_on_the_homepage() {
        commonMethods.waitForClickable(By.cssSelector("#onetrust-reject-all-handler"));
        homePage.acceptCookies();
        String title = homePage.getTitle();
        assertEquals(title, "Welcome to Bright Horizons | Bright Horizons®");
    }

    @When("I click on the Learn More button of section EdAssist Solutions for Employers")
    public void I_click_on_the_learn_more_button_of_section_ed_assist_solutions_for_employers() {
        homePage.clickLearnMoreEdAssist();
        commonMethods.waitForTitleContains("EdAssist Solutions | Bright Horizons®");
    }

    @Then("I naviagted to the edassist-solutions page")
    public void I_navigated_to_the_edassist_solutions_page() {
        String currentURL = homePage.getCurrentURL();
        assertTrue(currentURL.contains("edassist-solutions"), "URL verification failed");
    }

    @Then("I verify comments section is available on the page")
    public void I_verify_comments_section_is_available_on_the_page() {
        int commentsCount = homePage.countComments();
        assertEquals(commentsCount, 5, "Comments count verification failed");

        int dotsCount = homePage.countDots();
        assertEquals(dotsCount, commentsCount, "Dots count verification failed");
    }
}
