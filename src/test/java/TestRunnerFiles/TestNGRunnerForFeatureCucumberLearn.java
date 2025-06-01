package TestRunnerFiles;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\TestAutoamtionCucumber\\src\\test\\java\\FeatureFiles\\FeatureCucumberLearn.feature",glue = "StepDefinitionFile", monochrome = true,plugin = {"pretty","html:target/FeatureCucumberLearn.html"})
public class TestNGRunnerForFeatureCucumberLearn extends AbstractTestNGCucumberTests {

}
