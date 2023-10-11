package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JULY;
import static java.util.Calendar.JUNE;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student dusmamat = new Student(
                    "Dusmamat",
                    "dkarimov@gmail.com",
                    LocalDate.of(1980, JULY, 30)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1981, JUNE, 30)
            );
            repository.saveAll(
                    List.of(dusmamat, alex)
            );

        };
    }
}
