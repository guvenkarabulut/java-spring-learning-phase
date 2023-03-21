package com.email.emailService.mail;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class MockMailSender implements MailSender{

    private static Log log = LogFactory.getLog(MockMailSender.class);
    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending Mock Mail to "+to);
        log.info("with subject "+subject);
        log.info("and body "+body);
    }
}
