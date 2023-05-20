package com.example.nhatphat.studentcontroller.config;

import com.example.nhatphat.studentcontroller.model.StudentModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class CustomConfig {
    @Bean
    public ArrayList<StudentModel> students(){
        ArrayList<StudentModel> students = new ArrayList<>();
        return students;

    }
}
