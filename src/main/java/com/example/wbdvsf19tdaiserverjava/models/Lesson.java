package com.example.wbdvsf19tdaiserverjava.models;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
	String id;
	String title;
	List<Topic> topics;
	
	public Lesson() {
		
	}
	
	public Lesson(String id) {
		this.id = id;
		this.title = "Default Title";
		this.topics = new ArrayList<Topic>();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Topic> getTopics() {
		return topics;
	}
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	
}
