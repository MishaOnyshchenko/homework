package com.example.jackson_demo.dao.repository;


import com.example.jackson_demo.dao.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GsonRepositoryTutor extends JpaRepository<Car, Long> {
}
