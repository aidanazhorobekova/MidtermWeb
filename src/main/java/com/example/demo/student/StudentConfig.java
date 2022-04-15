package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student aidana = new Student(
                    "Aidana",
                    "aidanazhorobekova@gmail.com",
                    LocalDate.of(2002, OCTOBER, 13)
            );

            repository.saveAll(
                    List.of(aidana)
            );

        };
    }
}
