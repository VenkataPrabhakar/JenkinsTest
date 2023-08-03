package com.Learner.FirstProject;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FirstProjectApplicationTests {
	public static final Logger logger = LoggerFactory.getLogger(FirstProjectApplication.class);


	@Test
	void contextLoads() {
		logger.info("it's a test case logger");
		assertEquals(true,true);
	}

}
