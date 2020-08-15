# it-work-forum-email-service
This is a consumer email service using Apache Kafka being used for sending emails.

## Usage
You need your own producer which sends object as a message (EmailKafkaRequest) to Kafka broker - it needs to be in the same package as EmailKafkaRequest (you can also add exception in a config file).
When Kafka receives a message it sends a message to receiver.

It is possible to run application in DEV or PROD mode. Configurations are located in application-dev.properties and application-prod.properties

## Prequences
- Maven, Java, Docker

## Run the application:
In application root directory run:
    - mvn clean install
Run as a DEV profile in /target/ directory:
    - java -jar -Dspring.profiles.active=dev kafka-email-service-1.0-SNAPSHOT.jar
Run as a PROD profile:
    - java -jar -Dspring.profiles.active=prod kafka-email-service-1.0-SNAPSHOT.jar   

 
## Run kafka and zookeeper
In root directory run: 
    - docker-compose -f docker-compose up -d

