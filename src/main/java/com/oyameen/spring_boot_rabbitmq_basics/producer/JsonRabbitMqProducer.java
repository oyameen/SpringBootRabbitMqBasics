package com.oyameen.spring_boot_rabbitmq_basics.producer;

import com.oyameen.spring_boot_rabbitmq_basics.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonRabbitMqProducer {

    @Value("${rabbitmq.routing.json.key}")
    private String jsonRoutingKey;

    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(Student student) {
        log.info(String.format("Json message sent = [ %s", student.toString() + " ]."));
        rabbitTemplate.convertAndSend(exchangeName, jsonRoutingKey, student);
    }
}
