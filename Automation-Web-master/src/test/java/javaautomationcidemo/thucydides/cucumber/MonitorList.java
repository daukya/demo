package javaautomationcidemo.thucydides.cucumber;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = {"src/test/resources/features/Removeuser/MonitorList.feature"},
        tags = {"@2"}
)
public class MonitorList {
}
