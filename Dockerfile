FROM tomcat:8.0-jre8
COPY target/github-jenkins-springbootapp-docker.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh","run"]
