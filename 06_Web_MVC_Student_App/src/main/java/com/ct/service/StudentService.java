package com.ct.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.binding.Student;
import com.ct.entity.StudentEntity;
import com.ct.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;

	public boolean saveStudent(Student student) {
		System.out.println(student);
		StudentEntity entity = new StudentEntity();

		// copy one object to another
		BeanUtils.copyProperties(student, entity);

		entity.setTimings(Arrays.toString(student.getTimings()));
		System.out.println(entity);
		repo.save(entity);

		return true;

	}

	public List<String> getCourses() {

		return Arrays.asList("java", "python", "selenium");
	}

	public List<String> getTimings() {

		return Arrays.asList("Morning", "afternoon", "Evening");
	}
}
