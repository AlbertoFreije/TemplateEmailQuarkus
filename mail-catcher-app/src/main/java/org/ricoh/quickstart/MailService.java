package org.ricoh.quickstart;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.quarkus.mailer.MailTemplate;
import io.quarkus.qute.CheckedTemplate;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class MailService {

    Email email;

    @CheckedTemplate
    static class Templates {
       public static native MailTemplate.MailTemplateInstance emailTemplate(Email email); // <1>
    }

    @ConfigProperty(name = "quarkus.mailer.from")
    String from;

    public Uni<Void> sendTypeSafeTemplate() {
        email = new Email("Email de prueba" , "Esto es un email de prueba");
        return Templates.emailTemplate(email)
                .to("Alberto.Freije@ricoh.es")
                .subject("Hello from Qute template")
                .send();
    }
    
}
