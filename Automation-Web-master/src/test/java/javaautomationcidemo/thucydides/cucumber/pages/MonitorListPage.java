package javaautomationcidemo.thucydides.cucumber.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.demoblaze.com/index.html")
public class MonitorListPage extends PageObject {
    @FindBy(xpath="//a[contains(text(),'Monitors')]")
    WebElementFacade monitorButton;
    @FindBy(xpath="//a[contains(text(),'Apple monitor 24')]")
    WebElementFacade nameMonitor;
    @FindBy(xpath="//h5[contains(text(),'$400')]")
    WebElementFacade costMonitor;
    @FindBy(xpath="//p[contains(text(),'LED Cinema Display features a 27-inch glossy LED-b')]")
    WebElementFacade descriptionMonitor;
    @FindBy(xpath = "//a[contains(text(),'ASUS Full HD')]")
    WebElementFacade nameAsus;
    @FindBy(xpath = "//h5[contains(text(),'$230')]")
    WebElementFacade costAsus;

    public void click_Monitors_Button(){
        monitorButton.click();
    }
    public void check_Data_Monitor_Displays(String name, String cost){
        Assert.assertEquals(nameMonitor.getText(),name);
        Assert.assertEquals(costMonitor.getText(),cost);
//        Assert.assertEquals(nameAsus.getText(),name);
//        Assert.assertEquals(costAsus.getText(),cost);


    }

}
