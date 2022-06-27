@SearchTesting
Feature: Search for celebrity name and log date of birth and spouse details
	Scenario: Search for Celebrity Tom Cruise
		Given Open chrome and navigate to wikipedia
		When Search for celebrity name "Tom Cruise"
		Then Ensure search is correct
		Then Get Celebrity date of birth
		And Get spouse details
		Then Log search results
    
  Scenario: Search for Celebrity Chris Hemsworth
		Given Open chrome and navigate to wikipedia
		When Search for celebrity name "Chris Hemsworth"
		Then Ensure search is correct
		Then Get Celebrity date of birth
		And Get spouse details
		Then Log search results
		
  Scenario: Search for Celebrity Johnny Depp
		Given Open chrome and navigate to wikipedia
		When Search for celebrity name "Johnny Depp"
		Then Ensure search is correct
		Then Get Celebrity date of birth
		And Get spouse details
		Then Log search results
		
	Scenario: Search for Celebrity Leonardo DiCaprio
		Given Open chrome and navigate to wikipedia
		When Search for celebrity name "Leonardo DiCaprio"
		Then Ensure search is correct
		Then Get Celebrity date of birth
		And Get spouse details
		Then Log search results
		
	Scenario: Search for Celebrity Nicolas Cage
		Given Open chrome and navigate to wikipedia
		When Search for celebrity name "Nicolas Cage"
		Then Ensure search is correct
		Then Get Celebrity date of birth
		And Get spouse details
		Then Log search results
		
	Scenario: Search for Celebrity Ryan Reynolds
		Given Open chrome and navigate to wikipedia
		When Search for celebrity name "Ryan Reynolds"
		Then Ensure search is correct
		Then Get Celebrity date of birth
		And Get spouse details
		Then Log search results
		
	Scenario: Search for Celebrity Dwayne Johnson
		Given Open chrome and navigate to wikipedia
		When Search for celebrity name "Dwayne Johnson"
		Then Ensure search is correct
		Then Get Celebrity date of birth
		And Get spouse details
		Then Log search results
		
	Scenario: Search for Celebrity Ben Affleck
		Given Open chrome and navigate to wikipedia
		When Search for celebrity name "Ben Affleck"
		Then Ensure search is correct
		Then Get Celebrity date of birth
		And Get spouse details
		Then Log search results
		
	Scenario: Search for Celebrity Mark Ruffalo
		Given Open chrome and navigate to wikipedia
		When Search for celebrity name "Mark Ruffalo"
		Then Ensure search is correct
		Then Get Celebrity date of birth
		And Get spouse details
		Then Log search results
	
	Scenario: Search for Celebrity Jim Carrey
		Given Open chrome and navigate to wikipedia
		When Search for celebrity name "Jim Carrey"
		Then Ensure search is correct
		Then Get Celebrity date of birth
		And Get spouse details
		Then Log search results
		
		