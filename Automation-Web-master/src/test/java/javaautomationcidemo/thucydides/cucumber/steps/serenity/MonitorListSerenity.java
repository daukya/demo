package javaautomationcidemo.thucydides.cucumber.steps.serenity;

import javaautomationcidemo.thucydides.cucumber.pages.MonitorListPage;
import net.thucydides.core.steps.ScenarioSteps;

public class MonitorListSerenity extends ScenarioSteps {
    private static final long serialVersionUID = 1L;
    MonitorListPage monitorListPage;
    public void open_Home_To_Click_Monitor_Button(){

        monitorListPage.open();
        getDriver().manage().window().fullscreen();
    }
    public void click_Monitors_Button(){
        monitorListPage.click_Monitors_Button();
    }
    public void check_Data_Monitor_Displays(String name, String cost){
        monitorListPage.check_Data_Monitor_Displays(name,cost);
    }
}
