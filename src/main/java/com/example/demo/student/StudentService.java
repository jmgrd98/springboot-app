package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.example.demo.student.models.StudentModel;

@Service
public class StudentService {

    public List<StudentModel> getStudents() {
        return List.of(
                new StudentModel(
                        1L,
                        "Maria",
                        "maria@gmail.com",
                        21,
                        LocalDate.of(2000, Month.APRIL, 5)
                )
        );
    }
}
