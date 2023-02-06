pipeline {
    agent any
    stages {
        stage('subir repo}
            steps {
                git 'https://github.com/lumc03/PruebaCho.git'
            }
        }
        stage('Compilación') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Ejecutar pruebas') {
            steps {
                sh './gradlew clean test'
'
            }
        }
    }

    