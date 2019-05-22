package javaautomationcidemo.thucydides.cucumber.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.xpath.XPathContext;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

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
    @FindBy(xpath = "//button[@type='button']//img[@alt='vietnamese']")
    WebElementFacade en_lang;
    @FindBy(xpath = "//div[3]//div[1]//div[1]//div[1]")
    WebElementFacade email_null;
    @FindBy(xpath = " //div[4]//div[1]//div[1]//div[1]")
    WebElementFacade pass_null;
    @FindBy(xpath = "//div[@class='form-group global-error']//div[@class='error-input']")
    WebElementFacade email_pass_validate;
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
    public void click_EN_lang(){
        en_lang.click();
    }
    public void Email_Pass_Null(String email, String pass){
        getDriver().manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
        System.out.println("con cho" + email_null.getTextValue());
        email_null.getTextValue().equals(email);
        pass_null.getTextValue().equals(pass);
        getDriver().manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
    }
    public void email_Null(){
        email_null.getTextValue().equals("Field is Required.");
        getDriver().getCurrentUrl().equals("https://juniorviec.com/login");
    }
    public void pass_null(){
        pass_null.getTextValue().equals("Field is Required.");
        getDriver().getCurrentUrl().equals("https://juniorviec.com/login");
    }
    public void mail_valid_pass_invalid(){
        System.out.println(email_pass_validate.getTextValue());
        email_pass_validate.getTextValue().equals("The email or password you entered is incorrect.");
        getDriver().getCurrentUrl().equals("https://juniorviec.com/login");
    }
    public void mail_invalid_pass_valid(){
        System.out.println(email_pass_validate.getTextValue());
        email_pass_validate.getTextValue().equals("The email or password you entered is incorrect.");
        getDriver().getCurrentUrl().equals("https://juniorviec.com/login");
    }
}
