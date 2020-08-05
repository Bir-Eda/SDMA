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

    # mvn clean test verify -Dcucumber.options="--tags @Birsen" -Dplatform=windows -DtestApp=web -Dbrowser=chrome -Dmaven=mvn -PSDMA -Dapplication=sdma