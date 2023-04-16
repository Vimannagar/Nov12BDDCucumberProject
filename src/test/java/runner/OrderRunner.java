package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest"},
		
		glue = {"steps", "hooks"},
		
		plugin = {"pretty"}
	
		
		)




public class OrderRunner extends AbstractTestNGCucumberTests{

}
