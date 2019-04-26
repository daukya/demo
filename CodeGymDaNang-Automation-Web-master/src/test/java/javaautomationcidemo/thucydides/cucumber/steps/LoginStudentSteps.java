package javaautomationcidemo.thucydides.cucumber.steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javaautomationcidemo.thucydides.cucumber.configs.WebProfile;
import javaautomationcidemo.thucydides.cucumber.steps.serenity.LoginStudentSerenity;
import net.thucydides.core.annotations.Steps;


public class LoginStudentSteps{
    private String lang;
    @Steps
    LoginStudentSerenity loginStudentSerenity;
    @Given("^Open browser to login on hai \"([^\"]*)\"$")
    public void openBrowserToLoginOnHai(String language){
        WebProfile webProfile = new WebProfile();
        lang = webProfile.checkLang(language);
        System.out.println("Login with "+lang);
        if(lang.equals("EN")){
            System.out.println("vo vao");
            loginStudentSerenity.oPenBrowsertoLogin();
            System.out.println("open xong cho chut da");
            loginStudentSerenity.click_EN_lang();
        }else
            loginStudentSerenity.oPenBrowsertoLogin();

    }
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

    @Then("^fields validate for \"([^\"]*)\" and \"([^\"]*)\"$")
    public void fieldsValidateForAnd(String arg0, String arg1){

    }

    @Then("^validate field \"([^\"]*)\" and \"([^\"]*)\"$")
    public void validateFieldAnd(String email, String pass){
        loginStudentSerenity.Email_Pass_Null(email,pass);
    }
}