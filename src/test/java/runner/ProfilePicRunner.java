package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			
			features = {"src\\test\\resources\\applicationtest\\ProfilePicture.feature"},
			
			glue = {"steps"},
			
			plugin = {"pretty"},
			
			tags = "@functional or @regression"
			
			)
	
	
	
	
	public class ProfilePicRunner extends AbstractTestNGCucumberTests{
	
	}
