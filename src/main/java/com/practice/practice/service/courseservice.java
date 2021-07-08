package com.practice.practice.service;

import java.util.List;



import com.practice.practice.entity.course;

public interface courseservice {
	public List<course>getcourses();
	public course getsinglecourse(long courseId);
	public course addcourse(course c);
	public course updatecourse(course c);
	public void deletecourse(long courseId);
	

}
