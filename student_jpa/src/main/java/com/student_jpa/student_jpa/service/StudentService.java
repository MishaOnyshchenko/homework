package com.student_jpa.student_jpa.service;

import com.student_jpa.student_jpa.dao.entity.StudentEntity;
import com.student_jpa.student_jpa.dao.entity.StudentTask;
import com.student_jpa.student_jpa.dao.repository.StudentRepository;
import com.student_jpa.student_jpa.dto.StudentDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }


    public String addStudent(StudentDto studentDto) {

        StudentEntity entity = new StudentEntity();
        entity.setName(studentDto.getName());
        entity.setAge(studentDto.getAge());

        List<StudentTask> taskListService = new ArrayList<>(studentDto.getTaskListDto().size());

        for (StudentDto.TaskList taskDto : studentDto.getTaskListDto()) {
            try {
                StudentTask studentTask = new StudentTask();

                studentTask.setTitle(taskDto.getTitle());
                log.info("taskDto.getTitle: {}", taskDto.getTitle());

                taskListService.add(studentTask);
                log.info("taskListService.add(studentTaskList: {}", studentTask);

                entity.setStudentTaskList(taskListService);
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


    public StudentEntity findStudentByNameAndAge(String name, int age) {
        return studentRepository.findStudentByNameAndAge(name, age);
    }


    public StudentEntity getById(long id) {
        return studentRepository.findStudentById(id);
    }


    public StudentEntity getByName(String name) {
        return studentRepository.findStudentByName(name);
    }


    public StudentEntity updateStudent(long id, String name) {
        studentRepository.findStudentById(id).setName(name);
        return studentRepository.findStudentById(id);
    }


    public String deleteStudent(long id) {
        studentRepository.deleteById(id);
        return "student deleted: " + id;
    }
}
