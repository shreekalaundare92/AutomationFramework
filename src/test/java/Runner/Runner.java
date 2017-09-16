package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\Resources",
		glue="Stepdef",
		tags= {"@Chrome"},
		dryRun=true  //to check if all steps have stepdef or not, making it false
		
		
		)
public class Runner {

}
