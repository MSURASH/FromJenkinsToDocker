pipeline {
  
    agent any
    tools{
        maven 'MVN'
    }
    
    

   

  stages {
      
      
       stage('Build Maven') {
      
        steps{
            
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/MSURASH/FromJenkinsToDocker']]])
            bat 'mvn clean install -DskipTests'
        
        
        }
        
        
      
    } 
    
    stage('Build Docker Image') {
      
        steps{
            
            bat "docker build -t sufianr/jenkins-to-docker:latest ." 
            echo 'Build Image Completed'
            
          
        }
    } 
    
    stage('Login to Docker Hub') {      	
    steps{   
     
	bat 'python docker.py'                		
	echo 'Login Completed'      
    }           
    }  
    
    stage('Push Docker Image To Hub') {
         steps{                            
                bat 'docker push sufianr/jenkins-to-docker:latest'           
                echo 'Push Image Completed'       
    }  
    }
  }
  
  post{
    always {  
	bat 'docker logout'     
    }      
    }
}