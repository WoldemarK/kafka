package com.example.kafka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaListeners {

    @KafkaListener
            (
                    topics = "OneTestTopic",
                    groupId = "groupId"
            )
    public void listener(String row){
        System.out.println("Listener received " + row + "!?!");
    }

}
