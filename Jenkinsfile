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
        stage('Build & Deploy') {
            steps {
                sh 'mvn clean install -DskipTests=true'
                sh 'mkdir -p /var/jenkins_home/shared-artifacts/repo/com/banque/events-lib/1.0-SNAPSHOT'
                sh 'cp target/events-lib-1.0-SNAPSHOT.jar /var/jenkins_home/shared-artifacts/repo/com/banque/events-lib/1.0-SNAPSHOT/'
            }
        }
    }
}
