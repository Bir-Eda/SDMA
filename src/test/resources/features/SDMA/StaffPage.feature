Feature:SDMA-3 verify New Hire
@Esra @Sprint1
  Scenario:I validate new hire button and validate function of the information request oxes in the new hire ta

    Given I am on the HRStaffPage page
    Then  I login as Admin
    When  I click on NewHire button
    Then  NewHire module will be visible
    When  I enter valid data on the NewHireModule
    Then  I click the save button
    Then  I validate the newHire
