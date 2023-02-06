pipeline {
    agent {label 'main0'}
    stages {

        stage('Test') {
            steps {
                script {
                       sh './gradlew build'
                    }
                }
            }
        }
        }
    }
}