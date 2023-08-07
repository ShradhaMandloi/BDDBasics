package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\ApplicationFeatures\\LoginWithData.feature"},
		glue = {"BDDStepsPackage"} ,
		publish = true
		)


public class LoginWithDataRunner extends AbstractTestNGCucumberTests

 {

	
	
}
