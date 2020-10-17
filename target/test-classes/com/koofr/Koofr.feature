Feature: Koofr Upload Document Testing

  Scenario: Create a new folder and upload two documents
    Given I navigate to dropbox login page
    When I enter email address in email field with "amitpande1899@gmail.com" and password with "chiki3939"
    And I create a new folder and upload multiple documents in the new folder successfully
#    And I create a new "Bills" folder
#    Then I upload multiple documents to test folder successfully
