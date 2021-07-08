package com.practice.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.practice.dao.coursedao;
import com.practice.practice.entity.course;
@Service
public class courseserviceimpl implements courseservice {
	@Autowired
	private coursedao cd;

	public List<course> getcourses() {
		
		return cd.findAll();
	}

	public course getsinglecourse(long courseId) {
		
		course d=cd.getById(courseId);
		return d;
	}

	public course addcourse(course c) {
		return cd.save(c);
	}

	
	public course updatecourse(course c) {
		// TODO Auto-generated method stub
		return cd.save(c);
	}

	public void deletecourse(long courseId) {
		// TODO Auto-generated method stub
		course old=cd.getById(courseId);
		cd.delete(old);
	}
	

}
