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
                    userRemoteConfigs: [[credentialsId: 'ser3elah', url: 'URL_DU_REPO']]
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
                build job: 'authentication-service-pipeline', parameters: [
                string(name: 'BUILD_LIB', value: 'false')]
                 build job: 'user-service-pipeline', parameters: [
                 string(name: 'BUILD_LIB', value: 'false')]
            }
        }
    }
}