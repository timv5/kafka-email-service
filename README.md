# it-work-forum-email-service
This is a consumer email service using Apache Kafka being used for sending emails.

## Usage
You need your own producer which sends object as a message (EmailKafkaRequest) to Kafka broker - it needs to be in the same package as EmailKafkaRequest (you can also add exception in a config file).
When Kafka receives a message it sends a message to receiver.

It is possible to run application in DEV or PROD mode. Configurations are located in application-dev.properties and application-prod.properties

## Prequences
- Maven, Java -> optional if you change any code or doesn't want to run application with docker
- Docker (docker compose) -> if you are only running the application installed docker is enough
    
## Run the application:
In root directory run: 
    - docker-compose -f docker-compose up -d

