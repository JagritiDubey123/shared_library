def call() {
    // Print current working directory
    sh 'pwd' 
    // List files in current directory
    sh 'ls -la' 
    // Install npm package
    sh 'sudo apt-get update && sudo apt-get install npm'
}
