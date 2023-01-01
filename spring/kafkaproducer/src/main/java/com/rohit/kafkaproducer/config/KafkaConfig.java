package com.rohit.kafkaproducer.config;

import org.springframework.beans.factory.annotation.Value;

@Configuration
public class KafkaConfig {
    @Value(value="${spring.kafka.bootstrap-servers}")
    private String bootstrapAddress;
}
