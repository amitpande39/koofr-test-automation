# Koofr tests developed with Java and Cucumber

# Overview of scenario:

- Login
- Create New Folder
- Upload multiple Documents (2 documents)
- Clean up - Delete the folder containing documents
- Logout
- Assertions
  - User logged in successfully
  - Folder created successfully
  - Document uploaded and matched the total count of uploaded documents
  - Folder deleted successfully
  - Logout successful

# Assumption

- I have developed this project on Mac machine so have not tested it on windows OS.

# Test Execution

- Prerequisite : Please ensure to install following on your machine
  - Java
  - IntelliJ or similar editor

* Checkout this project
* Open the project in IntelliJ or similar editor
* Perform `mvn clean install` from root (koofr) directory
* Perform `mvn test` to execute tests

# Improvements/Limitation
* At the moment, default native window dialog does not close however it does not interfere with the page actions 
and test execute successfully.

# Troubleshooting
* if you are using MAC and get chromedriver related error
then you need to give permission to access `ChromeDriver`
from `System Preference` >> `Security & Privacy`  >> `Allow apps to download` 
and select `App store and identified developers`