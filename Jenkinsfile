pipeline {
	agent any
	
	stages {
	  stage ('Compile Stage')  {
	  	
	  	steps {
	  		withMaven(maven : 'MVN') {
	  			sh 'mvn clean compile'
	  		}
	  	}
	  
	  }
	  
	  stage ('Testing Stage')  {
	  	
	  	steps {
	  		withMaven(maven : 'MVN') {
	  			sh 'mvn test'
	  		}
	  	}
	  
	  }

	stage ('SonarQube Stage')  {
	  	
	  	steps {
	  	
	  		withMaven(maven : 'MVN') {
	  			sh 'mvn sonar:sonar'
	  		}
	  	
	  	}
	  
	  }
	  
	  stage ('Deployment Stage')  {
	  	
	  	steps {
	  		withMaven(maven : 'MVN') {
	  			sh 'mvn deploy'
	  		}
	  	}
	  
	  }
	  
	  
	  stage ('Docker Image Build')  {
	  	
	  	steps {
	  		withMaven(maven : 'MVN') {
	  			sh 'mvn install -Pdocker'
	  		}
	  	}
	  
	  }
	  
	}






}