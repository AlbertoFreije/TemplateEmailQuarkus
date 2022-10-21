package org.ricoh.quickstart;

public class Email {

    private String subject;
    private String content;

    public Email(String subject1, String content1) {

        if (subject1.isEmpty()) {
            this.subject = "Email de prueba";
        } else {
            this.subject = subject1;
        }
        if (content1.isEmpty()) {
            this.content = "Esto es un email de prueba";
        } else {
            this.content = content1;
        }
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

}
