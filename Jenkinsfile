stage('Run tests'){
if(isUnix()){
sh "mvn clean test -Dcucumber.filter.tags=”@smoke”"
} else {
bat "mvn clean test -Dcucumber.filter.tags=”@smoke”"
}
}