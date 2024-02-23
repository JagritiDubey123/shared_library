def call() {
    // Execute npm install command
     sh 'pwd' // Print current working directory
     sh 'ls -la' 
    sh "install npm"
}
