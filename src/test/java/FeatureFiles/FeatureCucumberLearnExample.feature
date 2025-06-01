Feature: Card payment selection page with Different card holder

Scenario Outline: 
Given Open website
When login with card "<username>" and "<password>"
Then Card related options should visible
Examples: 
| username | password |
| PramodhCredit | 2345 |
| PramodhDebit | 4532 |

Scenario:
Given Open signup website
When SignUp user
| Pramodh | 
| D M | 
| Male|
Then Account created