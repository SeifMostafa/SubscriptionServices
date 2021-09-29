package com.etisalat.subscription.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    JavaMailSender mailSender;

    public void sendReportToBoard(String report) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo("magedsoham13@gmail.com",
                "mohammedbasset405@gmail.com",
                "abdo.ra.1997@gmail.com",
                "ahmedaomda96@gmail.com",
                "ayamohamedmahmoud@gmail.com");
        simpleMailMessage.setSubject("Seif initializes Seshat");
        simpleMailMessage.setText(report);
        mailSender.send(simpleMailMessage);
    }


    public void sendTest(String report) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo("magedsoham13@gmail.com",
                "mohammedbasset405@gmail.com",
                "abdo.ra.1997@gmail.com",
                "ahmedaomda96@gmail.com",
                "ayamohamedmahmoud@gmail.com");
        simpleMailMessage.setSubject("Seif initializes Seshat");
        simpleMailMessage.setText(report);
        mailSender.send(simpleMailMessage);
    }

    public void alarm(String alarmMessage) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo("seifmostafa2014@hotmail.com");
        simpleMailMessage.setSubject("Alarm service");
        simpleMailMessage.setText(alarmMessage);
        mailSender.send(simpleMailMessage);
    }
}
