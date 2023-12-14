package com.example.mscustomer.kafka.service;

import com.example.mscustomer.model.dto.CustomerDto;
import com.example.mscustomer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumerService {

    private final CustomerService customerService;
    @KafkaListener(topics = "ms-kafka", groupId = "group_id", containerFactory = "kafkaListenerContainer")// Method
    public void consume(@Payload CustomerDto customerDto) throws InterruptedException {
        log.info("customerDto listener in kafka = " + customerDto);
        customerService.create(customerDto);
        //Thread.sleep(5000);
    }
}
