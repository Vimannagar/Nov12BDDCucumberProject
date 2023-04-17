package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			
			features = {"src\\test\\resources\\applicationtest\\ProfilePicture.feature"},
			
			glue = {"steps", "taghooks"},
			
			plugin = {"pretty"},
			
			tags = "@sanity"
			
			)
	
	
	
	
	public class ProfilePicRunner extends AbstractTestNGCucumberTests{
	
	}
