FROM maven:3.8.5-eclipse-temurin-17 AS builder

RUN mvn clean install

FROM openjdk:17-jdk-alpine
COPY target/minimum-coin-1.0.0.jar minimum-coin-1.0.0.jar
ENTRYPOINT ["java","-jar","/minimum-coin-1.0.0.jar"]
