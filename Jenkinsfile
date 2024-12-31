pipeline {
   agent any
   tools {
       maven 'maven'
        jdk 'Java'
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
       stage('Building') {
           steps {
                 sh 'mvn clean deploy -DskipTests=true'
               }
            }
        }
     post {
        success {
            script {
              def  buildLibSuccess = "true"
              build job: 'User-Micorservice', parameters: [
               string(name: 'BUILD_LIB_SUCCESS', value: buildLibSuccess)
             ]
              build job: 'Authentication-Microservice', parameters: [
               string(name: 'BUILD_LIB_SUCCESS', value: buildLibSuccess)
              ]
            }
        }
    }
}
