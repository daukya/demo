package javaautomationcidemo.thucydides.cucumber.steps.serenity;

import javaautomationcidemo.thucydides.cucumber.pages.DetailProdPage;
import net.thucydides.core.steps.ScenarioSteps;

public class DetailProdSerenity extends ScenarioSteps {
    private static final long serialVersionUID = 1L;
    DetailProdPage detailProdPage;

    public void oPenHome(){
        detailProdPage.open();
        getDriver().manage().window().fullscreen();
    }
    public void clickProd(){
        detailProdPage.clickProd();
    }
    public void goToDetailPageCorretOrNot(String urlCurrent, String deviceName, String costDevice, String description){
        detailProdPage.goToDetailPageCorretOrNot(urlCurrent, deviceName, costDevice, description);
    }

}
