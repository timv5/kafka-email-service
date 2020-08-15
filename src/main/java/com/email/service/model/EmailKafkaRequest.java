package com.email.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigInteger;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmailKafkaRequest {

    private BigInteger emailId;
    private Date dateSend;
    private String smtpHost;
    private String smtpPort;
    private String sender;
    private String receiver;
    private String subject;
    private String body;

}
