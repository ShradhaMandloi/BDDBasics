package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = {"src\\test\\resources\\ApplicationFeatures\\ScenarioOutine.feature"},
		glue= {"BDDStepsPackage"},
		plugin = {"pretty"}
		)



public class ScenarioRunner extends AbstractTestNGCucumberTests {

}
