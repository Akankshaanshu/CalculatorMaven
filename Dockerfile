FROM openjdk:8
EXPOSE 8080
ADD /target/jenkins-0.0.1-SNAPSHOT.jar DockerJenkins1-sample.jar
ENTRYPOINT ["java","jar","/DockerJenkins1-sample.jar"]
