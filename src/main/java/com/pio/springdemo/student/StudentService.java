package com.pio.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Pio",
                        "Alibou",
                        LocalDate.now(),
                        "piochamii@gmail.com",
                        31
                ),
                new Student(
                        "Frank",
                        "Amrikan",
                        LocalDate.now(),
                        "frank@gmail.com",
                        32
                )
        );
    }
}
