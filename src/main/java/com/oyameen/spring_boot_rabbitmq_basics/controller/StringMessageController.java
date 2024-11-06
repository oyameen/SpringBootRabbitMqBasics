package com.oyameen.spring_boot_rabbitmq_basics.controller;

import com.oyameen.spring_boot_rabbitmq_basics.producer.StringRabbitMqProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringMessageController {

    @Autowired
    private StringRabbitMqProducer stringRabbitMqProducer;

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message) {
        stringRabbitMqProducer.sendMessage(message);
        return ResponseEntity.ok("Sending string message to RabbitMQ done successfully.");
    }

}
