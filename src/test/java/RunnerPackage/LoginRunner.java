package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\ApplicationFeatures\\FeatureFileFor1stPageLogin.feature"},
		glue = {"BDDStepsPackage"} ,
		publish = true
		)


public class LoginRunner extends AbstractTestNGCucumberTests
{
	
	

	
}
