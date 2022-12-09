pipeline {
    agent any
    tools {
        maven 'M3'
        git 'default'
        jdk 'jdk8'
    }
    stages {
      stage ('CHECKOUT') {
            steps {
                git 'git@github.com:KH-Amir-TN/DevOpsProject.git'
            }
       }
       stage ('CLEAN') {
            steps {
                echo 'cleaning...'
                sh 'mvn clean'
            }
       }
       stage ('INSTALL') {
            steps {
                echo 'installing...'
                sh 'mvn install'
            }
       }
       stage ('TEST') {
            steps {
                echo 'testing...'
                sh 'mvn test'
            }
       }
       stage ('BUILD') {
            steps {
                echo 'building...'
                sh 'mvn build'
            }
       }
    }
}