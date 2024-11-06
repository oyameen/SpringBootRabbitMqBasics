package com.oyameen.spring_boot_rabbitmq_basics.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StringRabbitMqProducer {

    @Value("${rabbitmq.routing.string.key}")
    private String stringRoutingKey;

    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message) {
        log.info(String.format("String message sent = [ %s", message + " ]."));
        rabbitTemplate.convertAndSend(exchangeName, stringRoutingKey, message);
    }
}
