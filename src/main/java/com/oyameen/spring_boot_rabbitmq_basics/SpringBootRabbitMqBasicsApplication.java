package com.oyameen.spring_boot_rabbitmq_basics;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class SpringBootRabbitMqBasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRabbitMqBasicsApplication.class, args);
    }

}
