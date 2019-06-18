def APP_NAME='open-demo'
pipeline {
  agent {
    node { label 'gradle' }
  }

  options {
	  skipStagesAfterUnstable()
  }

  stages {
     stage('Check out') {
      steps {
        script {
          echo "Checking out https://github.com/luizrobertofreitas/open-demo.git"
          git url: 'https://github.com/luizrobertofreitas/open-demo.git'
        }
      }
    }
    stage('Build') {
      steps {
        sh 'gradle clean build -x test --no-daemon'
      }
    }
    stage('Archive') {
      steps {
        sh 'gradle uploadArchives --no-daemon'
      }
    }
  }
}
