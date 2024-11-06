package com.oyameen.spring_boot_rabbitmq_basics.consumer;

import com.oyameen.spring_boot_rabbitmq_basics.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonMessageConsumer {

    @RabbitListener(queues = "${rabbitmq.queue.json.name}")
    public void consume(Student student) {
        log.info(String.format("Json message received = [ %s", student.toString() + " ]."));
    }
}
