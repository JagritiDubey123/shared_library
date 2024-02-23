# Node.js Shared Library

This shared library contains functions to help with Node.js projects in Jenkins pipelines.

## Usage

1. Import the shared library into your Jenkins pipeline.
2. Use the provided functions in your pipeline script.

### Example:

```groovy
pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                script {
                    npmInstall()
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    npmTest()
                }
            }
        }
        stage('Custom Script') {
            steps {
                script {
                    runScript('start')
                }
            }
        }
    }
}
