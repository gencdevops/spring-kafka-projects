package com.kafka.producer.executor;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class ExecutorServiceConfig {


    @Bean
    public ExecutorService getExecutorService() {
        return Executors.newSingleThreadExecutor();
    }

}
