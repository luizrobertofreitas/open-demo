def version = '1.0.0'
def PROJECT_NAME='backend-dev'
def APP_NAME='open-demo'
pipeline {
  agent {
    node { label 'gradle' }
  }

  environment{
	  deployDev = true
  }

  options {
	  skipStagesAfterUnstable()
  }

  stages {
     stage('Check out') {
      steps {
        script {
          echo "Checking out https://github.com/luizrobertofreitas/open-demo.git"
          git credentialsId: 'github', url: 'https://github.com/luizrobertofreitas/open-demo.git'
        }
      }
    }
    stage('Test') {
      steps {
        dir("${APP_NAME}") {
            sh 'gradle test  --no-daemon'
        }
      }
    }
    stage('Build') {
      steps {
        dir("${APP_NAME}") {
          sh 'gradle build -x test --no-daemon'
        }
      }
    }
  }
}