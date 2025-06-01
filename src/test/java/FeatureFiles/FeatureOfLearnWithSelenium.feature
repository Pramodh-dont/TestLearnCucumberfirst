Feature: Testing the search page item and deals page item

Scenario:
Given User should open website
When User search 'Tom' product in home page
Then Searched product in home page is available and fetch its name

Scenario:
Given User should open website
When User search 'Tom' product in deals page
Then Searched product in deals page is available and fetch its name

Scenario:
Then Home search product name should equal to deals page product name 