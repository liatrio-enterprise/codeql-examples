package com.liatrio.demo;

import com.liatrio.demo.dao.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.security.SecureRandom;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/students")
    public List<Student> getAll() {
        return jdbcTemplate.query("SELECT * FROM Students", BeanPropertyRowMapper.newInstance(Student.class));
    }

    @GetMapping("/students/{id}")
    public Student getById(@PathVariable("id") Long id) {
        String query = "SELECT * FROM Students WHERE id = " + id;

        return jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(Student.class));
    }

    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student) {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed(12345L);

        jdbcTemplate.update("INSERT INTO Students (id, name, age) VALUES (?, ?, ?)", secureRandom.nextInt(), student.getName(), student.getAge());
    }
}
