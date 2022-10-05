pipeline {
  agent any
  tools {
    maven 'mvnapp'
  }
  
  def lib(){
    sh 'echo ciao > maven.txt'
  }
    
    
  stages {
    stage('Java') {
      steps {
        sh 'mvn package'
      }
    }
  }
}
