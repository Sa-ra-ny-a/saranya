package com.example.demo.studentrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.StudentBean;
@Repository

public interface StudentRepository extends JpaRepository<StudentBean, Integer> {

}
