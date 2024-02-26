def call() {
    // Print current working directory
    sh 'pwd' 
    // List files in current directory
    sh 'ls -la' 
    // Install npm package
//     def password = 'jagriti@123'
// sh "echo ${password} | sudo -S apt-get update"

   // sh 'sudo apt-get install npm'
    // my-shared-library/vars/npmInstall.groovy

    // Replace 'npm install' with any necessary commands to install Node.js and npm on the GCP VM
    
    
    // Optionally, you can check the installed versions of Node.js and npm
    
  
    def startTime = new Date()
    echo "Starting npm install at ${startTime}"
    sh 'sudo su'
    sh 'sudo apt-get update && sudo apt-get install -y nodejs npm'
   // sh 'npm install'
    sh 'node -v && npm -v'
    def endTime = new Date()
    echo "Finished npm install at ${endTime}"
    
    def duration = endTime.time - startTime.time
    echo "npm install took ${duration} milliseconds"
}


