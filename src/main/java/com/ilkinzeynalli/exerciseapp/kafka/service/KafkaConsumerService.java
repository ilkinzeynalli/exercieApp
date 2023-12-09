package com.ilkinzeynalli.exerciseapp.kafka.service;

import com.ilkinzeynalli.exerciseapp.kafka.dto.TestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "ms-kafka", groupId = "group_id")// Method
    public void consume(TestDto message) throws InterruptedException {
        log.info("message = " + message.toString());
        //Thread.sleep(5000);
    }
}
