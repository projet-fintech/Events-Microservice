package com.banque.events.dto;



public class NotificationRequest {
    private String type;
    private String recipientEmail;
    private String subject;
    private String content;

    public NotificationRequest(String type, String recipientEmail, String subject, String content) {
        this.type = type;
        this.recipientEmail = recipientEmail;
        this.subject = subject;
        this.content = content;
    }

    public NotificationRequest() {
    }

    // Getters and Setters
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getRecipientEmail() { return recipientEmail; }
    public void setRecipientEmail(String recipientEmail) { this.recipientEmail = recipientEmail; }
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}

