Feature: Registration of Bank account
Scenario: User information  adition
Given User should be at registration page
When User enters the following details
| Shradha | Mandloi | shraddhamandloi@gmail.com | 9875631255 |
| Lokesh | Mandloi | lokeshmandloi@gmail.com | 9857946851 |
| Pooja | gupta | poojagupta@gmail.com | 8547896521 |
Then User should get registration confirmation