@Library('shared_lib') _
pipeline {
    agent any
    
    stages {
          stage('Test the Scripting'){
            steps{
                myShared()
            }
        }
        stage('Build') {
            steps {
                    // dir('var/lib/jenkins/workspace/') { // Adjust the path to your workspace
                    script {
                        // dir('src/npm') {
                        npmInstall()
                  // }
                }
                   
                }
        }
        //    }
        //}
        stage('Test') {
            steps {
                script {
                   //  dir('src/npm') {
                    // Use the shared library to run npm test
                    npmTest()
                    // }
                }
            }
        }
        stage('Custom Script') {
            steps {
                script {
                   //  dir('src/npm') {
                    // Use the shared library to run a custom npm script
                    runScript('start')
            }
            }
        }
    }
}

