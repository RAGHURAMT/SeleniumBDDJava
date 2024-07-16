# Selenium Cucumber Test Automation Framework

## Project Structure

selenium-cucumber-framework
├── .github
│   └── workflows
│       └── ci.yml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── pageObjects
│   │   │       ├── BasePage.java
│   │   │       ├── HomePage.java
│   │   │       └── SearchPage.java
│   │   └── resources
│   │       └── config
│   │           └── urls.properties
│   ├── test
│   │   ├── java
│   │   │   ├── stepDefinitions
│   │   │   │   ├── HomepageSteps.java
│   │   │   │   └── SearchSteps.java
│   │   │   ├── testRunner
│   │   │   │   └── CucumberTestRunner.java
│   │   │   └── utils
│   │   │       ├── CommonMethods.java
│   │   │       └── ConfigReader.java
│   │   └── resources
│   │       └── features
│   │           ├── homepage.feature
│   │           └── search.feature
├── .gitignore
├── pom.xml
└── README.md

## Prerequisites:
Java JDK latest
Maven latest
Git

## Setup:
1. Clone the repository
2. Install dependencies: mvn clean install

## To run the tests:
1. To run tests using Maven, use the following command: mvn clean test
2. To run tests using TestNG, you can execute the CucumberTestRunner class located in src/test/java/testRunner CucumberTestRunner.java.
3. To run tests using Eclipse - 
    a. Right-click on the CucumberTestRunner class. 
    b. Select Run As > TestNG Test.

## Continuous Integration
This project is set up to run tests on GitHub Actions. The configuration file is located at .github/workflows/ci.yml. GitHub Actions will automatically trigger the CI pipeline defined in .github/workflows/ci.yml to run the tests on every push.

## Slack integration
Integrated with the Slack to share the test reports on a Slack channel on every run. Note:

Please note that tests will fail on the github actions tab if you miss to add your Slack webhook under Settings -> Security -> Actions
If you dont like to do the slack integration, please comment the Slack Notification block in ci.yml
