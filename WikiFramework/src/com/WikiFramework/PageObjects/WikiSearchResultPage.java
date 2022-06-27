package com.WikiFramework.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikiSearchResultPage {
	
	WebDriver driver;
	By DOB = By.className("bday");
	By spouseDetailsList = By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table/tbody/tr[7]/td");
	By nameOfCelebrity = By.className("fn");
	
	public WikiSearchResultPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public String getCelebrityName() {
		
		String name = driver.findElement(nameOfCelebrity).getAttribute("innerHTML");
		return name;
	}
	
	public String getDOB() {
		
		String dateOfBirth = driver.findElement(DOB).getAttribute("innerHTML");
		return dateOfBirth;
	}
	
	public String getSpouse() {
		
		String spouse = driver.findElement(spouseDetailsList).getText();
		return spouse;
	}
}
