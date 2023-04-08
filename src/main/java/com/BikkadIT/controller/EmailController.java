package com.BikkadIT.controller;

import com.BikkadIT.email.Email;
import com.BikkadIT.email.GmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmailController {
    @Autowired
    private GmailSender emailSender;
     @PostMapping("/sendmail")
    public String sendMail(@RequestBody Email email){
        boolean send=emailSender.sendEmail(email.getTo(), email.getFrom(), email.getSubject(), email.getContent(), email.getFilename());
        if(send)
        {
            return "Email has been send successfully......";
        }else{
            return "Sorry Email Not sent.....!!";
        }
    }
}
