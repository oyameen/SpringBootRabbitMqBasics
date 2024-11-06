package com.oyameen.spring_boot_rabbitmq_basics.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Student {
    private int id;
    private String name;
    private int age;
    private int mark;

}
