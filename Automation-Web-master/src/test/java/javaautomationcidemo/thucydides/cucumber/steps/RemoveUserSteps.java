package javaautomationcidemo.thucydides.cucumber.steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javaautomationcidemo.thucydides.cucumber.steps.serenity.RemoveUserSerenity;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RemoveUserSteps {
    @Steps
    RemoveUserSerenity removeUserSerenity;
    @Given("^Open browser to login into BO$")
    public void openBrowserToLoginIntoBO() throws Throwable {
        removeUserSerenity.openBrowserToLogin();
    }

    @When("^Fill data correct to login success into BO$")
    public void fillDataCorrectToLoginSuccessIntoBO(DataTable data) throws Throwable {
        List<String> list = data.asList(String.class);
        System.out.println("Username - " + list.get(0));
        System.out.println("Password - " + list.get(1));
        String username = list.get(0);
        String password = list.get(1);
        removeUserSerenity.enterDatalogin(username,password);
    }

    @And("^Select wallet user$")
    public void selectWalletUser() throws Throwable {
        removeUserSerenity.click_Select_All_User();
    }

    @And("^Click search full user$")
    public void clickSearchFullUser() throws Throwable {
       removeUserSerenity.click_Search_Btn();
    }

    @And("^Click remove and Tap Ok button$")
    public void clickRemoveAndTapOkButton() throws Throwable {
        removeUserSerenity.remove_User();
    }

    @Then("^Delete success for \"([^\"]*)\" user$")
    public void deleteSuccessForUser(String arg0) throws Throwable {
        removeUserSerenity.delete_Success_OKorNot();
    }
}
