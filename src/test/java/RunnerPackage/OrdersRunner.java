package RunnerPackage;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"C:\\Users\\DC\\eclipse-workspace\\BDDBasics\\src\\test\\resources\\ApplicationFeatures\\Orders.feature"},
		
		glue= {"BDDStepsPackage"},
		
		plugin = {"pretty"}
		
		)

public class OrdersRunner extends AbstractTestNGCucumberTests{

	
	
}
