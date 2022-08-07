package com.BikkadIT.Repository;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.BikkadIT.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}

