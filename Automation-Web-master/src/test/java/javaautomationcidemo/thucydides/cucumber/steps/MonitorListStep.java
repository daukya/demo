package javaautomationcidemo.thucydides.cucumber.steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javaautomationcidemo.thucydides.cucumber.steps.serenity.MonitorListSerenity;
import net.thucydides.core.annotations.Steps;



public class MonitorListStep {
    @Steps
    MonitorListSerenity monitorListSerenity;
    @Given("^Open home page to click monitors button$")
    public void openHomePageToClickMonitorsButton() {
        monitorListSerenity.open_Home_To_Click_Monitor_Button();
    }
    @When("^Click on monitor category$")
    public void clickOnMonitorCategory() {
        System.out.println("okkkkkkkkkkkkk");
        monitorListSerenity.click_Monitors_Button();
    }


    @Then("^The website show all monitor devices correct \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theWebsiteShowAllMonitorDevicesCorrectAnd(String name, String cost) throws Throwable {
        System.out.println("vai cut");
        monitorListSerenity.check_Data_Monitor_Displays(name,cost);
    }
}
