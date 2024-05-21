package org.example.springbootjenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringBootJenkinsApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplicationTests.class);
    @Test
    void contextLoads() {
        logger.info("test cases running");
    }

}
