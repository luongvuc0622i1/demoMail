package com.authentication;

public interface MailSender {

    void sendEmail(String to, String subject, String text);
}
