package com.Learner.FirstProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner {
    public static final Logger logger = LoggerFactory.getLogger(FirstProjectApplication.class);

    public static void main(String[] args) {
        logger.info("it's a continous integration job");
        SpringApplication.run(FirstProjectApplication.class, args);
        //dinesh
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("it;s my second logger");
        logger.info("Its my second logger" +
                "");
    }
}
