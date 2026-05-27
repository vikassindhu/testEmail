
# API Automation Framework (REST Assured + Cucumber + JAVA)

This project is a **API(https://api.restful-api.dev/objects)  automation test framework** built using **Java, Restassured, Cucumber (BDD)**, following **POJO ** and **best practices** for scalability, readability, and maintainability.


## Tech Stack

- **Language:** Java 
- **Automation Tool:** Restassuerd library 
- **BDD Framework:** Cucumber 
- **Test Runner:** TestNG
- **Build Tool:** Maven
- **Design Pattern:** POJO
- **IDE:** IntelliJ IDEA
- **JSON Processing**Jackson  2.15.2
- **Version Control**  Git & GitHub

## Project Structure

```text
BE_API_Automation                          # REST Assured API Automation Framework
│
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           ├── requestPojo            # Request POJO classes
│   │           │   ├── CreateObject.java
│   │           │   └── CreateUser.java
│   │           │
│   │           └── responsePojo           # Response POJO classes
│   │               └── CreateObjectResponse.java
│
├── src
│   ├── test
│   │   ├── java
│   │   │   ├── runner                     # TestNG + Cucumber runner
│   │   │   │   └── TestRunner.java
│   │   │   │
│   │   │   ├── steps                      # Step Definitions
│   │   │   │   └── CreateObjectSteps.java
│   │   │   │
│   │   │   └── utility                    # Framework utilities
│   │   │       ├── ConfigReader.java      # Reads config.properties
│   │   │       ├── BaseSpecification.java # Request & Response SpecBuilder
│   │   │       └── ApiEndpoints.java      # API endpoint constants
│   │   │
│   │   └── resources
│   │       ├── config.properties          # Environment configuration
│   │       └── allfeature                 # Cucumber feature files
│   │           └── createObject.feature
│
├── reports                                # Test execution reports
│   ├── cucumber-report.html
│   ├── cucumber-report.json
│   └── cucumber-report.xml
│
├── pom.xml                                # Maven dependencies
├── testng.xml                             # TestNG suite file
├── Jenkinsfile                            # Jenkins CI pipeline
├── .gitignore                             # Git ignore rules
└── README.md                              # Project documentation
``

### Testing & Execution
- **REST Assured** - Fluent API for HTTP requests and response validation
- **Cucumber** - BDD framework for writing tests in Gherkin language
- **TestNG** - Powerful test framework with parallel execution support
- **Jackson** - JSON serialization/deserialization for POJO mapping

### Reporting & Logging
- **Cucumber HTML Reports** - Beautiful test execution reports with pass/fail status
- **Cucumber JSON Reports** - Machine-readable format for CI/CD integration


#### Project Dependencies
`from pom.xml control all dependancy.



	