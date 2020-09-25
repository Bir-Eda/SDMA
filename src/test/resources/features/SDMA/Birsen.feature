Feature: Birsen Tests

  @NewHirePopUp  @SDMA_3  @Birsen
  Scenario: I want to see New Hire Button on the BuffSci Home page
    Given I am on the HRStaffPage page
    When I login
    Then I wait for 1000 milliseconds
    Then I click on newHireButton
    #Then I fill new Hire Form
    Then I validate all sections are present
      |Salutation: |
      |First Name: |
      |Middle Name:  |
      |Last Name: |
      |Vacant Positions: |
      |Personal Email: |
      |Cell Phones: |
      |Choose file: |



 # @NewHire  @SDMA_4  @Birsen
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
    Then I enter "Barry Clark" in inputBox
    Then I wait for 1000 milliseconds
    Then I enter "Alex Sandy" in inputBox
    Then I wait for 1000 milliseconds
    Then I enter "Brian Walker" in inputBox
    Then I wait for 1000 milliseconds
    Then I enter "Colin Jones" in inputBox
    Then I wait for 1000 milliseconds
    Then I validate newStaffName Text is "Colin Jones"
    Then I wait for 1000 milliseconds
    Then I enter "Sara Williams" in inputBox
    Then I wait for 1000 milliseconds


#  mvn clean test verify -Dcucumber.options="--tags @InputBox" -Dplatform=windows -DtestApp=web -Dbrowser=chrome -Dmaven=mvn -PSDMA -Dapplication=sdma
#  mvn clean test verify -Dcucumber.options="--tags @NewHirePopUp" -Dplatform=windows -DtestApp=web -Dbrowser=chrome -Dmaven=mvn -PSDMA -Dapplication=sdma










    


  
  



