package com.example.kafkams.kafka.service;

import com.example.kafkams.kafka.dto.TestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

@Configuration
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "ms-kafka", groupId = "group_id", containerFactory = "kafkaListenerContainer")// Method
    public void consume(@Payload TestDto message) throws InterruptedException {
        log.info("message = " + message);
        //Thread.sleep(5000);
    }
}
