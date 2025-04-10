# Group: Momtrimo
# Description: Dockerfile for creating Docker image

FROM openjdk:23-jdk-slim
WORKDIR /app
COPY target/momtrimo-0.0.1-SNAPSHOT.jar momtrimo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "momtrimo-0.0.1-SNAPSHOT.jar"]