package javaautomationcidemo.thucydides.cucumber.pages;

import java.math.BigDecimal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://juniorviec.com/register")
public class HomePage extends PageObject {

	@FindBy(name="email")
	WebElementFacade emailText;

	@FindBy(id = "password")
	WebElementFacade password;

	@FindBy(id = "username")
	WebElementFacade userName;

	@FindBy(id = "cpassword")
	WebElementFacade confirmPassword;

	@FindBy(id = "firstname")
	WebElementFacade firstName;

	@FindBy(id = "lastname")
	WebElementFacade lastName;

	@FindBy(name = "submit")
	WebElementFacade submitBtn;

	public void enterEmail() {
		emailText.type("phuc.pham@smartdev.vn");
	}

	public void enterPassword() {
		password.type("1234567890");
	}

	public void enterConfirmPassword() {
		confirmPassword.type("1234567890");

	}

	public void enterFirstName() {
		firstName.type("Le");

	}

	public void enterLastName() {
		lastName.type("Nguyen");

	}
	
	public void clickSubmitButton() {
		submitBtn.click();
	}
}
