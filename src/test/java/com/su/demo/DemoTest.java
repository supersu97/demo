package com.su.demo;

import com.su.demo.service.ProducerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RocketMQDemoApplication.class})
public class DemoTest {

    @Autowired
    private ProducerService producerService;

    @Test
    public void contextLoads() {
        boolean result = producerService.send("demo", "TAG-A", "Hello RocketMQ");
        assertTrue(result);
    }


}
