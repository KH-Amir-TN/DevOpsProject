pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }
    stages {
       stage ('CLEAN') {
            steps {
                sh 'mvn clean'
            }
       }
       stage ('INSTALL') {
            steps {
                sh 'mvn install'
            }
       }
       stage ('TEST') {
            steps {
                sh 'mvn test'
            }
       }
       stage ('BUILD') {
            steps {
                sh 'mvn build'
            }
       }
    }
}