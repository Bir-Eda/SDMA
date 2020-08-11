Feature: Birsen Tests

  @NewHire  @SDMA_4  @Birsen
  Scenario: Fill ne worker`s information, save and validate it
    Given I am on the HRStaffPage page
    When I login
    Then I wait for 1000 milliseconds
    Then I click on newHireButton
    Then  NewHire module will be visible
    Then I fill new employee's information on NewHire window
    And I click on newHireSave
    Then I click on buffSciButton
    Then I validate that new employee is in the staff list

  @Salutation  @SDMA_6 @Birsen
   Scenario: I want to see select under the Salutation on the New Hire Pop-Up page.
    Given I am on the HRStaffPage page
    When I login
    Then I wait for 1000 milliseconds
    When I click on newHireButton
    Then I wait for 1000 milliseconds
    Then I click on salutationDropDown
    Then I wait for 1000 milliseconds
    Then I validate the salutationDropDownList with below
    |-- Select --|
    |Ms.   |
    |Mrs.  |
    |Miss  |
    |Mr.   |
    |Dr.   |


  @InputBox  @SDMA_9  @Birsen
  Scenario: I want to see Search Input-Box under the Staff list, search workers by their names.
    Given I am on the HRStaffPage page
    When I login
    Then I wait for 1000 milliseconds
    When I click on inputBox
    Then I wait for 1000 milliseconds
    Then I enter "Ezgi M. Sari" in inputBox
    Then I wait for 1000 milliseconds
    Then I enter "Anna Jenkins" in inputBox
    Then I wait for 1000 milliseconds
    Then I enter "Bill Rej" in inputBox
    Then I wait for 1000 milliseconds
    Then I enter "Denise Wood" in inputBox
    Then I wait for 1000 milliseconds
    Then I enter "Jason Cook" in inputBox
    Then I wait for 1000 milliseconds
    Then I validate newStaffName Text is "Jason Cook"
    Then I wait for 1000 milliseconds
    Then I enter "Sara King" in inputBox
    Then I wait for 1000 milliseconds













    


  
  



