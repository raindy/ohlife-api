FROM maven:3.3-jdk-8-onbuild


CMD ["java", "-jar", "target/ohlife-api-0.0.1-SNAPSHOT.jar"]