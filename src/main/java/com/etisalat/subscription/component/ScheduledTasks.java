package com.etisalat.subscription.component;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ScheduledTasks.class);

    @Scheduled(cron = "0 0/1 * * * *")
    public void archivingJob(){
        // run archiving job
        LOGGER.info("archivingJob Task is running now!");
    }

    @Scheduled(cron = "0 0/2 * * * *")
    public void CDRListener(){
        LOGGER.info("CDRListener listens now!");

    }
}
