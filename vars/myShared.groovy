def call(){
  sh 'echo Hi Team, How are you!!!'
  sh "date"
   def startTime = new Date()
    echo "Starting at ${startTime}"
}
