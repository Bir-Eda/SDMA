Feature: Birsen Tests

  @NewHire  @SDMA_4  @Birsen
  Scenario: Fill ne worker`s information, save and validate it
    Given I am on the HRStaffPage page
    When I login
    Then I wait for 1000 milliseconds
    Then I click on newHireButton
    Then I validate newHireButton is displayed


  @JobBox_Department_List  @SDMA_10  @Birsen
  Scenario: Fill new worker`s information, save and validate it
    Given I am on the HRStaffPage page
    When I login
    #Then I wait for 1000 milliseconds
    Then I click on jobBox
    Then I select 25. option from jobBox dropdown
    Then I wait for 1000 milliseconds
    Then I click on emailInputBoxTag
    Then I wait for 1000 milliseconds

  @Positions  @SDMA_22  @Birsen
  Scenario: Fill new worker`s information, save and validate it
    Given I am on the HRStaffPage page
    When I login
    Then I wait for 1000 milliseconds
    Then I click on homeBuffSci
    Then I wait for 1000 milliseconds
    Then I click on positionsMenu
    Then I wait for 2000 milliseconds
    Then I click on addNewPositions
    Then I validate addNewPositionsPopup is displayed

    #
    #Then I wait for 3000 milliseconds
















 # mvn clean test verify -Dcucumber.options="--tags @NewHire" -Dplatform=windows -DtestApp=web -Dbrowser=chrome -Dmaven=mvn -PSDMA -Dapplication=sdma
# mvn clean test verify -Dcucumber.options="--tags @Positions" -Dplatform=windows -DtestApp=web -Dbrowser=chrome -Dmaven=mvn -PSDMA -Dapplication=sdma