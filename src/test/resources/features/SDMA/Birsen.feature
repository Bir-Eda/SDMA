Feature: Birsen Tests

  @NewHire   @Birsen
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

  @Salutation  @SDMA_6
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










# mvn clean test verify -Dcucumber.options="--tags @Salutation" -Dplatform=windows -DtestApp=web -Dbrowser=chrome -Dmaven=mvn -PSDMA -Dapplication=sdma
# mvn clean test verify -Dcucumber.options="--tags @Birsen" -Dplatform=windows -DtestApp=web -Dbrowser=chrome -Dmaven=mvn -PSDMA -Dapplication=sdma
# # mvn clean test verify -Dcucumber.options="--tags @NewHire" -Dplatform=windows -DtestApp=web -Dbrowser=chrome -Dmaven=mvn -PSDMA -Dapplication=sdma