package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


        @RunWith(Cucumber.class)
        @CucumberOptions(
		features = "E:\\automation\\workspace\\Cucumber\\src\\main\\java\\Features\\login.feature", //the path of the feature files
		glue={"stepDefinitions"},
		format= {"pretty","html:test-outout"}
		//the path of the step definition files
			
		)
	public class TestRunner {
		
	}


