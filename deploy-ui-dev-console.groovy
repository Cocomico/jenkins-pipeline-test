#!/usr/bin/env groovy


  def deployTarget = "openwhisk-ui-vm2"
  println "starting UI build"

  node(deployTarget) {

      println "currently logged in as:"
      sh "whoami"
      def nodeHome = "/home/ibmadmin/.nvm/versions/node/v6.3.1"
      env.PATH = "${nodeHome}/bin:${env.PATH}"
      echo "node version"
      sh "node -v"

      sh "npm uninstall bower -g"
      sh "npm install bower -g"

      sh "rm -Rf Bluemix-Whisk-UI"
      sh "mkdir Bluemix-Whisk-UI"

      dir("Bluemix-Whisk-UI") {
          stage "Deploy"

          echo "Executing initial setup"
          timeout(time:30, unit:'MINUTES') {
              sh "./myscript.sh"
          }
      }
  }
