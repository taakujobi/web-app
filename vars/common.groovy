def call(string stageName){
  if("${stageName}" == "Build"){
    sh "mvn package"
  }
  else if("${stageName}" == "Test"){
    sh "mvn sonar:sonar"
  }
  else if("${stageName}" == "Deploy"){
    sh "mvn deploy"
  }
}
