package com.WikiFramework.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WikiDefaultPage {
	
	WebDriver driver;
	
	By searchBar = By.id("searchInput");
	By searchButton = By.id("searchButton");
	By moreLangButton = By.xpath("/html/body/div[4]/div[2]/nav[6]/div/ul/button");
	By langSearchBar = By.xpath("/html/body/div[1]/div[1]/div/div/input[2]");
	
	public WikiDefaultPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void searchAndClick (String name) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(searchBar));
		driver.findElement(searchBar).sendKeys(name);
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		driver.findElement(searchButton).click();
	}
	
	public String getLangCode(String language) {
		
		String getLangID = "";
		getLangID = driver.findElement(By.linkText(language)).getAttribute("href");
		return getLangID;
	}
	
	public void changeLanguage (String language) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		By selectLang = By.linkText(language);
		wait.until(ExpectedConditions.elementToBeClickable(moreLangButton));
		driver.findElement(moreLangButton).click();
		wait.until(ExpectedConditions.elementToBeClickable(langSearchBar));
		driver.findElement(langSearchBar).sendKeys(language);
		wait.until(ExpectedConditions.elementToBeClickable(selectLang));
		driver.findElement(selectLang).click();
	}	
}
