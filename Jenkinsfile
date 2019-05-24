pipeline {
    agent any

    stages {
        stage('clone repo and clean it') {
            steps {
                sh 'rm -rf tip-calculator-app'
                sh 'git clone https://github.com/cosc4426project1000/tip-calculator-app.git'
                sh 'mvn clean'
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('Test') {
            steps {
               sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                sh 'mvn deploy'
            }
        }
    }
}
