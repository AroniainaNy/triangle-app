pipeline {
    agent any
    tools {
        maven 'Maven 3'
    }
    stages {
        stage('git checkout') {
            steps {
                git credentialsId: 'git_credentials', 
                    url: 'https://github.com/AroniainaNy/triangle-app.git'
            }
        }
        stage('Build the application') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Unit Test Execution') {
            steps {
                bat 'mvn test'
            }
        }
    }
}