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

}
