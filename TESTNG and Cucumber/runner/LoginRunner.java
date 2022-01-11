package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdefintion.BaseClass;

@CucumberOptions(features="src/test/java/feature/T5_DuplicateLead.feature",glue="stepdefintion",
					monochrome=true, publish=true )//tags="@Functional")


public class LoginRunner extends BaseClass{

}
