package TestRunnerFiles;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

@Test
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\TestAutoamtionCucumber\\src\\test\\java\\FeatureFiles\\FeatureOfLearnWithSelenium.feature",glue = "StepDefinitionFile", monochrome = true,plugin = {"pretty","html:Reports/TestRunnerOfSeleniumLearnFeature.html"})
public class TestRunnerOfSeleniumLearnFeature extends AbstractTestNGCucumberTests {

}
