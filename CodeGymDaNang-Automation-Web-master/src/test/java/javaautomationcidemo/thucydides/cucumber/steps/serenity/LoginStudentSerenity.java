package javaautomationcidemo.thucydides.cucumber.steps.serenity;

import javaautomationcidemo.thucydides.cucumber.pages.LoginPage;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LoginStudentSerenity extends ScenarioSteps {
    private static final long serialVersionUID = 1L;
    LoginPage loginPage;


    public void oPenBrowsertoLogin() {
        loginPage.open();
        loginPage.getDriver().manage().window().fullscreen();
    }


    public void clickToLogin() {
        loginPage.clickToLogin();
    }

    public void enterEmail(String email) {
        loginPage.enterEmail(email);
    }


    public void enterPass(String pass) {
        loginPage.enterPass(pass);
    }


    public void clickLogin() {
        loginPage.clickLogin();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void navigateHome(String result) {
        String urlCurrent = loginPage.getDriver().getCurrentUrl();
        Assert.assertEquals(result, urlCurrent);
    }
}
