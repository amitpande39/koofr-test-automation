# Koofr tests developed with Java and Cucumber

# Overview of scenario:

- Login
- Create New Folder
- Upload multiple Documents (2 documents)
- Clean up - Delete a folder containing documents
- Logout
- Assertions
  - User logged in successfully
  - Folder created successfully
  - Document uploaded and matched the total count of uploaded documents
  - Folder deleted successfully
  - Logout successful

# Assumption

- I have developed this project on Mac machine so have not test it on windows OS.

# Test Execution

- Prerequisite : Please ensure to install following on your machine
  - Java
  - IntelliJ or similar editor

* Checkout this project
* Open the project in IntelliJ or similar editor
* Perform `mvn clean install` from root (dropbox-tests) directory
* Perform `mvn test` to execute tests
