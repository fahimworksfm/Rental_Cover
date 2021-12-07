Feature: Get an instant quote

Scenario Outline: Rent a car and fetch the quote

Given I am on rental cover homepage
When I enter my "<country>" 
And I click on from date picker box
And I Select the from date
And I Select the to date
And I click on vehicle type change button
And I Select car
And I Click on get your instant quote
Then I land on Policy Information & Payment page

Examples:

| country            |
| United States      |
