package javaautomationcidemo.thucydides.cucumber.configs;

public class WebProfile {

    public String checkLang(String lang){
        lang.toLowerCase();
        if(lang.equals("EN")){
            return "EN";
        }else{
            return "VN";
        }
    }

}
