package javaautomationcidemo.thucydides.cucumber.steps.serenity;

import javaautomationcidemo.thucydides.cucumber.pages.RemovePage;
import net.thucydides.core.steps.ScenarioSteps;

public class RemoveUserSerenity extends ScenarioSteps {
    private static final long serialVersionUID = 1L;
    RemovePage removePage;

    public void openBrowserToLogin(){
        removePage.open();
        getDriver().manage().window().fullscreen();
    }
    public void enterDatalogin(String username, String password){
        removePage.enterDatalogin(username, password);
    }
    public void click_Select_All_User(){
        removePage.click_Select_All_User();
    }
    public void click_Search_Btn(){
        removePage.click_Search_Btn();
    }
    public void remove_User() throws InterruptedException {
        removePage.remove_User();
    }
    public void delete_Success_OKorNot(){
        removePage.delete_Success_OKorNot();
    }
}
