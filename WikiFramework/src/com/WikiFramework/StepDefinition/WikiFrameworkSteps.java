package com.WikiFramework.StepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.WikiFramework.PageObjects.*;

public class WikiFrameworkSteps {
	
	private static WebDriver driver;
	private Scenario scenario;
	String celebrityDetails = "";
	String chosenLang = "";
	String langHref = "";
	
	//required for screenshot of results
	@Before
	public void before(Scenario scenario) {
	    this.scenario = scenario;
	}
	
	//Common step for both SearchTesting and LanguageTesing, opens the browser
	@Given("^Open chrome and navigate to wikipedia$")
	public void open_chrome_and_navigate_to_wikipedia() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aries\\Desktop\\jar files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Wiki");
	}
	
	//search for celebrity name
	@When ("^Search for celebrity name \\\"(.*?)\\\"$")
	public void search_for_celebrity_name(String celebrityName) {
		
		celebrityDetails = celebrityName;
		WikiDefaultPage defaultPage = new WikiDefaultPage(driver);
		defaultPage.searchAndClick(celebrityName);
	}
	
	//Validate search results
	@Then ("^Ensure search is correct$")
	public void ensure_search_is_correct() {
		WikiSearchResultPage searchResult = new WikiSearchResultPage(driver);
		Assert.assertEquals(searchResult.getCelebrityName(), celebrityDetails);
	}
	
	//Log celebrity date of birth
	@Then ("^Get Celebrity date of birth$")
	public void get_celebrity_date_of_birth() {
		
		WikiSearchResultPage searchResult = new WikiSearchResultPage(driver);
		String dateOfBirth = searchResult.getDOB();
		celebrityDetails = celebrityDetails + " | Date of birth is : [ " + dateOfBirth + " ] ";
	}
	
	//Log celebrity spouse details
	@And ("^Get spouse details$")
	public void get_spouse_details() {
		
		WikiSearchResultPage searchResult = new WikiSearchResultPage(driver);
		String spouseDetails = searchResult.getSpouse();
		celebrityDetails = celebrityDetails + " Spouse details : [ " + spouseDetails + " ] ";
	}
	
	//Write log details to report.html
	@Then("^Log search results$")
	public void log_search_results() {
		
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    scenario.attach(screenshot, "image/png", "Celebrtity searched : " + celebrityDetails);
		driver.quit();
	}
	
	//Change language for webpage to selection
	@When ("^Language for webpage is changed to \\\"(.*?)\\\"$")
	public void language_for_webpage_is_changed_to(String language) {
		
		chosenLang = language;
		WikiDefaultPage langSelector = new WikiDefaultPage(driver);
		langHref = langSelector.getLangCode(language);
		langSelector.changeLanguage(language);
	}
	
	//Ensure webpage language is changed by validating the URL
	@Then ("^Ensure webpage language is changed to selected language$")
	public void ensure_webpage_language_is_changed_to_selected_language() {
		
		String expectedURL = langHref;
		Assert.assertEquals(expectedURL, driver.getCurrentUrl());
	}
	
	//Screenshot change results
	@Then("^Log language change results$")
	public void log_language_change_results() {
		
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    scenario.attach(screenshot, "image/png", "Webapge Language : " + chosenLang);
		driver.quit();
	}
}
