FROM openjdk:17-jdk-alpine
COPY target/pc-docker-01-1.0.0.jar pc-docker-01.jar
ENTRYPOINT ["java","-jar","/pc-docker-01.jar"]