package javaautomationcidemo.thucydides.cucumber.steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javaautomationcidemo.thucydides.cucumber.steps.serenity.LoginStudentSerenity;
import net.thucydides.core.annotations.Steps;


public class LoginStudentSteps {

    @Steps
    LoginStudentSerenity loginStudentSerenity;

    @Given("^Open browser to login$")
    public void openBrowserToLogin() {
        loginStudentSerenity.oPenBrowsertoLogin();
    }

    @When("^click login$")
    public void clickLogin() {
        loginStudentSerenity.clickToLogin();
    }

    @And("^click enter login$")
    public void clickLoginEnterLogin() {
        loginStudentSerenity.clickLogin();
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        loginStudentSerenity.enterEmail(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String pass) {
        loginStudentSerenity.enterPass(pass);
    }

    @Then("^Navigate to home Juniorviec \"([^\"]*)\"$")
    public void navigateToHomeJuniorviec(String result) {
        loginStudentSerenity.navigateHome(result);
    }

}