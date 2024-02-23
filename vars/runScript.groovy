def call(String scriptName) {
    // Execute a custom npm script
    sh "npm run ${scriptName}"
}
