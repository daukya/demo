package javaautomationcidemo.thucydides.cucumber.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://juniorviec.com/")
public class LoginPage extends PageObject {
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElementFacade login_btn_tologin;
    @FindBy(xpath = "//input[@name='email']")
    WebElementFacade email_ip;
    @FindBy(id = "password")
    WebElementFacade pass_ip;
    @FindBy(xpath = "//input[@id='signin']")
    WebElementFacade login_btn;
    @FindBy(xpath = "//div[contains(text(),'\n" +
            "Account does not exist. Please enter another account')]")
    WebElementFacade errorExist;
    @FindBy(xpath = "//div[contains(text(),'The username or password you enterd is incorrect')]")
    WebElementFacade errorMail;
    @FindBy(xpath = "//*[text()='Field is Required']")
    WebElementFacade errorInput;
    public void clickToLogin() {
        login_btn_tologin.click();
    }

    public void enterEmail(String email) {
        email_ip.sendKeys(email);
    }

    public void enterPass(String pass) {
        pass_ip.sendKeys(pass);
    }

    public void clickLogin() {
        login_btn.click();
    }

    public void notErExist(){
         String errorExist = this.errorExist.getTextValue();
         String errorMail = this.errorMail.getTextValue();
         String errorInput = this.errorInput.getTextValue();
        System.out.println("tuyenthanh"+errorExist);
        System.out.println("letuyen"+errorMail);
        System.out.println("nguyenthanh"+errorInput);
    }

}
