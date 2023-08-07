package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\ApplicationFeatures\\Profile.feature"},
		glue= {"BDDStepsPackage","HooksPackage"},
		plugin= {"pretty"}
		
		
		)
public class ProfileRunner extends AbstractTestNGCucumberTests{

}
