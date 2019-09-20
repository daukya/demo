//package javaautomationcidemo.thucydides.cucumber.steps;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import javaautomationcidemo.thucydides.cucumber.steps.serenity.HomeOutlineSteps;
//import net.thucydides.core.annotations.Steps;
//
//public class HomeScreenOutlineScenarioSteps {
//
//	@Steps
//	HomeOutlineSteps homeStep;
//
//	
//	/*@When("^I enter my phonenumber as \"([^\"]*)\"$")
//	public void enterPhoneNumber(String phoneNumber) {
//		
//	}*/
//	
//	@When("^I enter my phonenumber as \"([^\"]*)\"$")
//	public void i_enter_my_phonenumber_as(String arg1) throws Throwable {
//		homeStep.enterPhoneNumber(arg1);
//	}
//
//	
//	@And("^I enter my fullname as \"([^\"]*)\"$")
//	public void enterFullName(String fullname) {
//		homeStep.enterFullName(fullname);
//	}
//
//	
//	@And("^I enter my emails as \"([^\"]*)\"$")
//	public void enterEmail(String email) {
//		homeStep.enterEmail(email);
//	}
//	
//	@And("^I enter my username as \"([^\"]*)\"$")
//	public void enterUserName(String username) {
//		homeStep.enterUserName(username);
//	}
//	
//	@And("^I enter password as \"([^\"]*)\"$")
//	public void enterPassword(String password) {
//		homeStep.enterPassword(password);
//	}
//	
//	@And("^I enter repassword as \"([^\"]*)\"$")
//	public void enterReEnterPassword(String repassword) {
//		homeStep.enterReEnterPassword(repassword);
//	}
//	
//	
//}
