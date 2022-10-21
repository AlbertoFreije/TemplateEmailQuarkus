package org.ricoh.quickstart;

import javax.ws.rs.Path;

import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.GET;


@Path("/mail")
public class MailResource {

   @Inject
   MailService emailService;

//    Email email;

//    @CheckedTemplate
//    static class Templates {
//        public static native MailTemplate.MailTemplateInstance emailTemplate(Email email); // <1>
//    }

    @GET
    @Path("/template")
    public Uni<Void> sendTypeSafeTemplate() {
       return emailService.sendTypeSafeTemplate();
    }
    
}
