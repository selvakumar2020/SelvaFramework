package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\eclipse-workspace\\Cucumber\\src\\test\\java\\features\\login.feature",glue="stepDefinitions")
public class TestRunner {
	
	
}
