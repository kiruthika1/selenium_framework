**Demo- Selenium Framework**

**Overview**
The framework is designed to work with Java, Selenium Web Driver, Testng and Maven


**Running the tests**
-Tests can be executed individually
-Tests can be executed via the testng.xml file
-Tests can be executed via mvn commands

**Positives**
-The source code, tests and resources are set up as separate folders so it can be eaisly maintained
-Testng and Assertj asseryions are quite useful for validations, giving priorities and setting up the flow of tests
-Made some progress with ThreadLocal method to set up parallel execution of tests
-Reusability and abstraction are the main concepts on the framework for making it robust

**Improvements**
-Properties and Utils could be enhanced further to completely isolate the config parameters from the actual code making it easier for people with less technical background to execute it too. This will be an added advantage while incorporating the tests as part of CI/CD pipelines
-Data providers could be used to handle the test data management aspects and increasing the coverage of the tests with minimal efforts
-Implementaion of selenium grid would enable cross browser and device testing


