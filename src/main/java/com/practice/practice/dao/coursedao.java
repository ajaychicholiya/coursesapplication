package com.practice.practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.practice.entity.course;

public interface coursedao extends JpaRepository<course, Long> {

}
