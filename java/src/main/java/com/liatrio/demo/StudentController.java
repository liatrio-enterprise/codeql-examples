package com.liatrio.demo;

import com.liatrio.demo.dao.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
        System.out.println(id);
        return jdbcTemplate.queryForObject("SELECT * FROM Students WHERE id = ?", BeanPropertyRowMapper.newInstance(Student.class), id);
    }
}
