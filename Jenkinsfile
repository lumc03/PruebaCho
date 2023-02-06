#!groovy

pipeline {
    agent any
    stages {
        stage('Obtener Fuentes') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: "main"]],
                          wdoGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[ url: "https://github.com/lumc03/PruebaCho"]]])
            }
        }

        stage('Ejecutar Pruebas') {
            steps {
                 sh './gradlew clean test'

                }
            }
        }
}