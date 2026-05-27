pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK11'
    }

    stages {
        stage('API Automation – Parallel Execution') {
            parallel {

                stage('Small Scale API (Smoke)') {
                    steps {
                        echo 'Running API Smoke Tests'
                        sh 'mvn clean test -Dcucumber.filter.tags="@api_smoke"'
                        sh 'sleep 5'
                    }
                }

                stage('Medium Scale API (Regression)') {
                    steps {
                        echo 'Running API Regression Tests'
                        sh 'mvn test -Dcucumber.filter.tags="@api_regression"'
                        sh 'sleep 10'
                    }
                }

                stage('Large Scale API (Full Suite)') {
                    steps {
                        echo 'Running Full API Test Suite'
                        sh 'mvn test'
                        sh 'exit 1'   // ✅ intentional API failure
                    }
                }
            }
        }
    }

    post {
        success {
            echo 'API Automation Pipeline Completed Successfully'
        }

        failure {
            echo 'API Automation Failed – Sending Alert'
            emailext (
                subject: 'API Automation Failure – ReqRes',
                body: """
Summary: API Automation Job Failed
Description: One or more API test cases failed during execution.
Epic: API Automation
Log Link: ${BUILD_URL}console
                """,
                to: 'qa-team@company.com'
            )
        }

        always {
            archiveArtifacts artifacts: '**/target/*.html', allowEmptyArchive: true
        }
    }
}