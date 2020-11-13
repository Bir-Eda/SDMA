Feature: Birsen Tests

  #@NewHire  @SDMA_4  @Birsen
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

  @EditBasicInfoNewWorker @SDMA_19 @Birsen
  Scenario: New Worker`s information edit and save
    Given I am on the HRStaffPage page
    When I login
    #Then I click on homeBuffSci
    Then I select a worker`s name from staffList
    Then I wait for 3000 milliseconds
    Then I click on editBasicInfo
    Then I wait for 3000 milliseconds
    Then I edit worker`s information
    Then I wait for 3000 milliseconds
    Then I click on editBasicInfoSave
    Then I wait for 3000 milliseconds
    Then I check worker`s information changed
    Then I wait for 3000 milliseconds

  @DeletePop-UpNotif  @SAMA_26  @Birsen
  Scenario: Click the delete button on the Position subpage
    Given I am on the HRStaffPage page
    When I login
    Then I click on positionsMenu
    Then I click on selectLocationPosition
    Then I click on selectDistrict
    Then I wait for 1000 milliseconds
    Then I click on selectPositionId
    Then I wait for 1000 milliseconds
    Then I click on selectCFO
    Then I click on positionsStatus
    Then I click on positionsStatusTwo
    Then I wait for 1000 milliseconds
    Then I click on trashButton
    Then I click on positionsDeleteMenu
    Then I wait for 5000 milliseconds

  @AddNewPosition  @SAMA_27  @Birsen
  Scenario: Add new position
    Given I am on the HRStaffPage page
    When I login
    Then I click on addNewButton
    Then I validate addNewPositionPop is enabled
    Then I click on newPositionTitle
    Then I select 2. option from newPositionTitle dropdown






















# mvn clean test verify -Dcucumber.options="--tags @DeletePop-UpNotif" -Dplatform=windows -DtestApp=web -Dbrowser=chrome -Dmaven=mvn -PSDMA -Dapplication=sdma
# mvn clean test verify -Dcucumber.options="--tags @Positions" -Dplatform=windows -DtestApp=web -Dbrowser=chrome -Dmaven=mvn -PSDMA -Dapplication=sdma
# mvn clean test verify -Dcucumber.options="--tags @EditBasicInfoNewWorker" -Dplatform=windows -DtestApp=web -Dbrowser=chrome -Dmaven=mvn -PSDMA -Dapplication=sdma
#mvn clean test verify -Dcucumber.options="--tags @AddNewPositions" -Dplatform=windows -DtestApp=web -Dbrowser=chrome -Dmaven=mvn -PSDMA -Dapplication=sdma














