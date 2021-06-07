package javaautomationcidemo.thucydides.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class PhonePage extends PageObject {
    @FindBy(xpath = "//a[contains(text(),'Samsung galaxy s6')]")
    WebElementFacade galaxyS6Name;
    @FindBy(xpath = "//h5[contains(text(),'$360')]")
    WebElementFacade galaxyS6Cost;
    @FindBy(xpath = "//h2[contains(text(),'Samsung galaxy s6')]")
    WebElementFacade galaxyS6NameDetail;
    @FindBy(xpath = "//p[contains(text(),'The Samsung Galaxy S6 is powered by 1.5GHz octa-co')]")
    WebElementFacade galaxyS6DescriptionDetail;

    public void check_GalaxyS6_Displays_OK_Or_Not(String name, String cost){
        Assert.assertEquals(galaxyS6Name.getTextValue(),name);
        Assert.assertEquals(galaxyS6Cost.getTextValue(),cost);
    }
    public void click_Galaxy_Name(){
        galaxyS6Name.click();
    }
    public void check_Galaxy_Detail_Displays_Ok_Or_Not(String name,String cost){
        Assert.assertEquals(galaxyS6NameDetail.getTextValue(),name);
        galaxyS6DescriptionDetail.containsText(cost);
    }
}
