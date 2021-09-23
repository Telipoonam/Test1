package cucumberJava;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

	features = {"classpath:FeaturesFile\\login.feature"},
	glue={"cucmberJava.Login "}
	//plugin = {"pretty","html:target/cucumber-html-report"}
	
	)
public class Gluecode{
	
}

			

