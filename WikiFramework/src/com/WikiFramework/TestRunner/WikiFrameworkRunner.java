package com.WikiFramework.TestRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.WikiFramework.Util.WikiFrameworkUtility;

import org.testng.annotations.*;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnore;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = "src/features",
		glue = {"com.WikiFramework.StepDefinition"},
		tags = "@SearchTesting or @LanguageTesting",
		plugin = {"html:target/report.html", "json:target/cucumber.json"},
		monochrome = true)
public class WikiFrameworkRunner {

	private TestNGCucumberRunner testNGCucumberRunner;
	
	@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "features")
	public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) throws Throwable {
	  // the 'featureWrapper' parameter solely exists to display the feature file in a test report
	  testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
	}
	
	@DataProvider (name = "features")
	public Object[][] features() {
		if(testNGCucumberRunner == null) {
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }
	    return testNGCucumberRunner.provideScenarios();
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
	    if (testNGCucumberRunner == null) {
	      return;
	    }
    	testNGCucumberRunner.finish();
	}
	
	@AfterSuite @JsonIgnore
	public void generateReport() {
		WikiFrameworkUtility.generateReport();
	}
}
