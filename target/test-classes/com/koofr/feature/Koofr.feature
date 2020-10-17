Feature: Koofr Upload Document Testing

  Scenario: Create a new folder and upload two documents
    Given I navigate to koofr login page
    When I enter email address in email field with "amitpande1899@gmail.com" and password with "chiki3939"
    And I create a new folder "Bills"
    Then I upload "2" documents, "MobileBill.pdf" and "ElectricityBill.pdf" into the new folder successfully

