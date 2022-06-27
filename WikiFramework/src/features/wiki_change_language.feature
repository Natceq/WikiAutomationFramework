@LanguageTesting
Feature: Change language for Wikipage and verify that it has changed	
	Scenario: Change language to Pangasinan
		Given Open chrome and navigate to wikipedia
		When Language for webpage is changed to "Pangasinan"
		Then Ensure webpage language is changed to selected language
		Then Log language change results
		
	Scenario: Change language to Malay
		Given Open chrome and navigate to wikipedia
		When Language for webpage is changed to "Bahasa Melayu"
		Then Ensure webpage language is changed to selected language
		Then Log language change results
		
	Scenario: Change language to Bahasa Indonesia
		Given Open chrome and navigate to wikipedia
		When Language for webpage is changed to "Bahasa Indonesia"
		Then Ensure webpage language is changed to selected language
		Then Log language change results
		
	Scenario: Change language to Banjar
		Given Open chrome and navigate to wikipedia
		When Language for webpage is changed to "Banjar"
		Then Ensure webpage language is changed to selected language
		Then Log language change results
		
	Scenario: Change language to Italiano
		Given Open chrome and navigate to wikipedia
		When Language for webpage is changed to "Italiano"
		Then Ensure webpage language is changed to selected language
		Then Log language change results
		
	Scenario: Change language to Polski
		Given Open chrome and navigate to wikipedia
		When Language for webpage is changed to "Polski"
		Then Ensure webpage language is changed to selected language
		Then Log language change results
		
	Scenario: Change language to Scots
		Given Open chrome and navigate to wikipedia
		When Language for webpage is changed to "Scots"
		Then Ensure webpage language is changed to selected language
		Then Log language change results
		
	Scenario: Change language to Lingua Franca Nova
		Given Open chrome and navigate to wikipedia
		When Language for webpage is changed to "Lingua Franca Nova"
		Then Ensure webpage language is changed to selected language
		Then Log language change results
		
	Scenario: Change language to Sunda
		Given Open chrome and navigate to wikipedia
		When Language for webpage is changed to "Sunda"
		Then Ensure webpage language is changed to selected language
		Then Log language change results
		
	Scenario: Change language to Interlingua
		Given Open chrome and navigate to wikipedia
		When Language for webpage is changed to "Interlingua"
		Then Ensure webpage language is changed to selected language
		Then Log language change results