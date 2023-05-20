package com.example.nhatphat.studentcontroller.controller;

import com.example.nhatphat.studentcontroller.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    ArrayList<StudentModel> students;
    @GetMapping("/add")
    public ResponseEntity<?> addStudentResquestParam (@RequestParam String name,@RequestParam int age){
        students.add(new StudentModel(name,age));
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @GetMapping(value = "/add/{name}/{age}")
    public ResponseEntity<?> addStudentPathVariabe(@PathVariable() String name, @PathVariable() int age){
        students.add(new StudentModel(name,age));
        return new ResponseEntity<>(students,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<?>addStudentRequestBody(@RequestBody StudentModel student){
        students.add(student);
        return new ResponseEntity<>(students,HttpStatus.OK);
    }
}
