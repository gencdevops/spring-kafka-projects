package com.kafka.producer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class KafkaTemplateConfig {

    private final ProducerFactory<String, String> producerFactory;

    public KafkaTemplateConfig(ProducerFactory<String, String> producerFactory) {
        this.producerFactory = producerFactory;
    }


    @Bean
    public KafkaTemplate<String, String> getKafkaTemplate() {
        return new KafkaTemplate<>(producerFactory);
    }


}
