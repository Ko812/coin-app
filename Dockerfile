

FROM openjdk:17-jdk-alpine
COPY target/minimum-coin-1.0.0.jar minimum-coin-1.0.0.jar
ENTRYPOINT ["java","-jar","/minimum-coin-1.0.0.jar"]