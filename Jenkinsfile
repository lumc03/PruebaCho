pipeline {
    agent {label 'main'}
    stages {

        stage('test'){
            steps {
                sh './gradlew clean test'
            }
        }
    }
    post {
        always {
            junit 'build/test-results/*/.xml'
        }
    }
}