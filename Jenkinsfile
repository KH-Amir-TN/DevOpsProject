pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
      stage ('CHECKOUT') {
            steps {
                git url: 'https://github.com/KH-Amir-TN/DevOpsProject.git'
            }
       }
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