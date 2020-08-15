package com.email.service.service;

import com.email.service.config.StaticConfig;
import com.email.service.model.EmailKafkaRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);

    private final EmailService emailService;

    @Autowired
    public MessageConsumer(final EmailService emailService) {
        this.emailService = emailService;
    }

    @KafkaListener(topics = StaticConfig.TOPIC, groupId = StaticConfig.GROUP, containerFactory = "emailKafkaListenerFactory")
    public void consumeJson(EmailKafkaRequest email) {
        LOGGER.info("Sending email to: " + email.getReceiver());
        this.emailService.send(email.getSender(), email.getReceiver(), email.getSubject(), email.getBody());
    }

}
