This project is written in java and will serve an example of implementing a SeleniumWebdriver test project with Maven. Everything is set up and tests can be added straight away. Used Testrunner or maven goals to execute the tests. Steps are mentioned below.

# Environment Setup

1. Install Java
2. Install Selenium
3. All the dependencies are added in POM.xml
4. Get an IDE (This project was developed using Eclipse Mars)


# Running the tests
Tests can be executed in following two ways

1. TestRunner file - From IDE itself as plain JUnit test
2. Through Maven Goals - mvn test or mvn install

# Project Model
Page Objects Pattern
page object pattern is used to have reusable WebElements/small helper methods separated from actual test classes and give the opportunity to have nice structured and easily readable tests


# Framework

Cucumber-BDD framework is used for this project.

# Built Tool
Maven and pom.xml is updated with all the dependencies and plugins required.

# Logging

Log4J framework is used for logging.
Logs can be found in project in base directory under folder logs

# Reporting

Cucumber HTML reports are used for reporting
