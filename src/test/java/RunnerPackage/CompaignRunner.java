package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\ApplicationFeatures\\Compaign.feature"},
		glue= {"BDDStepsPackage"},
		plugin= {"pretty"}
		//tags = "@MiddleFunctionality"  // proper output
		//tags= "@Profile or @Validation"   // proper output
		//tags = "@Profile and @MiddleFunctionality"  // proper output
		//tags= "not(@Profile or  @MiddleFunctionality)" // proper output
		//tags= "not @Profile"   // proper output
		//tags="(not @Profile and not @MiddleFunctionality)" // proper output
		//tags= "@CompaignFeature"
		)


public class CompaignRunner extends AbstractTestNGCucumberTests{

}
