package com.kafka.producer.runner;

import com.kafka.producer.service.ProducerService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;

@Component
public class ProducerRunner implements ApplicationRunner {
    private final ExecutorService threadPool;
    private final ProducerService producerService;

    public ProducerRunner(ExecutorService threadPool, ProducerService producerService) {
        this.threadPool = threadPool;
        this.producerService = producerService;
    }



    @Override
    public void run(ApplicationArguments args) throws Exception {
        threadPool.execute(this::schedulerCallback);
    }


    private void schedulerCallback() {
        for(int i = 0; i < 10; ++i) {
            producerService.sendMessage("Message " + i);
        }
    }
}
