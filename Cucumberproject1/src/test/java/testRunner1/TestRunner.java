package testRunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\padmaja.alavala\\eclipse-workspace\\Cucumberproject1\\src\\test\\java\\featurefolder1\\demotoursLogin.feature"
,glue= {"StepDefs1"}
,plugin = {"pretty","json:target/cucumber-reports/Cucumber.json"}
,monochrome = true)

public class TestRunner {

}
