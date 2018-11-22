package javaautomationcidemo.thucydides.cucumber.steps.serenity;

import javaautomationcidemo.thucydides.cucumber.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class UserSteps extends ScenarioSteps{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HomePage homePage;
	
	@Step
	public void openTheHomePage() {
		homePage.open();
	}
	
	@Step
	public void enterEmail() {
		homePage.enterEmail();
	}

	public void enterPassword() {
		homePage.enterPassword();
		
	}

	public void enterCofirmPass() {
		homePage.enterConfirmPassword();
		
	}

	public void enterFirstName() {
		homePage.enterFirstName();
		
	}

	public void enterLastName() {
		homePage.enterLastName();
		
	}

	public void clickRegisterButton() {
		homePage.clickSubmitButton();
		
	}

	public void thenIShouldSeeResult() {
		System.out.println("Registered!!!");
		
	}
}
