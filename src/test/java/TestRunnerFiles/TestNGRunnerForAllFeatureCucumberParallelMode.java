package TestRunnerFiles;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\TestAutoamtionCucumber\\src\\test\\java\\FeatureFiles",glue = "StepDefinitionFile", monochrome = true,plugin = {"pretty","html:Reports/FeatureCucumberLearnAllParallel.html"})
public class TestNGRunnerForAllFeatureCucumberParallelMode extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
