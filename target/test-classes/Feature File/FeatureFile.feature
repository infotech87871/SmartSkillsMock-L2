Feature:
To Validate the Login functionality of Facebook
Scenario Outline:
  To login valid Username and valid Password
  Given Launch the url into the Browser
  When To pass valid username "<username>" into Email Field
  And To pass valid password "<password>" into password Field
  And To Click the Login Button
  Then Close the Browser
  Examples:
  |username|password|
  |ashbf123|asdfg|
  |voimuh34|fnkji|
