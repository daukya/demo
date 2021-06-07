package javaautomationcidemo.thucydides.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javaautomationcidemo.thucydides.cucumber.steps.serenity.PhoneSerenity;
import net.thucydides.core.annotations.Steps;

public class PhoneSteps {
    @Steps
    PhoneSerenity phoneSerenity;
    @Given("^Open home page$")
    public void openHomePage() {
        phoneSerenity.open_Home_Page();
    }

    @Then("^The website display Galaxy in phone category correct with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theWebsiteDisplayGalaxyInPhoneCategoryCorrectWithAnd(String name, String cost) throws Throwable {
        phoneSerenity.check_GalaxyS6_Displays_OK_Or_Not(name,cost);
    }

    @When("^Click on galaxy name$")
    public void clickOnGalaxyName() {
        phoneSerenity.click_Galaxy_Name();
    }

    @Then("^The website navigate to galaxy detail page correct with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theWebsiteNavigateToGalaxyDetailPageCorrectWithAnd(String name, String description) throws Throwable {
        phoneSerenity.check_Galaxy_Detail_Displays_Ok_Or_Not(name,description);
    }
}
