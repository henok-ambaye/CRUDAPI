package com.example.CrudApi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student henok = new Student(
                    "Henok",
                    "henok@gmail.com",
                    LocalDate.of(1998, Month.FEBRUARY, 24));

            Student mahi = new Student(
                    "mahi",
                    "mahi@gmail.com",
                    LocalDate.of(2017, Month.FEBRUARY, 24));
            Student Abeni = new Student(
                    "Abeni",
                    "abeni@gmail.com",
                    LocalDate.of(2001, Month.JULY, 4));

            repository.saveAll(
                    List.of(henok, mahi, Abeni)
            );
        };

    }
}
