@TestHomePage
Feature: HomePage 

Background:
Given User is on Retail website

Scenario: User verify currency values change
When User click on Currency
And User chose Euro from dropdown
Then Currency value should change to Euro

Scenario: User empty Shopping cart message displays
When User click on shopping cart
Then “Your shopping cart is empty!” message should display




