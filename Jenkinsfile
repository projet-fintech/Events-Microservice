pipeline {
    agent any
    tools {
         maven 'Maven'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scmGit(
                    branches: [[name: '*/main']],
                    extensions: [],
                    userRemoteConfigs: [[credentialsId: 'ser3elah', url: 'https://github.com/projet-fintech/Events-Microservice.git']]
                )
             }
       }
       stage('Build lib') {
           steps {
                withMaven(maven: 'Maven') {
                       sh 'mvn clean install -DskipTests=true'
                    }
             }
         }
    }
    post {
        success {
            script {
                build job: 'Authentication-Microservice', parameters: [
                string(name: 'BUILD_LIB', value: 'false')]
                 build job: 'User-Micorservice', parameters: [
                 string(name: 'BUILD_LIB', value: 'false')]
            }
        }
    }
}