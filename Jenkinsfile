def APP_NAME='open-demo'
pipeline {
  agent {
    node { label 'gradle' }
  }

  options {
	  skipStagesAfterUnstable()
  }

  stages {
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
