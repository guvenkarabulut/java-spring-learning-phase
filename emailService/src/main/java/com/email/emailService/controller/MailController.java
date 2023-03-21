package com.email.emailService.controller;

import com.email.emailService.mail.MailSender;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private MailSender mailSender;

    public MailController(MailSender smtp) {
        this.mailSender = smtp;
    }

    @RequestMapping("/mail")
    public String mail() throws MessagingException {
        mailSender.send("mail@example.com", "A test mail", "Body of the test mail");
        return "Mail sent";
    }
}
