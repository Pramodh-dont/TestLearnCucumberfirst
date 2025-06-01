package TestRunnerFiles;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\TestAutoamtionCucumber\\src\\test\\java\\FeatureFiles",glue = "StepDefinitionFile", monochrome = true,plugin = {"pretty","html:Reports/FeatureCucumberLearnAll.html"})
public class TestNGRunnerForAllFeatureCucumber extends AbstractTestNGCucumberTests{

}
