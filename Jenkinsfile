pipeline {
  agent any

  options {
    buildsDiscarder(logRotation(numToKeepStr: '2', artifactNumToKeepStr: '1'))
  }

  stages {
    stage('Unit Tests') {
      steps {
        sh 'ant -f test.xml -v'
        junit 'reports/'
      }
    }
    stage(build) {
      steps {
      sh 'ant -f build.xml -v'
      }
    }
  }

  post {
    always {
      archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true
    }
  }
}
