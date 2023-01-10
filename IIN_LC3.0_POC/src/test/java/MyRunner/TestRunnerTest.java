package MyRunner;
 
 
import org.junit.runner.RunWith;

import com.core.Hooks;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
 
@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications=true,monochrome = true,dryRun=false,
features =
{"src/test/java/LC3_NewUserFeatures/"},
plugin =  {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 

glue = {"src/test/java/stepDefinitions_LC_ExistingUser"})    


public class TestRunnerTest extends Hooks {

	
	
}
 