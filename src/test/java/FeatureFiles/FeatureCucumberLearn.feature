Feature: Normal searched item name is equal to Top deals page item name
Background:
Given open website

Scenario: 
When search
Then appears searched product

Scenario: 
When search in deals page
Then searched product is equal to searched product in deals

