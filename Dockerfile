# Start from base image with Java 8
FROM java:8-jre-alpine
VOLUME /tmp
ADD target/demo-spring-docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
