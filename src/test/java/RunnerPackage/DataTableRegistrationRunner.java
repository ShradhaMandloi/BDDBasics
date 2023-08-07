package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\ApplicationFeatures\\DatableRegistration.feature"},
		glue = {"BDDStepsPackage"} ,
		plugin = {"pretty"}
		// dryRun =true- (by default=false)use to verify that our all steps of feature file is properly link with step defination or not.
		)

public class DataTableRegistrationRunner extends AbstractTestNGCucumberTests {

}
