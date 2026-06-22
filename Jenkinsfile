pipeline{
    agent any
        tools {
        maven '3.9.15'
    }
    stages{
        stage('cloning the images'){
            steps{
                git branch:'main',
                url:'https://github.com/abhidubey7754/test-docker-network.git'
            }
        }
        stage('Check Workspace') {
    steps {
        sh 'pwd'
        sh 'ls -la'
        sh 'find . -name pom.xml'
    }
}
            stage('maven build'){
                steps{
                    dir('test-docker-network') {
                sh 'mvn clean package -DskipTests'
                }
                }
            }
            /*
                stage('build docker image'){
                    steps{
                        sh 'docker build -t abhi7754/docker1:d1 .'
                    }
           }
           */
      }
}