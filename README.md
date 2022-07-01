# WikiAutomationFramework
Technical Assignment Given by Equinix for the role of QA Automation Engineer
- Automation framework is done with Selenium + Java as base programming language + Cucumber framework + TestNG

### Automation Test Scenarios 
1. Open Wikipedia page and change language for the page. Verify that the webpage language has changed for 10 different languages.
2. Open Wikipedia page and search for 10 different celebrities. Log the date of birth and spouse details for each of the celebrities.

### How to use 
1. Import project into Ecplise
2. Navigate to WikiFrameworkSteps.java
3. Setup path for chromedriver
4. Navigate to WikiFrameworkRunner.java
5. Right click on WikiFrameworkRunner.java, select convert to TestNG
6. Right click on testing.xml
7. Run as TestNG suite
8. Open report.html in target folder to see the results of the test

### Requirements 
Ensure all the needed jar files that have been tagged as requirement have been added to project
- Cucumber_jar_files
- chromedriver_win32 (Chromedriver) - change path to the chromedriver to the path on your computer
- selenium-java-4.2.2 + sever jar files



