package javaautomationcidemo.thucydides.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javaautomationcidemo.thucydides.cucumber.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;

public class HomeScenarioSteps {

	@Steps
	UserSteps userStep;
	
	@Given("^I am on the registration$")
	public void openTheHomePage() {
		userStep.openTheHomePage();
	}
	
	@When("^I enter my email$")
	public void enterEmail() {
		userStep.enterEmail();
	}
	
	@And("^I enter my password$")
	public void enterPassword() {
		userStep.enterPassword();
	}
	

	@And("^I confirm my password$")
	public void enterConfirmPass() {
		userStep.enterCofirmPass();
	}
	
	@And("^I enter my firstname$")
	public void enterFirstName() {
		userStep.enterFirstName();
	}
	
	@And("^I enter lastname$")
	public void enterLastName() {
		userStep.enterLastName();
	}
	
	@And("^I click Registration button$")
	public void clickRegistration() {
		userStep.clickRegisterButton();
	}
	
	@Then("^I should see result$")
	public void thenIShouldSeeRegisterButton(){
		userStep.thenIShouldSeeResult();
	}
	 
	
}
