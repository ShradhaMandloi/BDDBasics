Feature: Signup to the application
Scenario Outline: SignUp to Appication with diff data
Given User is at the signup page
When User enters the "<name>" on form
And User enters the <age> on form
And User selects the "<gender>"
Then  User id get generate

Examples:
| name | age | gender |
| Lokesh | 30 | Male |
| Shradha | 30 | Female |
| Sarvesh | 27 | Male |
| Sourabh | 27 | Male |