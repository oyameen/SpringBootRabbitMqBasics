package com.oyameen.spring_boot_rabbitmq_basics.controller;

import com.oyameen.spring_boot_rabbitmq_basics.model.Student;
import com.oyameen.spring_boot_rabbitmq_basics.producer.JsonRabbitMqProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonMessageController {

    @Autowired
    private JsonRabbitMqProducer jsonRabbitMqProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Student student) {
        jsonRabbitMqProducer.sendMessage(student);
        return ResponseEntity.ok("Sending json message to RabbitMQ done successfully.");
    }
}
