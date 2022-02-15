Feature: Validating ORANGEHRP


Background: I am logged into Orange Application.
Given When I click on Admin Link
Then Click on Job
And validate text – Job Title 

@Regression
Scenario: Login and Click on Admin

Given When I am in OrangeHRP Application
Then Login to Application
When Dashboard page is available
And click on Admin menu


@Smoke
Scenario: Validating Dashboard

Given When I am in OrangeHRP Application
Then Login to Application
When Dashboard page is available
And click on Admin menu

