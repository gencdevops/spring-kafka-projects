package com.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;

import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListenerService {

    @KafkaListener(topics = "${spring.kafka.consumer.topic}" , groupId = "${spring.kafka.group.id}")
    public void listen(String message) {
        System.out.printf("Received : %s%n" , message);
    }
}
