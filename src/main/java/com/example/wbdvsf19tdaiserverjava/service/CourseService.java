package com.example.wbdvsf19tdaiserverjava.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.wbdvsf19tdaiserverjava.models.Course;
import com.example.wbdvsf19tdaiserverjava.models.Topic;
import com.example.wbdvsf19tdaiserverjava.models.Lesson;
import com.example.wbdvsf19tdaiserverjava.models.Module;


public class CourseService {
    static List<Course> courses = new ArrayList<Course>();
    
    static {
    	Topic topic1 = new Topic("topic-1");
    	topic1.setTitle("DOM");
    	Topic topic2 = new Topic("topic-2");
    	topic2.setTitle("Tags");
    	Topic topic3 = new Topic("topic-3");
    	topic3.setTitle("Attributes");
    	List<Topic> topics = new ArrayList<Topic>();
    	topics.add(topic1);
    	topics.add(topic2);
    	topics.add(topic3);
    	Lesson lesson1 = new Lesson("lesson-1");
    	lesson1.setTitle("HTML");
    	lesson1.setTopics(topics);
    	Lesson lesson2 = new Lesson("lesson-2");
    	lesson2.setTitle("CSS");
    	List<Lesson> lessons = new ArrayList<Lesson>();
    	lessons.add(lesson1);
    	lessons.add(lesson2);
    	Module module1 = new Module("module-1");
    	module1.setTitle("Week 1");
    	module1.setLessons(lessons);
    	Module module2 = new Module("module-2");
    	module2.setTitle("Week 2");
    	List<Module> modules = new ArrayList<Module>();
    	modules.add(module1);
    	modules.add(module2);
    	Course course1 = new Course("course-1");
    	course1.setTitle("CS5610");
    	course1.setModules(modules);
    	Course course2 = new Course("course-2");
    	course2.setTitle("CS5200");
    	Course course3 = new Course("course-3");
    	course3.setTitle("CS5200");    	
    	Course course4 = new Course("course-4");
    	course4.setTitle("CS5200");    	
    	Course course5 = new Course("course-5");
    	course5.setTitle("CS5200");    	
    	Course course6 = new Course("course-6");
    	course6.setTitle("CS5200");    	
    	courses.add(course1);
    	courses.add(course2);
    	courses.add(course3);
    	courses.add(course4);
    	courses.add(course5);
    	courses.add(course6);
    	
    }
    
    public List<Course> createCourse(Course course) {
        courses.add(course);
        return courses;
    }
    
    public List<Course> findAllCourses() {
        return courses;
    }
    
    public Course findCourseById(String cid) {
        for(Course c: courses) {
            if(c.getId().equals(cid))
                return c;
        }
        return null;
    }
    
    public Course updateCourse(String cid,
    						   Course course) {
		Course target = null;
		for (Course c : courses) {
			if (c.getId().equals(cid)) {
				target = c;
				break;
			}
		}
		courses.remove(target);
		courses.add(course);
        return course;
    }
    
    public List<Course> deleteCourse(String cid) {
    	courses = courses
    			.stream()
    			.filter(course -> !course.getId().equals(cid))
    			.collect(Collectors.toList());
    	return courses;
    }    
}
