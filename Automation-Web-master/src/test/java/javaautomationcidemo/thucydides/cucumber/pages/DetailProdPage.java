package javaautomationcidemo.thucydides.cucumber.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.demoblaze.com/")
public class DetailProdPage extends PageObject {
    @FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
    WebElementFacade galaxys6;
    @FindBy(xpath = "//h2[contains(text(),'Samsung galaxy s6')]")
    WebElementFacade phoneName;
    @FindBy(xpath="//body/div[5]/div[1]/div[2]/h3[1]")
    WebElementFacade cost;
    @FindBy(xpath="//p[contains(text(),'The Samsung Galaxy S6 is powered by 1.5GHz octa-co')]")
    WebElementFacade descriptionPhone;

    @FindBy(xpath ="//a[contains(text(),'Nokia lumia 1520')]")
    WebElementFacade nokia520;

    public void clickProd(){
        nokia520.isDisplayed();
        galaxys6.isDisplayed();
       // descriptionPhone.shouldNotBeVisible();
        galaxys6.click();
        getDriver().manage().window().fullscreen();
    }
    public void goToDetailPageCorretOrNot(String urlCurrent, String deviceName, String costDevice, String description){
        System.out.printf("urlCurrent: "+urlCurrent);
        getDriver().getCurrentUrl().equals(urlCurrent);
        System.out.println("PhoneName: "+phoneName.getTextValue());
        phoneName.getTextValue().equals(deviceName);
        System.out.println("Description: "+descriptionPhone.getTextValue());
        descriptionPhone.containsText(description);
    }

}
