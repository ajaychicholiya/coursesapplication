package com.practice.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.practice.entity.course;
import com.practice.practice.service.courseservice;

@RestController
public class mycontroller {
	
	@Autowired
	public courseservice cs;
	@GetMapping("/courses")
	public List<course>getcourses()
	{
		return this.cs.getcourses();	
	}
	@GetMapping("/courses/{courseId}")
	public course getsinglecourse(@PathVariable String courseId)
	{
		return this.cs.getsinglecourse(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
	public course addcourse(@RequestBody course c)
	{
		return this.cs.addcourse(c);
	}
	@PutMapping("/courses")
	public course updatecourse(@RequestBody course c)
	{
		return this.cs.updatecourse(c);
	}
	@DeleteMapping("/courses/{courseId}")
	public void deletecourse(@PathVariable String courseId)
	{
		this.cs.deletecourse(Long.parseLong(courseId));
	}
	
	
	

}
