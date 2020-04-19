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
	  		
	  		timeout(time: 10, unit: 'MINUTES') {
            waitForQualityGate abortPipeline: true
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
	  
	}






}