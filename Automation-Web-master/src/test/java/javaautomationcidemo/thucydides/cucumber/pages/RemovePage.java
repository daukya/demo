package javaautomationcidemo.thucydides.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.demoblaze.com/")
public class RemovePage extends PageObject {
    @FindBy(xpath = "//input[@id='username']")
    WebElementFacade username_Input;
    @FindBy(xpath = "//input[@id='password']")
    WebElementFacade password_Input;
    @FindBy(xpath = "//button[@class='btn btn-info']")
    WebElementFacade login_Btn;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//li[3]//a[1]//b[1]")
    WebElementFacade dropdown_Customer;
    @FindBy(xpath = "//li[@class='dropdown open']//li[1]//a[1]")
    WebElementFacade select_WalletUser;
    @FindBy(xpath = "//button[@class='btn btn-info']")
    WebElementFacade search_AllUser;
    @FindBy(xpath = "//tr[1]//td[13]//a[1]")
    WebElementFacade remove_Btn;
    @FindBy(xpath = "//button[@class='btn btn-mini btn-success']")
    WebElementFacade ok_Btn;
    @FindBy(xpath = "//tr[1]//td[1]")
    WebElementFacade delete_No;
    public void enterDatalogin(String username, String password){
        username_Input.sendKeys(username);
        password_Input.sendKeys(password);
        login_Btn.click();
    }
    public void click_Select_All_User(){
        dropdown_Customer.click();
        select_WalletUser.click();
    }
    public void click_Search_Btn(){
        search_AllUser.click();
    }
    public void remove_User() throws InterruptedException {
        remove_Btn.click();
        System.out.println(delete_No.getTextValue());
        Thread.sleep(20000);
        ok_Btn.click();
    }
    public void delete_Success_OKorNot(){
        getDriver().getCurrentUrl().equals("https://backoffice-uat.smartlinksa.ch/wallet-user");
    }
}
