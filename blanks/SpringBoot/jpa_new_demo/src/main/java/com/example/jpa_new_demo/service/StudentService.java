package com.example.jpa_new_demo.service;

import com.example.jpa_new_demo.dao.entity.StudentEntity;
import com.example.jpa_new_demo.dao.entity.TaskStudent;
import com.example.jpa_new_demo.dao.repository.StudentRepository;
import com.example.jpa_new_demo.dto.StudentDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(StudentDto studentDto) {

        StudentEntity entity = new StudentEntity();
        entity.setName(studentDto.getName());
        entity.setAge(studentDto.getAge());

        List<TaskStudent> taskListService = new ArrayList<>(studentDto.getTaskListDto().size());

        for (StudentDto.TaskList taskDto : studentDto.getTaskListDto()) {
            try {
                TaskStudent taskStudent = new TaskStudent();

                taskStudent.setTitle(taskDto.getTitle());
                log.info("taskDto.getTitle: {}", taskDto.getTitle());

                taskListService.add(taskStudent);
                log.info("taskListService.add(taskListStudent: {}", taskStudent);

                entity.setTaskListStudent(taskListService);
                log.info("taskListService: {}", taskListService);
            } catch (Exception e) {
                e.printStackTrace();
                log.error("taskList didn't saved to database");
            }
        }

        log.info(entity);
        try {
            studentRepository.saveAndFlush(entity);
            log.info("student saved");
            return "student saved";
        } catch (Exception e) {
            e.printStackTrace();
            log.error("student didn't saved");
            return "Error, student didn't saved";
        }
    }

    public List<StudentEntity> allStudents() {
        return studentRepository.findAll();
    }

    public StudentEntity findStudentByNameAndAge(String name, int age) {
        return studentRepository.findStudentByNameAndAge(name, age);
    }
}
