pipeline {
    agent any

    stages {
        stage('clone repo and clean it') {
            steps {
                sh 'git clone https://github.com/cosc4426project1000/tip-calculator-app.git'
                sh 'mvn clean -f tip-calculator-app'
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn compile -f tip-calculator-app'
            }
        }
        stage('Test') {
            steps {
               sh 'mvn test -f tip-calculator-app'
            }
        }
        stage('Deploy') {
            steps {
                sh 'mvn deploy -f tip-calculator-app'
            }
        }
    }
}
