@Library('shared_library') _
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
                     dir('var/lib/jenkins/workspace/') { // Adjust the path to your workspace
                    script {
                        npmInstall()
                    }
                }
                    // Use the shared library to run npm install
                    //npmInstall()
                }
        //    }
        //}
        stage('Test') {
            steps {
                script {
                    // Use the shared library to run npm test
                    npmTest()
                }
            }
        }
        stage('Custom Script') {
            steps {
                script {
                    // Use the shared library to run a custom npm script
                    runScript('start')
                }
            }
        }
    }
}

