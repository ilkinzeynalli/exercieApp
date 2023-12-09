package com.ilkinzeynalli.exerciseapp.kafka.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ilkinzeynalli.exerciseapp.kafka.dto.TestDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

@Slf4j
public class KafkaValueDeserializer implements Deserializer<TestDto> {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
    }

    @Override
    public TestDto deserialize(String topic, byte[] data) {
        try {
            return objectMapper.readValue(new String(data, "UTF-8"), TestDto.class);
        } catch (Exception e) {
            log.error("Unable to deserialize message {}", data, e);
            return null;
        }
    }

    @Override
    public void close() {
    }
}
