package com.example.wbdvsf19tdaiserverjava.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.wbdvsf19tdaiserverjava.models.Course;
import com.example.wbdvsf19tdaiserverjava.service.CourseService;


@RestController
@CrossOrigin("*")
public class CourseController {
	CourseService courseService = new CourseService();
    
    @PostMapping("/api/courses")
    public List<Course> createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }
    
    @GetMapping("/api/courses")
    public List<Course> findAllCourses() {
        return courseService.findAllCourses();
    }
    
    @GetMapping("/api/courses/{courseId}")
    public Course findCourseById(@PathVariable("courseId") String cid) {
        return courseService.findCourseById(cid);
    }
    
    @PutMapping("/api/courses/{courseId}")
    public Course updateCourse(
            @PathVariable("courseId") String cid,
            @RequestBody Course course) {
        return courseService.updateCourse(cid, course);
    }
    
    @DeleteMapping("/api/courses/{courseId}")
    public List<Course> deleteCourse(@PathVariable("courseId") String cid) {
    	return courseService.deleteCourse(cid);
    }
    
}