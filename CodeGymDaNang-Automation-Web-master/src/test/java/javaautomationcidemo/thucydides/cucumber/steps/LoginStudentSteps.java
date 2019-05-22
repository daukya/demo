package javaautomationcidemo.thucydides.cucumber.steps;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javaautomationcidemo.thucydides.cucumber.configs.WebProfile;
import javaautomationcidemo.thucydides.cucumber.steps.serenity.LoginStudentSerenity;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.logging.Logger;


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

    @And("^enter password correct$")
    public void enterPasswordCorrect() throws Throwable {
         loginStudentSerenity.enterPass("123123");
    }

    @Then("^Check validate Email field$")
    public void checkValidateEmailField() throws Throwable {
        loginStudentSerenity.email_Null();
    }

    @And("^enter email correct$")
    public void enterEmailCorrect() throws Throwable {
        loginStudentSerenity.enterEmail("lenguyenthanhtuyen97@gmail.com");
    }

    @Then("^Check validate password field$")
    public void checkValidatePasswordField() throws Throwable {
        loginStudentSerenity.pass_null();
    }

    @And("^enter email valid and pass is invalid$")
    public void enterEmailValidAndPassIsInvalid(DataTable data) throws Throwable {
        List<String> list = data.asList(String.class);
        System.out.println("Username - " + list.get(0));
        System.out.println("Password - " + list.get(1));
        loginStudentSerenity.enterEmail(list.get(0));
        loginStudentSerenity.enterPass(list.get(1));
    }

    @Then("^login fail and show validate message$")
    public void loginFailAndShowValidateMessage() throws Throwable {
        loginStudentSerenity.mail_valid_pass_invalid();
    }

    @And("^enter email invalid and pass is valid$")
    public void enterEmailInvalidAndPassIsValid(DataTable data) throws Throwable {
        List<String> list = data.asList(String.class);
        System.out.println("Username - " + list.get(0));
        System.out.println("Password - " + list.get(1));
        loginStudentSerenity.enterEmail(list.get(0));
        loginStudentSerenity.enterPass(list.get(1));
    }

    @Then("^login fail and show validate message when email enter invalid and pass valid$")
    public void loginFailAndShowValidateMessageWhenEmailEnterInvalidAndPassValid() throws Throwable {
        loginStudentSerenity.mail_invalid_pass_valid();
    }

    @And("^enter email and pass valid$")
    public void enterEmailAndPassValid(DataTable data) throws Throwable {
        List<String> list = data.asList(String.class);
        System.out.println("Username - " + list.get(0));
        System.out.println("Password - " + list.get(1));
        loginStudentSerenity.enterEmail(list.get(0));
        loginStudentSerenity.enterPass(list.get(1));
    }

    @Then("^login success$")
    public void loginSuccess() throws Throwable {
        loginStudentSerenity.checkUrlLoginSuccess();
    }
}