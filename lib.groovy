def call(){
  
  pipeline {
  agent any
  tools {
    maven 'mvnapp'
  }
    
    
  stages {
    stage('Java') {
      steps {
        sh 'mvn package'
      }
    }
  }
}

}

