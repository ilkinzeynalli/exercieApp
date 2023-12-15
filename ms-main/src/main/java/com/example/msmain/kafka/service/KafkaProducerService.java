package com.example.msmain.kafka.service;//package com.ilkinzeynalli.exerciseapp.kafka.service;
//
//import com.ilkinzeynalli.exerciseapp.model.dto.CustomerDto;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//
//@Service
//@RequiredArgsConstructor
//@Slf4j
//public class KafkaProducerService {
//
//    private final KafkaTemplate<String, CustomerDto> kafkaTemplate;
//
////    @Scheduled(fixedRate = 1000)
////    public void sendProduce() {
////        log.info("send produce 1 " + LocalDateTime.now());
////        send("ms-kafka", "key " + LocalDateTime.now(), "deneme value " + LocalDateTime.now());
////    }
//
//    private void send(String topicName, String key, String value) {
//
//
//        CustomerDto test = CustomerDto.builder().name("customer1").build();
//        var future = kafkaTemplate.send(topicName, key, test);
//    }
//}
