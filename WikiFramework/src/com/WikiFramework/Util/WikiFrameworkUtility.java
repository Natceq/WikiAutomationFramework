package com.WikiFramework.Util;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnore;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.json.support.Status;
import net.masterthought.cucumber.presentation.PresentationMode;

public class WikiFrameworkUtility {
	
	@JsonIgnore
	public static void generateReport() {
		File reportOutputDirectory = new File("target");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("target/cucumber.json");

		String buildNumber = "1";
		String projectName = "WikiAutomation";

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		// optional configuration - check javadoc for details
		configuration.addPresentationModes(PresentationMode.RUN_WITH_JENKINS);
		
		// do not make scenario failed when step has status SKIPPED
		configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
		
		configuration.setBuildNumber(buildNumber);
		
		// addidtional metadata presented on main page
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Firefox");
		configuration.addClassifications("Branch", "release/1.0");

		// optionally specify qualifiers for each of the report json files
        configuration.addPresentationModes(PresentationMode.PARALLEL_TESTING);
        configuration.setQualifier("cucumber-report-1","First report");

        ReportBuilder reportBuilder=new ReportBuilder(jsonFiles,configuration);
        @SuppressWarnings("unused")
		Reportable result=reportBuilder.generateReports();

	}
}
