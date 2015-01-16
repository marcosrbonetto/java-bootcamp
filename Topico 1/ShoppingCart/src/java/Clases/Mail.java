/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail 
{

        public void sendEmail(int id,String subject, String txt)
        {
               // Get system properties
            Properties properties = System.getProperties();
            // Setup mail server
            properties.setProperty("mail.smtp.host", "localhost");
            // Get the default Session object.
            Session session = Session.getDefaultInstance(properties);
            try{
                // Create a default MimeMessage object.
                MimeMessage message = new MimeMessage(session);
                // Set From: header field of the header.
                message.setFrom(new InternetAddress("marcosrbonetto@gmail.com"));
                // Set To: header field of the header.
                message.addRecipient(Message.RecipientType.TO,
                                  new InternetAddress("marcosrbonetto@gmail.com"));
                // Set Subject: header field
                message.setSubject(subject);
                // Now set the actual message
                message.setText(txt);
                // Send message
                Transport.send(message);
                System.out.println("Sent message successfully....");
                
            }catch (MessagingException mex) 
            {
                mex.printStackTrace();
            }
        }
    
}
