Feature: Login Page Validation

@tag1
  Scenario: validate the valid login creadentials
    Given Load the given URL "https://adactinhotelapp.com/"
    When Enter the valid username "daisyrubycatharine"
    And Enter the valid password "RP65IQ"
    And Click the login button
    Then Validate the select hotel page
    
@tag2
  Scenario: validate the valid login creadentials
    Given Load the given URL "https://adactinhotelapp.com/"
    When Enter the valid username "daisyrubycatharine1"
    And Enter the valid password "RP65IQ1"
    And Click the login button
    Then Validate the select hotel page
