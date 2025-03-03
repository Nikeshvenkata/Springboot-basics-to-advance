package com.nikesh.springboot.java;

interface MessageService {
    String getMessage();
}
public class EmailService implements MessageService {
    public String getMessage() {
        return "Email Message";
    }
}

class GmailService implements MessageService {
    public String getMessage() {
        return "Gmail Message";
    }
}

class SMSClient {
    private final MessageService messageService;

    // Tightly coupled, Because we are creating the object of EmailService by ourselves.
    public SMSClient() {
        this.messageService = new EmailService();
    }

    // Loosely coupled, Because we are passing the EmailService through constructor.
    public SMSClient(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage() {
        String message = messageService.getMessage();
        System.out.println(message);
    }

    public static void main(String[] args) {
        SMSClient smsClient1 = new SMSClient();
        smsClient1.sendMessage();

        GmailService gmailService = new GmailService();
        // EmailService emailService = new EmailService();
        SMSClient smsClient2 = new SMSClient(gmailService);
        smsClient2.sendMessage();
    }
}