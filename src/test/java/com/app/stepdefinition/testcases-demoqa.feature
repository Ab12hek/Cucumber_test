Feature: Practice form validation

  @aslist
  Scenario: Validate the practice form
    Given Load the URL "https://demoqa.com/automation-practice-form"
    When Enter first name "Abishek"
    And Enter last name "Naganathan"
    And Enter email address "abisheknaganathan@gmail.com"
    And Select gender
    And Enter mobile number "9529547539"
    #And Enter DOB "12 Jun 1996"
    And Enter Subjects
    |Accounting|
    |Arts|
    |Biology|
    |Chemistry|
    |Civics|
    |Computer Science|
    |Commerce|
    |Economics|
    |English|
    |Hindi|
    |History|
    |Maths|
    |Physics|
    |Social Studies|
    And Select Hobbies
    And Enter current address "Chennai, TamilNadu, India."
    And Select State "NCR"
    And Select City "Delhi"
    And Click submit
    Then Validate the outcomes
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
