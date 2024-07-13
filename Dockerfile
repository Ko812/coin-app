ARG JAVA_VERSION=21.0
ARG MVN_VERSION=3.8.6

FROM openjdk:17-jdk-alpine
COPY target/minimum-coin-1.0.0.jar minimum-coin-1.0.0.jar
ENTRYPOINT ["java","-jar","/minimum-coin-1.0.0.jar"]