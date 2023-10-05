package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/features"},
		glue = {"stepdefination"},
		monochrome = true,
		dryRun=true
		
)
	
public class Runner {

}
