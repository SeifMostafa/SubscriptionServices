package com.etisalat.subscription.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTasks.class);

    @Scheduled(cron = "0 * 1 * * *")
    public void report(){
        // run archiving job
        LOGGER.info("#learners == stages and progress!");
    }

    @Scheduled(cron = "0 * 1 * * *")
    public void alarm(){
        LOGGER.info("notify late people who expect to submit!");

    }
}
