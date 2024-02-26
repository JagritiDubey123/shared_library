def call() {
    // Print current working directory
    sh 'pwd' 
    // List files in current directory
    sh 'ls -la' 
    // Install npm package
    def password = 'jagriti@123'
sh "echo ${password} | sudo -S apt-get update"

    sh 'sudo apt-get install npm'
}
