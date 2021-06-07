package javaautomationcidemo.thucydides.cucumber.steps.serenity;

import javaautomationcidemo.thucydides.cucumber.pages.PhonePage;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class PhoneSerenity extends ScenarioSteps {
    PhonePage phonePage;

    public void open_Home_Page(){
        phonePage.open();
    }
    public void check_GalaxyS6_Displays_OK_Or_Not(String name, String cost){
        phonePage.check_GalaxyS6_Displays_OK_Or_Not(name,cost);
    }
    public void click_Galaxy_Name(){
        phonePage.click_Galaxy_Name();
    }
    public void check_Galaxy_Detail_Displays_Ok_Or_Not(String name,String cost){
        phonePage.check_Galaxy_Detail_Displays_Ok_Or_Not(name,cost);
    }
}
