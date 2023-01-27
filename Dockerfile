FROM openjdk:19-jdk-alpine
ADD target/Spring-Boot-Test-0.0.1-SNAPSHOT.jar Spring-Boot-Test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/Spring-Boot-Test-0.0.1-SNAPSHOT.jar"]

