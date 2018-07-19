node {
	stage('Building the code'){
		git url: 'https://github.com/azureesherpa/maventest.git'
		withMaven(maven:'M3'){
			sh "mvn clean install"

		}
	}
}