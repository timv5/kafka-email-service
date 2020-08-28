## WHEN DEPLOYING CHOOSE PROFILE: DEV/PROD

FROM maven:3.6-jdk-11 as maven_build

WORKDIR /app
COPY . /app
RUN mvn clean install -Dmaven.test.skip

FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY --from=maven_build app/target/kafka-email-service-1.0-SNAPSHOT.jar kafka-email-service-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar" , "-Dspring.profiles.active=dev", "kafka-email-service-1.0-SNAPSHOT.jar"]
VOLUME /app/config-repo