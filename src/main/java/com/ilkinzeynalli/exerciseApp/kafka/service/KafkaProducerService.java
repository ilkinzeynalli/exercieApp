package com.ilkinzeynalli.exerciseApp.kafka.service;

import com.ilkinzeynalli.exerciseApp.kafka.dto.TestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducerService {

    private final KafkaTemplate<String, TestDto> kafkaTemplate;

    @Scheduled(fixedRate = 1000)
    public void sendProduce(){
        log.info("send produce " + LocalDateTime.now());
        send("ms-kafka","key " + LocalDateTime.now(),"deneme value " + LocalDateTime.now());
    }

    private void send(String topicName, String key, String value) {


        TestDto test = new TestDto("test name", "test-version");
        var future = kafkaTemplate.send(topicName, key, test);

        //var future = kafkaTemplate.send(topicName, key, value);

        future.whenComplete((sendResult, exception) -> {
            if (exception != null) {
                future.completeExceptionally(exception);
            } else {
                future.complete(sendResult);
            }
            log.info("Task status send to Kafka topic : "+ value);
        });
    }
}
