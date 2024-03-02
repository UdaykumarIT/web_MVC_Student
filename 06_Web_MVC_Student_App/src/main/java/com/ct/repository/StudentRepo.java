package com.ct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ct.entity.StudentEntity;

public interface StudentRepo  extends JpaRepository<StudentEntity, Integer>{

}
