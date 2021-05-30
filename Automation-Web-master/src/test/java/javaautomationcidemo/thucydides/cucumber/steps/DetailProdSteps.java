package javaautomationcidemo.thucydides.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javaautomationcidemo.thucydides.cucumber.steps.serenity.DetailProdSerenity;
import net.thucydides.core.annotations.Steps;

public class DetailProdSteps {
    @Steps
    DetailProdSerenity detailProdSerenity;
    @Given("^Open home page$")
    public void openHomePage() {
        detailProdSerenity.oPenHome();
    }

    @When("^Click on any product$")
    public void clickOnAnyProduct() {
        detailProdSerenity.clickProd();
    }

    @Then("^The website navigate to product detail page with correct \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theWebsiteNavigateToProductDetailPageWithCorrectAndAndAnd(String url, String deviceName, String cost, String detail){
        detailProdSerenity.goToDetailPageCorretOrNot(url,deviceName,cost,detail);
    }
}
