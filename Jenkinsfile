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
	  
	  stage ('Deployment Stage')  {
	  	
	  	steps {
	  		withMaven(maven : 'MVN') {
	  			sh 'mvn deploy'
	  		}
	  	}
	  
	  }
	  
	  
	}






}