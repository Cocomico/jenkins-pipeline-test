node {
  def nodeHome = "/home/Applications/IBM/node6.11.5/node/bin/node"

  echo "Starting UI build..."
  echo "currently logged in as:"
  sh "whoami"
  echo "DeployId env var is ${env.DEPLOY_ID}"
  env.PATH = "${nodeHome}/bin:${env.PATH}"
  sh "ls /home/Applications"

  echo "node version:"
  sh "node -v"

  sh "npm uninstall bower -g"
  sh "npm install bower -g"
  sh "rm -Rf Bluemix-Whisk-UI"
  sh "mkdir Bluemix-Whisk-UI"
  sh "cd Bluemix-Whisk-UI"

}

pipeline {
  agent {
    node {
      label 'test-pipeline'
    }
  }

  environment {
    DEPLOY_ID = "${env.DeployId}"
    DEPLOY_PASSWORD = "${env.DeployPassword}"
    PATH = "${nodeHome}/bin:${env.PATH}"
  }

  stages {
    stage('Initialize') {
      steps {
        echo "Initializing..."
      }
    }
    stage('buildAndDeploy') {
      steps {
        echo "Building and deploying"
      }
    }
  }
}
