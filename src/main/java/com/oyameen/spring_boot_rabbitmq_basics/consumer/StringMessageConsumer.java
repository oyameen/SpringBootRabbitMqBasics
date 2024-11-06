package com.oyameen.spring_boot_rabbitmq_basics.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StringMessageConsumer {

    @RabbitListener(queues = "${rabbitmq.queue.string.name}")
    public void consume(String message) {
        log.info(String.format("String message received = [ %s", message + " ]."));
    }

}
