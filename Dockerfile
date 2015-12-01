FROM maven:3.3.3-jdk-8

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

ADD . /usr/src/app
RUN mvn install

# Expost port 80
EXPOSE 8080

CMD ["java", "-jar", "/usr/src/app/target/ohlife-api-0.0.1-SNAPSHOT.jar"]