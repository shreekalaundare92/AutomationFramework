Feature: Verify link on homepage

@Chrome
Scenario: Verify links on homepage by clicking on it
Given "Chrome" browser is launched
Then open URL "https://the-internet.herokuapp.com" 
And Verify "Home page" page
Then Click on "A/B Testing" link
And Verify "abtest" page
Then close browser

@FF
Scenario: Verify links on homepage by clicking on it
Given "firefox" browser is launched
Then open URL "https://the-internet.herokuapp.com" 
And Verify "Home page" page
Then Click on "A/B Testing" link
And Verify "abtest" page
Then close browser

@IE
Scenario: Verify links on homepage by clicking on it
Given "IE" browser is launched
Then open URL "https://the-internet.herokuapp.com" 
And Verify "Home page" page
Then Click on "A/B Testing" link
And Verify "abtest" page
Then close browser