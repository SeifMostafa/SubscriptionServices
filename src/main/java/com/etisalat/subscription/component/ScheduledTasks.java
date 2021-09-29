package com.etisalat.subscription.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTasks.class);

    @Autowired
    MailService mailService;

    @Scheduled(cron = "0 9 * * 1 *")
    public void report() {
        // run archiving job
        LOGGER.info("#learners == stages and progress!");
        mailService.sendReportToBoard("Seif initialized thread to develop Seshat by contributing," +
                " We have 0 learners, 0 builders." +
                " there's intent to grow and build Seshat to deliver to Resala! ");

    }

    @Scheduled(cron = "0 30 17 1/1 * *")
    public void alarm() {
        LOGGER.info("notify late people who expect to submit!");
        mailService.alarm("wow! we initialized!");
    }
}
